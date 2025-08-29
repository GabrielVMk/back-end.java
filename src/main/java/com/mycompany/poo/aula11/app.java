package com.mycompany.poo.aula11;

import com.mycompany.poo.aula10.Pessoa;

public class app {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa();

        //Modificar o valor 
        pessoa.setNome("gabriel");
        pessoa.setIdade(17);

        //Acessa o valor
        System.out.printf("%s tem %d anos de idade\n",
        pessoa.getNome(), pessoa.getIdade());
    }
}
