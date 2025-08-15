package com.mycompany.avaliacao_back_end;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class ContaBancaria {
    public int numero;
    public String titular;
    public double saldo = 0;
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

    public void exibirSaldo(){
        System.out.println("O saldo é: " + this.saldo);

    }

    public void depositar (double valor){
        saldo += valor ;

    }

    public void sacar(double valor){
        saldo -= valor;
    }

    
    }


