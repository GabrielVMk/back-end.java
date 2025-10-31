package com.mycompany.Recuperacao01;

public class Basquete extends Esportes {
    public Basquete(String nome, int numeroJogador) {
        super(nome, numeroJogador);
}
    


    @Override
    public void IniciarPartida() {
        System.out.println("A bola sobe, começa o jogo de basquete!");
    }
    
}
