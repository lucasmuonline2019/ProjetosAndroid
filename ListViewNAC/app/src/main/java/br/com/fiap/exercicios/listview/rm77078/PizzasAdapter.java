package br.com.fiap.exercicios.listview.rm77078;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class PizzasAdapter extends BaseAdapter {
    Context context;
    List<Pizzas> pizzas;

    public PizzasAdapter(Context context, List<Pizzas> pizzas){
        this.context = context;
        this.pizzas = pizzas;
    }

    @Override
    public int getCount() {

        return this.pizzas.size();
    }

    @Override
    public Object getItem(int position) {

        return (Object)this.pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Pizzas pizzas = this.pizzas.get(position);

        View v = layoutInflater.inflate(R.layout.listview_pizzas, null);
        ImageView imgPizza = (ImageView)v.findViewById(R.id.imgPizza);
        TextView txtNomePizza = (TextView)v.findViewById(R.id.txtNomePizza);
        TextView txtValorPizza = (TextView)v.findViewById(R.id.txtValorPizza);
        //TextView txtPontuacao = (TextView)v.findViewById(R.id.txtPontuacao);

        imgPizza.setImageResource(pizzas.getImagem());
        txtNomePizza.setText(pizzas.getNome());
        txtValorPizza.setText(pizzas.getValor());
        //txtPontuacao.setText(pizzas.getPontuacao());

        return v;
    }
}
