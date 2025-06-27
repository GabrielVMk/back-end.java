package com.mycompany;

public class Aula09Objetos {
    public static void main(String[] args) {
        /**
         * Em java, toda classe do tipo abstrado é um objeto. 
         * Pois possuem caracteristicas e funcionalidades.
         * 
         * Eles herdam da classe mãe java.lang.object, é correto afirmar que java.lang.object é uma super classe de qualquer 
         * outra classe ou tipo abstrato.
         */
         Integer numero = 10;
         int numero2 = 3;
         // retorna se a variavel/classe é uma intancia de outra classe.
         System.out.println(numero instanceof object);

         //Metodo 2 pertence ao tipo abstrato Integer.
         numero.compareTo(numero2);
         
    }
    
}
