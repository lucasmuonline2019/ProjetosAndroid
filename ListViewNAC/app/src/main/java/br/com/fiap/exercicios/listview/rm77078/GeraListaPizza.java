package br.com.fiap.exercicios.listview.rm77078;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraListaPizza {
    public static List<Pizzas> geraPizzas(){
        List<Pizzas> pizzas = new ArrayList<>();

        pizzas.add(new Pizzas("PizzApp de Mussarela",
                "Ingredientes \n" +
                "\n 250 gramas de farinha de trigo \n" +
                "\n 1 e 1/2 copo de água ou leite \n" +
                "\n 1 tablete ou 3 colheres de fermento \n" +
                "\n 3 colheres (sopa) de azeite de oliva \n" +
                "\n 3 tomates \n" +
                "\n Pimenta, sal e orégano a gosto e azeitonas. \n",
                R.drawable.mussarela,
                "R$ 22,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                5));

        pizzas.add(new Pizzas("PizzApp de Calabresa",
                "Ingredientes " +
                "\n 1 disco de massa de pizza preassado \n" +
                "\n 2 linguiça calabresa defumada cortadas em rodelas \n" +
                "\n 4 tomate em rodelas \n" +
                "\n 150 gramas de queijo mussarela \n " +
                "\n 3 colheres (sopa) de molho de tomate \n" +
                "\n cebola fatiada a gosto \n" +
                "\n azeitona a gosto \n" +
                "\n orégano a gosto \n",
                R.drawable.calabresa,
                "R$ 21,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                3));

        pizzas.add(new Pizzas("PizzApp de Frango Catupiry \n",
                "Ingredientes \n " +
                "\n 2 xícaras de água \n" +
                "\n 1 massa de pizza \n" +
                "\n 1 colher de orégano \n" +
                "\n 400g de peito de frango \n" +
                "\n 400g de queijo catupiry \n" +
                "\n 1 pitada de sal \n" +
                "\n 1 colher de salsa \n" +
                "\n 4 tomates \n",
                R.drawable.catupiry,
                "R$ 42,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                4));

        pizzas.add(new Pizzas("PizzApp Portuguesa",
                "Ingredientes \n" +
                "\n 150 g de queijo mussarela. \n" +
                "\n 50 g de presunto. \n" +
                "\n 1 tomate em rodelas. \n" +
                "\n 1 ovo cozido. \n" +
                "\n 1 cebola picada. \n" +
                "\n Molho de tomate. \n" +
                "\n Azeitonas para decorar, orégano e tempero verde a gosto. \n",
                R.drawable.portuguesa,
                "R$ 33,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.", 4));

        pizzas.add(new Pizzas("PizzApp de Milho",
                "Ingredientes \n " +
                "\n 3 xicaras de chá de farinha de milho \n" +
                "\n 3 colheres de sopa de margarina \n" +
                "\n Sal a gosto \n" +
                "\n Recheio \n" +
                "\n 2 dentes de alho \n" +
                "\n 2 colheres de sopa de cebola \n" +
                "\n 2 colheres de sopa de azeite \n" +
                "\n 2 espigas de milho \n" +
                "\n 1 xicara de chá de leite \n" +
                "\n 1\2 colher de sopa de amido de milho \n" +
                "\n 1 colher de sopa de salsa \n" +
                "\n Sal a gosto \n" +
                "\n Cobertura \n" +
                "\n 3 rodelas de tomate \n" +
                "\n 3 fatias de queijo mussarela \n" +
                "\n Orégano a gosto \n",
                R.drawable.milho,
                "R$ 25,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                2));

        pizzas.add(new Pizzas("PizzApp de Bacon",
                "Ingredientes \n" +
                "\n 2 xícaras (chá) de molho de tomate \n" +
                "\n 410g de catupiry \n" +
                "\n 1/2 xícaras (chá) de bacon picado e frito \n" +
                "\n Azeitonas e orégano a gosto \n" +
                "\n Massa \n" +
                "\n 50g de fermento biológico fresco \n" +
                "\n 1/2 colher (sopa) de açúcar \n" +
                "\n 1/2 colher (sopa) de sal \n" +
                "\n 1 ovo \n" +
                "\n 1 xícara (chá) de água morna \n" +
                "\n 2 colheres (sopa) de óleo \n" +
                "\n 3 xícaras (chá) de farinha de trigo \n",
                R.drawable.bacon,
                "R$ 35,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                5));

        return pizzas;
    }
}
