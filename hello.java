/*
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.time.LocalDateTime;
 */
import java.util.Arrays;
import java.util.Scanner;



/*
import java.util.Arrays;

public class Hello{
    public class static void main(String[] args){

        //Array de Números
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Array de Letras
        String[] letras = new String[5];

        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        //Outra forma de escrever arrays
        String[] letras2 = {"A", "B", "C", "D"};
        int[] numeros3 = {2,3,5,6,7};

        //Imprimir arrays #1
        for (int i = 0; i<letras2.length; i++){
            System.out.println(letras2[i]);
        }

        //Imprimir arrays #2
        System.out.println(Arrays.toString((letras2)));
        System.out.println(Arrays.toString(numeros3));
    }
}
/*



/*
              String name = "Matheus";
        String message;
        int nota = 5;


        if (nota > 5){
            message = "Aprovado";
        } else if (nota < 3){
            message = "Reprovado";
        } else {
            message = "Em recuperação";
        }

        System.out.println(message);
        System.out.println("Hello World");
        System.out.println("Hello " + name);
 */

/*
        String nome = "Matheus";
        String outroNome = "matheus";

        System.out.println(nome.equals(outroNome));
 */

/*
// Olá (nome). Hoje é (dia da semana), Bom dia/Boa tarde/Boa noite.

        String nome = "Matheus";

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();
        Locale brasil = new Locale("pt", "BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        float horas = agora.getHour();

        if (horas > 0 && horas < 12){
            saudacao = "Bom dia!";
        } else if (horas >= 12 && horas < 18){
            saudacao = "Boa tarde!";
        } else{
            saudacao = "Boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
        System.out.println(agora
        );

 */

/*
  for (int i = 0; i <= 10; i++ ){
            for (int x = 0; x <= 10; x++){
                System.out.println( i + " x " + x + " = " + x * i);
            }
        }
 */

/*
 //Array de Números

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Array de Letras
        String[] letras = new String[5];

        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        //Outra forma de escrever arrays
        String[] letras2 = {"A", "B", "C", "D"};
        int[] numeros3 = {2,3,5,6,7};

        //Imprimir arrays #1
        for (int i = 0; i<letras2.length; i++){
            System.out.println(letras2[i]);
        }

        //Imprimir arrays #2
        System.out.println(Arrays.toString((letras2)));
        System.out.println(Arrays.toString(numeros3));
 */

/*
  //Linguagem fortemente tipada, não pode misturar tipos dentro de um mesmo ARRAY
        int[] numeros = {3, 4, 5, 11, 25, 12, 13, 15};
        int maior = numeros[0];
        int menor = numeros[0];
        int media;
        int soma = 0;


        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }

            if (numeros [i] < menor){
                menor = numeros[i];
            }

            soma += numeros[i];
        }

        media = soma / numeros.length;

        System.out.printf("Maior: %s, Menor: %s, Média: %s", maior, menor, media);
 */

/*
public class Hello {
    public static void main(String[] args){
        // Funções -> "Métodos"
        String nome2 = "Matheus";
        saudacao(nome2);
    }

    public static void saudacao(String nome1){
        System.out.println("Hello " + nome1);
    }
}
 */

/*
public class Hello {
    public static void main(String[] args){

        int resultado = soma(15, 45);
        System.out.println(resultado);
    }
        public static int soma(int n1, int n2){
            return n1 + n2;
    }
}
 */

/*
Questão 1.
Escreva um programa que informa a tabuada de multiplicação de um número informado pelo
usuário (entre 1-10). Exemplo:

import java.util.Scanner;


import java.util.Scanner;

public class Hello {
    public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero = teclado.nextInt();

    for (int i = 0; i <= 10; i++){
        System.out.println(numero + " x " + i + " = " + numero *i);
    }

    }
}
 */

/*
Questão 2.
Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
9/5) + 32 = 32 °F. Exemplo:

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em C: ");
        int celsius = input.nextInt();

        System.out.println(conversor(celsius));
    }

    public static float conversor(float temperatura){
        return (temperatura * 9/5) + 32;
    }
}
 */

/*
Questão 3.
Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
da entrada dos 5 itens, exiba a lista completa. Exemplo:



public class Hello{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o item 01: ");
        String item1 = input.nextLine();

        System.out.println("Digite o item 02: ");
        String item2 = input.nextLine();

        System.out.println("Digite o item 03: ");
        String item3 = input.nextLine();

        System.out.println("Digite o item 04: ");
        String item4 = input.nextLine();

        System.out.println("Digite o item 05: ");
        String item5 = input.nextLine();

        //Array lista de compra
        String[] listaCompras = new String[5];
        listaCompras[0] = item1;
        listaCompras[1] = item2;
        listaCompras[2] = item3;
        listaCompras[3] = item4;
        listaCompras[4] = item5;

        System.out.println("As frutas do seu carrinho são: ");
        System.out.println(Arrays.toString(listaCompras));


    }
}
 */

/*
Questão 04

public class Hello{
    public static void main(String[] args){
        String[] listaPromocao = new String[] {"Banana", "Ovo", "Leite", "Macarrão"};

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu item: ");

        String item = input.nextLine();

        if (Arrays.asList(listaPromocao).contains(item)){
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje!");
        } else {
            System.out.println("Infelizmente essa fruta não está em promoção");
        }
    }
}
 */
