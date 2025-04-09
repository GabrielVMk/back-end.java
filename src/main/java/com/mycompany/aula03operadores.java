package com.mycompany;

public class aula03operadores {

    public static void main(String[] args) {
        /**
         * Tipos de Comentários
         * multiplas
         * linhas
         */
        
        //Comentário de linha

        /**
         * Declaração de variaveis
        */

        String var1; //Toda variável declarada sem  valor, automaticamente é null,
        String var2 = null; //Variável declarada com valor null,
        String var3 = ""; //Variável declarada com valor vazio(diferente de null)

        /**
         * Operadores 
         * Matemeticos
         */

        int num1 = 10;
        int num2 = 2;

        //soma
        int soma = num1 + num2;
        System.out.println("A soma entre " + num1 +" e " + num2 + " é: " + soma);

        //subtração
        int subtracao = num1 - num2;
        System.out.println("A subtração de " + num1 + " por " + num2 +  " É: " + subtracao); 

        //multiplicação
        int multiplicacao = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " por " + num2 + " é: " + multiplicacao);

        //divisão
        int divisao = num1 / num2;
        System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + divisao);



    }
}


