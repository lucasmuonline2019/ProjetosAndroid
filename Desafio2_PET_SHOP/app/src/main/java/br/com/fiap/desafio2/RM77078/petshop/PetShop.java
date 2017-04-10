package br.com.fiap.desafio2.RM77078.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PetShop extends AppCompatActivity {

    double bordercollie = 800.00;
    double pitbull = 750.00;
    double pastoralemao = 700.00;
    double pastorcanadense = 800.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_shop);
    }
}
