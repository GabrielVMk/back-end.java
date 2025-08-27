package com.mycompany.poo.Aula11;

public class pessoa {
 /**
    * Encapsuladores (Métodos acessores/Modificadores)
    * 
    * Em projetos de grande escala, para termos a segurança de nossas classes,
    * utilizamos o modificador  de acesso privado, com uma maior frequencia.
    * 
    * Em muitas situações prescisamos buscar e alterar  uma ou mais informações.
    * e é nesse cenãrio que utilizamos os métodos:
    *--Getter: Acessar/Buscar
    *--Setter: Modificar/Alterar
    */
    private String nome;
    private int idade; 
    private double salario;
    private double altura;

    //Declaramos sempre após a declaração dos atributos

    //Método acessor, sempre começae com get.
    public String getNome() {
        return nome;
    }
    //Método modificador, sempre começa com set.  
    public void setNome(String nome){
        this.nome = nome;
    }

    //Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    //Salário
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    //Altura
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

}
    
                   

