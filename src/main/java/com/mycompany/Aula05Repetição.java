package com.mycompany;

import java.util.Scanner;

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
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);

        }

        // Decremento
        System.out.println("Contagem Regressiva...");
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("Boom !!!");

        /**
         * Clase Scanner
         * 
         * É utilizado para ler valores do usuario inseridas pelo prompt.
         */
        // Scanner scan = new Scanner(System.in); // Cria o scaner
        // System.out.println("Dijite um número: ");

        // int numero = scan.nextInt(); //le o valor dijitado e captrado pelo scanner
        // System.out.println("Você dijitou " + numero + " !!!");

        /**
         * while (enquanto)
         * 
         * Enquanto a condição for verdadeira o código sera exxecutado
         * diferente da proxima estrutura, essa faz a validação da execução
         */

        int num1 = 1;

        while (num1 != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: (0 para parar)");

            num1 = scan.nextInt();

            System.out.println("Você digitou " + num1 + " !!");
        }

        System.out.println("Execução encerrada");

        /**
         * Do While (execute, enquanto)
         * 
         * É executado uma extrutura de codigo e apos é validado a condição
         */

        int num2 = 1;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Dijite um número: (0 para parar)");

            num2 = scan.nextInt();
        } while (num2 != 0);

        System.out.println("Execução encerrada");
    }
}
