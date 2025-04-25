package com.mycompany;

public class Aula05Repetição {
    public static void main(String[] args) throws InterruptedException {
        /**
         * For (para)
         * 
         * Para cada elemento repita
         * 
         * 1 variavel de intenção
         * 2 condição de parada 
         * 3 incerção ou decremento
         * 
         */
        for (int i = 0;i <= 10; i = i + 2){
            System.out.println(i);

        }

        //Decremento
        System.out.println("Contagem Regressiva...");
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("Boom !!!");
    }
}
