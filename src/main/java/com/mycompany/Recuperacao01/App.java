package com.mycompany.Recuperacao01;


public class App {
public static void main(String[] args) {
        Esportes basquete = new Basquete("basquete", 7);
        System.out.printf("%s é jogo, %d é o n° de jogadores ",
        basquete.getNome(), basquete.getnumeroJogador());
        basquete.IniciarPartida();

        Esportes futebol =  new Futebol("futebol", 12);
        System.out.printf("%s é jogo, %d é o n° de jogadores ",
        futebol.getNome(), futebol.getnumeroJogador());
        futebol.IniciarPartida();
        
}
    
    
}
