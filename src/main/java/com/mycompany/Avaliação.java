package com.mycompany;

public class Avaliação {
    public static void main(String[] args) {
       /**
        * atividade 1
        */
       float soma = 46 + 45 + 20 + 9;

       float media = soma / 4;
       System.out.println("1) A média é " + media);

       /**
        * atividade 2
        */
        double PI = 3.14;
        double raio = 25.0;
        double areapt1 = (raio * raio);
        double areapt2 = areapt1 * PI;
        System.out.println("2) A area é: " + areapt2);

        /**
         * atividade 3
         */
         double precooriginal = 1200;
         double precoreajuste = 30;

         double valorreajuste = (precoreajuste / 100) * precooriginal;
         double novoPreco = precooriginal + valorreajuste;
         System.out.println("3) Novo preço após o reajuste: R$ " + novoPreco);

       /**
        * atividade 4
        */
        double produto = 850;
        double desconto = 30;
        double valorDescontado = produto - ((desconto / 100) * produto);
        System.out.println("4) O valor de desconto é: R$" + valorDescontado); 

    }
    
}
