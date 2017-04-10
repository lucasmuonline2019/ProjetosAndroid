package br.com.fiap.exercicios.listview.rm77078;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

        SharedPreferences sp;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splashscreen);

            sp = getSharedPreferences("Preferencias", MODE_PRIVATE);

            int splashTime = sp.getInt("splashTime", 3000);
            boolean disable = sp.getBoolean("desativarSplash", false);

            if( !disable ) {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadMainActivity();
                    }
                }, splashTime);
            } else {
                loadMainActivity();
            }
        }

    public void loadMainActivity() {
        Intent it = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(it);

        finish();
    }
}
