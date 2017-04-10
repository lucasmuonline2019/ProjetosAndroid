package segundotina.fiap.com.br.desafiocabralandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Desafio extends AppCompatActivity {

    private ImageView imagensRandom;
    private int[] jogar = {
            R.drawable.apple1,
            R.drawable.apple2,
            R.drawable.apple3,
            R.drawable.apple4,
            R.drawable.apple5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio);

        imagensRandom = (ImageView) findViewById(R.id.imagens);
    }

    public void selecionar (View v) {
        Random r = new Random();
        int embaralhar = r.nextInt(5);
        imagensRandom.setImageResource(jogar[embaralhar]);
    }
}
