package br.com.fiap.exercicios.listview.rm77078;

import java.io.Serializable;

/**
 * Created by logonrm on 30/03/2017.
 */

public class Pizzas implements Serializable{
    private String nome;
    private String descricao;
    private int imagem;
    private String valor;
    private String alimentosAlergicos;
    private int pontuacao;

    public Pizzas(String nome, String descricao, int imagem, String valor, String alimentosAlergicos, int pontuacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.valor = valor;
        this.alimentosAlergicos = alimentosAlergicos;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getAlimentosAlergicos() {
        return alimentosAlergicos;
    }

    public void setAlimentosAlergicos(String alimentosAlergicos) {
        this.alimentosAlergicos = alimentosAlergicos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
