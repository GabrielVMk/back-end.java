
package com.mycompany;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dijite um número: ");

        int numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println( i * numero);
        }

    }
}