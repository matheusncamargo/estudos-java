/*
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Stream;
 */

import java.util.Scanner;

public class Hello{
    public static void main (String[] args){


    }
}

/*
Lista02 - WHILE - ex03
public class Hello{
    public static void main (String[] args){

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite os valores: ");
        int n = ipt.nextInt();

        while ( n != 4){
            if (n == 1){
                alcool++;
            } else if (n == 2){
                gasolina++;
            } else if (n == 3){
                diesel++;
            }
            n = ipt.nextInt();

        }

        System.out.println("Muito Obrigado!");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
        ipt.close();
    }
}
 */

/*
Lista02 - WHILE - ex02
public class Hello{
    public static void main (String[] args){

        Scanne
        r ipt = new Scanner(System.in);
        System.out.println("Digite as coordendas (X,Y): ");
        int x = ipt.nextInt();
        int y = ipt.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("1 Quadrante");
            } else if (x > 0 && y < 0){
                System.out.println("4 Quadrante");
            } else if (x < 0 && y > 0){
                System.out.println("2 Quadrante");
            } else if (x < 0 && y < 0){
                System.out.println("3 Quadrante");
            }
            x = ipt.nextInt();
            y = ipt.nextInt();
        }
        ipt.close();

    }
}
 */

/*
Lista02 - WHILE - ex01
public class Hello{
    public static void main (String[] args){

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        int senha = ipt.nextInt();

        while (senha != 2002){
            System.out.println("Senha inválida");
            senha = ipt.nextInt();
        }
        System.out.println("Acesso liberado");
        ipt.close();
    }
}
 */

/*
Lista01 - FOR - ex07
public class Hello{
    public static void main (String[] args){

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        int n = ipt.nextInt();

        for (int i = 1; i <= n; i++){
                int a = i;
                int b = (int) Math.pow(a,2);
                int c = (int) Math.pow(a,3);
                System.out.printf("%d %d %d%n", a, b, c);
        }

    }
}
 */

/*
Lista01 - FOR - ex06
public class Hello{
    public static void main (String[] args){

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int n = ipt.nextInt();
        int x = 1;

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}
 */

/*
Lista01 - FOR - ex05
public class Hello{
    public static void main (String[] args){

        int fat = 1;

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = ipt.nextInt();

        for (int i = 1; i <= n; i++){
           fat = fat * i;
        }
        System.out.println(fat);
    }
}

 */

/*
Lista 01 - FOR - ex04
public class Hello{
    public static void main (String[] args){

        int x1, x2;
        double divisao;

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite um número N: ");
        int n = ipt.nextInt();

        for (int i = 0; i < n; i++){
            x1 = ipt.nextInt();
            x2 = ipt.nextInt();

            if (x2 == 0){
                System.out.println("Divisão impossível");
            } else {
                divisao = x1/x2;
                System.out.println(divisao);
            }

        }


    }
}
 */

/*
List01 - FOR - Ex. 03
public class Hello{
    public static void main (String[] args){

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite o número de casos-teste: ");
        int n = ipt.nextInt();

        System.out.println("Digite os números: ");
        for (int i = 0; i < n; i++){
            double a = ipt.nextDouble();
            double b = ipt.nextDouble();
            double c = ipt.nextDouble();
            double media = (a*2 + b*3 + c*5)/3;
            System.out.println(media);
        }

    }
}
 */

/*
Lista01 - FOR - Ex. 02

public class Hello{
    public static void main (String[] args){

        int n, x;
        int in = 0;
        int out = 0;

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite quantos números serão lidos: ");
        n = ipt.nextInt();


        for (int i = 0; i < n; i++){
            x = ipt.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
 */

/*

        double media = 0;

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite quantos pares de números serão divididos: ");
        int n = ipt.nextInt();

        for (int i = 0; i < n; i++){
            double x1 = ipt.nextDouble();
            double x2 = ipt.nextDouble();
            if (x2 == 0){
                System.out.println("Divisão impossível");
            } else {
                media = x1 / x2;
                System.out.println(media);
            }
        }
 */

