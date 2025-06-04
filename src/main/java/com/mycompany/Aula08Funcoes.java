package com.mycompany;

public class Aula08Funcoes {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println("---Tabuada do " + numero + "---");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + multiplicacao(numero, i));
        }

        System.out.println(fatorial(numero));
    }

    /**
     * Não posso declarar método dentro de outor método.
     * 
     * Toda função deve ter um retorno, quando não há retorno usamos void.
     * 
     * Uma função não pode ter parâmetros, ou ter 1 ou mais.
     */

    public static int multiplicacao(int num, int num2) {
        return num * num2;
    }


    /**
     * Funções recursivas.
     * 
     * uma função recursiva faz uma chamada para ela própria
     * 
     * porém toda recursividade deve ter um ponto de parada,
     * caso contrário pode redultar em um loop infinito
     * 
     */

     public static int fatorial(int n) {
        if (n != 0) {
            return n * fatorial(n -1);
        } else {
            return 1;
        }
    }
}    