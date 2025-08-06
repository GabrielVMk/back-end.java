package com.mycompany.poo.aula10;

import javax.print.DocFlavor.STRING;


public class Pessoa {
    /**
     * Modificadores de acesso:
     * 
     * Quando trabalhando com o conceito de POO, utilizamos modifiadores de acesso
     * para dar segurança apara nossas classes.
     * 
     * Utilizamos elas como prefixos para:
     * -Classes 
     * -Inerfaces
     * -Atributos 
     * -Métodos 
     */
    public String nome; //Público, visivel para qualquer classe.
    protected int idade; //Protejido, é visivel somente em classes filhas (herança)
    private double salario; //Privado, somente dentro da propria classe.
    double altura; //Friendly ou Público, apesar de não estar explicado. ele tb é visivel.

    public void exibirDados() {
        System.out.println("---Dados da pessoa---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("altura: " + altura);
    }

    /**
     * Nomenclatura de Metodos:
     * 
     * Método/função indica ação, e por padão utiizamos verbos.
     * 
     * Ex: Correr, andar, caminhar ...
     * 
     */

    public void atribuirSalario(double valor) {
        this.salario = valor;

        System.out.println("O novo salário de " + this.nome + " é: " + this.salario);
    }

    public void atribuirSalario(double valor, double bonus){
        this.salario = valor + bonus;

        System.out.println("O novo salário de " + this.nome + " é: " + this.salario + " mais um bonus de " + bonus);
    }
}

