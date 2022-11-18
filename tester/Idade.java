package Aula_03.tester;

import java.util.Scanner;

public class Idade {
    private int idade;
    private String mensagem;

    public Idade(int idade){
        this.idade = idade;
    }

    public String votaOuNao(){
        if (idade < 0) mensagem = "Idade inválida";
        else if (idade < 16) mensagem = "Não pode votar";
        else if (idade < 18) mensagem = "Voto opcional";
        else if (idade <= 70) mensagem = "Obrigatório";
        else mensagem = "Voto opcional";
        return mensagem;
    }
}