/*
  int n;
        double x1, x2, x3 = 0;
        double media = 0;

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite o número de casos-teste: ");
        n = ipt.nextInt();

        System.out.println("Digite os números: ");

        for (int i = 0; i < n; i++){
                x1 = ipt.nextDouble();
                x2 = ipt.nextDouble();
                x3 = ipt.nextDouble();
                media = ((x1*2 + x2*3 + x3*5)/3);
                System.out.printf("%.2f%n", media);
        }
 */

/*
public class Hello{
    public static void main (String[] args){

        System.out.println("Quantos valores você irá digitar? ");

        Scanner ipt = new Scanner(System.in);
        int n = ipt.nextInt();

        int in = 0;
        int out = 0;
        int x;

        System.out.println("Digite os valores: ");

        for (int i = 0; i < n; i++){
            x = ipt.nextInt();
            if (x > 10 && x < 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
 */

/*
public class Hello{
    public static void main (String[] args){

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 1000: ");
        int x = ipt.nextInt();

        System.out.println(x);

        for (int i = 0; i < x; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
 */

//Exercício 05
//https://www.youtube.com/watch?v=dAiwlRF3PvM&t=1892s
/*
public class Hello{
    public static void main (String[] args){
        System.out.println("Bem-vindo ao Hortifruti");
        String[] frutasPromocao = {"banana", "maça", "abacaxi", "melão", "mamão"};

        System.out.println("Qual sua lista de compras para hoje?");
        Scanner input = new Scanner(System.in);
        String compra = input.nextLine();

        String[] listaCompra = compra.split(",");
        int cont = 0;

        for (String fruta : listaCompra){
            for (String promoFruta: frutasPromocao)
        }
    }
}

 */



/*
Exercício 05

public class Hello{
    public static void main(String[] args){
        String[] itensPromocao = {"Banana", "Arroz", "Feijão", "Macarrão", "Ovo"};
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da sua lista: ");
        int tamanho = input.nextInt();

        String[] itensLista = new String[tamanho];
        System.out.println("Digite os itens da sua lista: ");

        for (int i = 0; i < tamanho; i++){
            itensLista[i] = input.next();
        }

        if(itensPromocao.equalsIgnoreCase(itensLista)){

        }

        System.out.println(Arrays.toString(itensLista));


    }
}

 */


/*
  //Outra forma de escrever arrays
        String[] letras2 = {"A", "B", "C", "D"};

 */



/*
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


/*
 * 
        int n;
        double x = 0;
        double media = 0;

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite o número de casos-teste: ");
        n = ipt.nextInt();

        System.out.println("Digite os números: ");

        for (int i = 0; i < n; i++){
            for (int z = 0; z < 3; z++){
                x = ipt.nextDouble();
            }
            media = (x/3);
            System.out.println(media);
            }
 */

/*
 * 	int x = 8;
		int y = 3;
		
		for (int i = 0; y < x; i++) {
			x = x - 2;
			y = y + 1;
			System.out.println(i);
 */

/*
 * 	 
		int x = 4;
		int y = 0;
		
		for (int i = 0; i < x; i++) {
			y = y + i;	
	}
		System.out.println(y);
 */

/*
 * int y = 10;
	for (int i = 0; i < 4; i++) {
		System.out.print(i);
		y = y + i;
		System.out.println(y);
 */

/*
 * 	int x = 4;
		int y = x + 2;
		
		for (int i=0; i<x; i++) {
			System.out.print(x+" "+y);
			y = y + i;
		}
 */
/*
 * 		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
 */

