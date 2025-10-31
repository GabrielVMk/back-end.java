package com.mycompany.Recuperacao01;

public class Futebol extends Esportes {

    public Futebol(String nome, int numeroJogador) {
        super(nome, numeroJogador);
    }
    
    @Override
    public void IniciarPartida() {
        System.out.println("O juiz apita e a bola começa a rolar!");
    }
}
