package com.mycompany.poo.aula10;

public class App {
    public static void main(String[] args) {
        Pessoa Pessoa = new Pessoa();
        Pessoa.nome = "Gabriel";
        Pessoa.idade = 17;
        //Pessoa.salario = 1.000; atributos privados não são viziveis.

        //Instanciando classes que estao declaradas privadas em outros arquivos
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Almeida";
        pessoa1.idade = 52;
        pessoa1.altura = 1.83;

        pessoa2.nome = "Jamal";
        pessoa2.idade = 59;
        pessoa2.altura = 1.76;

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        pessoa1.atribuirSalario(2000.0, 500);
        pessoa2.atribuirSalario(3500);

        /*System.out.println("---Dados da pessoa---");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("altura: " + pessoa1.altura);*/
    }
}
