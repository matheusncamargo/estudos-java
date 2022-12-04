package Aula_07;

import java.util.List;

public class Contato {
    //Atributos pertencentes a Classe "contato":
    public String nome;
    public String sobreNome;
    public String empresa;
    public String email;
    public List<Telefone> telefones;

    public Contato (String nome, String sobreNome, String empresa, String email, List<Telefone> telefones){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.empresa = empresa;
        this.email = email;
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s \n" +
                        "Sobrenome: %s \n" +
                        "Empresa: %s \n", nome, sobreNome, empresa
        );
    }



    //Usando String Builder:

/*
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(
                "Nome: %s \n" +
                        "Sobrenome: %s \n" +
                        "Empresa: %s \n", nome, sobreNome, empresa
        ));

        sb.append("Telefones \n");
        telefones.forEach(tel -> sb.append(tel.toString()).append("\n"));
        return sb.toString();
    }

 */



}
