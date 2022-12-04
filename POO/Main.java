package Aula_07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Um contato pode ter vários telefones, por isso fazemos uma lista "telefones"
        List<Telefone> telefones = new ArrayList<>();

        Telefone telefone1 = new Telefone(TelefoneTipo.RESIDENCIAL, "+55", "011", "99875463");
        /* telefone1.tipo = TelefoneTipo.RESIDENCIAL;
        telefone1.ddi = "+55";
        telefone1.ddd = "011";
        telefone1.numero = "99875463";*/
        telefones.add(telefone1);

        Telefone telefone2 = new Telefone(TelefoneTipo.COMERCIAL, "+55", "011", "36815548");
        /* telefone2.tipo = TelefoneTipo.COMERCIAL;
        telefone2.ddi = "+55";
        telefone2.ddd = "011";
        telefone2.numero = "36815548";*/
        telefones.add(telefone2);

        Contato contato = new Contato("Matheus", "Camargo", "Cia Telefônica", "mthnogueira@gmail.com", telefones);
        /* contato.nome = "Matheus";
        contato.sobreNome = "Camargo";
         contato.telefones = telefones;*/

        //System.out.println(telefone1);
        System.out.println(contato);
        contato.telefones.forEach(tel -> System.out.println(tel));
        //Testar String Builder construído em "Contato"
    }
}
