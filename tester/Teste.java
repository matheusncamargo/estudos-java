package Aula_03.tester;

import java.util.Arrays;
import java.util.Objects;

public class Teste {
    Idade idade;
    int[] idades = {5, 10, 15, 18, 35, 70, 16, 17, 80};
    String[] mensagensResultados = new String[idades.length];
    int[] falha = new int[9];

    public String testarIdade(){
        for (int i = 0; i < idades.length; i++){
            idade = new Idade(idades[i]);

            String resultado = idade.votaOuNao();
            String resultadoEsperado = "";

            //Teste de idade
            if (idades[i] < 16) resultadoEsperado =  "Não pode votar";
            else if (idades[i] < 18) resultadoEsperado =  "Voto opcional";
            else if (idades[i] <= 70) resultadoEsperado =  "Obrigatório";
            else resultadoEsperado =  "Voto opcional";

            //Comparando resultado com resultado esperado
            if (Objects.equals(resultado, resultadoEsperado)){
                mensagensResultados[i] = "Sucesso";
                System.out.println("Teste[" + (i+1) + "] - Sucesso");
            } else {
                System.out.println("Teste[" + (i+1) + "] - Falha");
            }

            //Adicionando elementos diferente de "sucesso" - no array "falha"
            if(!Objects.equals(mensagensResultados[i], "Sucesso")){
                falha[i] = i+1;
            }
        }

        //Removendo os zeros do Array "falha"
        int[] falhaSemZero = Arrays.stream(falha).filter(num -> num != 0).toArray();

        //Imprimindo os testes que falharam
        System.out.println("\nOs seguintes testes falharam:");
        for (int i = 0; i < falhaSemZero.length; i++){
            System.out.println("Teste "
                    + falhaSemZero[i]
                    + " - Resultado: "
                    + mensagensResultados[i]);
        }

        //System.out.println(Arrays.toString(mensagensResultados));
       //System.out.println(Arrays.toString(falhaSemZero));
        return "";
    }
}
