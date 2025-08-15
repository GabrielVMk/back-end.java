package com.mycompany.avaliacao_back_end;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.numero = 20022;
        conta1.titular = "joselio";
        conta1.saldo = 000;
        conta1.extrato.add("zero");

        conta1.depositar(valor:10);

        conta1.exibirDados();
    }

        conta2.numero = ;
        conta2.titular = "jonas";
        conta2.extrato.add("zero")
        conta.depositar(valor:20);

        conta.transferencia(conta2, valor:10)

        conta.exibirSaldo();
        conta2.exibirSaldo();

        

    public static class ContaBancaria {
        public int numero;
        public String titular;
        public double saldo;
        public List<String> extrato;
        public boolean ativa;

        public ContaBancaria() {
            this.extrato = new ArrayList<>();
        }

        public void exibirDados() {
            System.out.println("---Dados da pessoa---");
            System.out.println("Número: " + numero);
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: " + saldo);
            System.out.println("Extrato: " + extrato);

        }


    
    }

}