/*
 double largura;
		double comprimento;
		double preco;
		double area;
		double valor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		largura = input.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = input.nextDouble();
		
		System.out.println("Digite o preco do terreno: ");
		preco = input.nextDouble();
		
		area = largura * comprimento;
		valor = area * preco;
		
		System.out.printf("AREA: %.2fm², %nPRECO: R$%.2f", area, valor);
 */

/*
 	double preco = 10;
		double desconto = preco > 20 ? preco * 0.1 : preco * 0.2;
		System.out.println(desconto);
 */

/*
 		double largura;
		double comprimento;
		double preco;
		double area;
		double valor;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a largura do terreno: ");
		largura = input.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = input.nextDouble();
		
		System.out.println("Digite o preco do terreno: ");
		preco = input.nextDouble();
		
		area = largura * comprimento;
		valor = area * preco;
		
		System.out.printf("AREA: %.2fm², %nPRECO: R$%.2f", area, valor);
		
 */

/*
 	
		Scanner ipt = new Scanner(System.in);
		
		String s1, s2, s3;
		
		/*Escreve o tanto que quiser*//*
		s1 = ipt.nextLine();
		s2 = ipt.nextLine();
		s3 = ipt.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
 */

/*
 * Scanner input = new Scanner(System.in);
 *
 * String s1, s2, s3; System.out.println("Digite 3 dados: "); s1 =
 * input.nextLine(); s2 = input.nextLine(); s3 = input.nextLine();
 *
 * System.out.println("Dados digitados:"); System.out.println(s1);
 * System.out.println(s2); System.out.println(s3);
 *
 */

/*
 * Locale.setDefault(Locale.US); Scanner input = new Scanner(System.in);
 *
 * String x; int y; double z;
 *
 * System.out.println("Digite três dados: ");
 *
 * x = input.next(); y = input.nextInt(); z = input.nextDouble();
 *
 * System.out.println("Dados digitados: "); System.out.println(x);
 * System.out.println(y); System.out.println(z); /*Digitar: maria 30 4.5
 */

/*
 * Scanner input = new Scanner(System.in);
 *
 * double x; System.out.println("Digite um número: "); x = input.nextDouble();
 * System.out.printf("Você digitou: %.2f", x); input.close();
 */

/*
 * Scanner input = new Scanner(System.in);
 *
 * int x; x = input.nextInt(); System.out.println("Você digitou: " + x);
 * input.close();
 *
 */

/*
 * Scanner input = new Scanner(System.in);
 *
 * String x; x = input.next(); System.out.println("Você digitou: " + x);
 * input.close();
 */

/*
 * String product1 = "Computador"; String product2 = "Mesa de escritório";
 *
 * int age = 30; int code = 5290; char gender = 'F';
 *
 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
 *
 * System.out.printf("Produtos:%n%s, preço: R$%.2f ", product1, price1);
 * System.out.printf("%n%s, preço: R$%.2f", product2, price2);
 *
 * System.out.printf("%n%nRecord: %d anos, código %s e sexo: %s", age, code,
 * gender);
 *
 * System.out.printf("%n%s, preço: R$%.2f", product2, price2);
 *
 * System.out.printf("%n%n%.8f", measure); System.out.printf("%n%.3f", measure);
 * Locale.setDefault(Locale.US); System.out.printf("%n%.3f", measure);
 *
 */

/*
 * double x = 10.34231; int y = 7;
 *
 * System.out.println("Hello World"); System.out.print("Hello World");
 * System.out.print("Hello World");
 *
 * System.out.printf("%.2f%n", x); System.out.printf("%.4f%n", x);
 *
 * Locale.setDefault(Locale.US); System.out.printf("%.4f%n", x);
 *
 * System.out.println("Resultado = " + x + " metros");
 * System.out.printf("Temos %.2f metros de pães %n", x);
 *
 * String nome = "Dionísio"; int idade = 27; double renda = 2550.85;
 * System.out.printf("%s tem %d anos e ganha R$%.2f reais por mês%n", nome,
 * idade, renda);
 */
