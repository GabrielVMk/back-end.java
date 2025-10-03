package com.mycompany.poo.aula13.animais;

/**
 * Classe abstrata:
 * 
 * Toda classe abstrata somente servirsra de modelo ou molde para herança em outras classes
 * por ser abstrata, não pode ser instanciada
 */

public abstract class animal {
    private String nome;
    private double altura;
    private double peso;

    public animal() {

    }

    public animal(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}


