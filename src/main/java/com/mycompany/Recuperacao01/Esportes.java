package com.mycompany.Recuperacao01;

public abstract class Esportes {

    private String nome;
    private int numeroJogador;

    public Esportes() {

    }

    public Esportes(String nome, int numeroJogador){
        this.nome = nome;
        this.numeroJogador = numeroJogador;
    }

    public abstract void IniciarPartida();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnumeroJogador() {
        return numeroJogador;
    }

    public void setnumeroJogador(int numeroJogador) {
        this.numeroJogador = numeroJogador;
    }


}