package br.com.fiap.exercicios.listview.rm77078;

import android.support.v7.app.ActionBar;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class PizzaActivity extends AppCompatActivity {
    ImageView imgPizza;
    TextView txtNome;
    TextView txtDescricao;
    TextView txtAlimentosAlergicos;
    RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizzas pizza = (Pizzas) getIntent().getExtras().get("pizza");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(pizza.getNome());
        actionBar.setDisplayHomeAsUpEnabled(true);


        imgPizza = (ImageView)findViewById(R.id.imgPizza);
        txtNome = (TextView)findViewById(R.id.txtNomePizza);
        txtDescricao = (TextView)findViewById(R.id.txtDescricao);
        txtAlimentosAlergicos = (TextView)findViewById(R.id.txtAlimenstosAlergicos);
        ratingbar = (RatingBar)findViewById(R.id.rtbPontuacao);


        imgPizza.setImageResource(pizza.getImagem());
        txtNome.setText(pizza.getNome());
        txtDescricao.setText(pizza.getDescricao());
        txtAlimentosAlergicos.setText(pizza.getAlimentosAlergicos());
        ratingbar.setRating(pizza.getPontuacao());
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}