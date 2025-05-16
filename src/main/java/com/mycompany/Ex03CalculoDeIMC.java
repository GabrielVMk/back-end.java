package com.mycompany;

import java.util.Scanner;

public class Ex03CalculoDeIMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.1f", imc);

        if (imc < 16) {
            System.out.println("Magreza Grau III");
        } else if (imc >= 16 && imc <= 16.9) {
            System.out.println("Magreza Grau II");
        } else if (imc >= 17 && imc <= 18.4){
            System.out.println("Magreza Grau I");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Eutrofia");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Pré-obesidade");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade moderarda (Grau I)");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade severa (Grau II)");
        } else {
            System.out.println("Obesidade muito severa (Grau III)");
        } 
    }
}
