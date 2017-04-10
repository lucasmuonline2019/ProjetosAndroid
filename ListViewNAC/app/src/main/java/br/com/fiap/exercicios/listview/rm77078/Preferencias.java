package br.com.fiap.exercicios.listview.rm77078;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class Preferencias extends AppCompatActivity {

    SharedPreferences sp;
    EditText campoSplash;
    Switch desativarSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        campoSplash = (EditText) findViewById(R.id.campoSplash);
        desativarSplash = (Switch) findViewById(R.id.desativarSplash);
        sp = getSharedPreferences("Preferencias", MODE_PRIVATE);

        campoSplash.setText(String.valueOf( sp.getInt("splashTime", 3000) ));
        desativarSplash.setChecked( sp.getBoolean("desativarSplash", false) );

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void savePreferences(View view) {
        int time = Integer.valueOf(campoSplash.getText().toString());
        boolean disable = desativarSplash.isChecked();

        SharedPreferences.Editor e = sp.edit();
        e.putBoolean("desativarSplash", disable);
        e.putInt("splashTime", time);
        e.commit();
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void salvar(View view) {

    }
}
