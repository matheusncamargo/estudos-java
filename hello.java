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



/*

//ENTITIES

public enum Meses {
    JANEIRO(300),
    FEVEREIRO(500),
    MARCO(1500),
    ABRIL (2000),
    MAIO (500),
    JUNHO(600),
    JULHO(350),
    AGOSTO(500),
    SETEMBRO(1200),
    OUTUBRO(1500),
    NOVEMBRO(2500),
    DEZEMBRO(1500);
    private int valor;

    Meses(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}



public class Rent {

    private String nome;
    private String email;

    public Rent(String name, String email) {
        this.nome = name;
        this.email = email;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return width * 2;
    }

    public double diagonal(){
        return width * 3;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "area = " + area() +
                "\n perimeter = " + perimeter() +
                "\n Diagonal = " + diagonal();
    }
}



public class Produto {

    private String nome;
    private double valor;
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}


public class FuncionariosListas {

    private String nome;
    private Integer id;
    private Double salario;

    public FuncionariosListas(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return
                id + ", " + nome + ", " + String.format("%.2f", salario);
    }

    public void increaseSalary (double percentage){
        salario += salario * percentage / 100;
    }
}


public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary *= percentage;
    }

    public String toString(){
        return "Funcionário: "
                + name
                + ", "
                + netSalary();
    }

}


//Application

package Aula_03;

/*
Faça o exercício anterior com o operador ternário
 */

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do eleitor: ");
        int idade = sc.nextInt();

        String mensagem =   (idade >= 18 && idade <= 70) ?   "Voto obrigatório!" :
                            (idade >= 16)  ?                 "Voto facultativo" :
                                                             "Sem direito a votar" ;


        System.out.println(mensagem);
    }
}


package Aula_03;

/*
Escreva um programa para verificar se uma pessoa pode votar ou não,
de acordo com sua idade. O programa deve escrever na tela as seguintes informacões:

"Voto obrigatório"  - para eleitoras e eleitores, com idades entre 18 e 70 anos.

"Voto  facultativo" - para maiores ou iguais a 16 anos e menores de 18 anos;
 assim como maiores de 70 anos.

"Sem direito a votar" - para o restante.

* Exemplo
Entrada - 16
Saida - Voto Facultativo
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        System.out.print("Digite a idade do eleitor: ");
        votaOuNao();
    }

    private static void votaOuNao(){
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if (idade >= 18 && idade <= 70){
            System.out.println("Voto obrigatório!");
        } else if ((idade >= 16 && idade < 18) || idade > 70){
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Sem direito a votar");
        }
    }
}

public class Application {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("1-Janeiro \n2-Fevereiro \n3-Março \n4-Abril" +
                " \n5-Maio \n6-Junho \n7-Julho \n8-Agosto \n9-Setembro"+
                " \n10-Outubro \n11-Novembro \n12-Dezembro \n\nDigite o mês: ");
        int mes = sc.nextInt();
        int despesaMes = 0;
        String nomeMes = "";

        if (mes == 1){
            despesaMes = Meses.JANEIRO.getValor();
            nomeMes = "Janeiro";
        } else if (mes == 2){
            despesaMes = Meses.FEVEREIRO.getValor();
            nomeMes = "Fevereiro";
        } else if (mes == 3){
            despesaMes = Meses.MARCO.getValor();
            nomeMes = "Março";
        } else if (mes == 4){
            despesaMes = Meses.ABRIL.getValor();
            nomeMes = "Abril";
        } else if (mes == 5){
            despesaMes = Meses.MAIO.getValor();
            nomeMes = "Maior";
        } else if (mes == 6){
            despesaMes = Meses.JUNHO.getValor();
            nomeMes = "Junho";
        } else if (mes == 7){
            despesaMes = Meses.JULHO.getValor();
            nomeMes = "Julho";
        } else if (mes == 8){
            despesaMes = Meses.AGOSTO.getValor();
            nomeMes = "Agosto";
        } else if (mes == 9){
            despesaMes = Meses.SETEMBRO.getValor();
            nomeMes = "Setembro";
        }  else if (mes == 10){
            despesaMes = Meses.OUTUBRO.getValor();
            nomeMes = "Outubro";
        } else if (mes == 11){
            despesaMes = Meses.NOVEMBRO.getValor();
            nomeMes = "Novembro";
        } else if (mes == 12){
            despesaMes = Meses.DEZEMBRO.getValor();
            nomeMes = "Dezembro";
        }

        System.out.printf("Mês: %s \nValor gasto: %d", nomeMes, despesaMes);
    }
}


public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf(
                "\n1 - Coca-Cola - R$ 5" +
                "\n2 - Coca-Cola Zero - R$ 4.50" +
                "\n3 - Pepsi - R$ 4,40" +
                "\n4 - Guaraná Antarctica - R$ 3,50" +
                "\n5 - Fanta Laranja - R$ 4,23" +
                "\n6 - Água - R$ 2,50 " +
                        "\nSelecione o número da bebida desejada: ");
        int numero = sc.nextInt();

        switch (numero){
            case (1):
                System.out.println("Coca-Cola - R$ 5");
                break;
            case (2):
                System.out.println("Coca-Cola Zero - R$ 4.50");
                break;
            case (3):
                System.out.println("Pepsi - R$ 4,40");
                break;
            case (4):
                System.out.println("Guaraná Antarctica - R$ 3,50");
                break;
            case (5):
                System.out.println("Fanta Laranja - R$ 4,23");
                break;
            case (6):
                System.out.println("Água - R$ 2,50");
                break;
        }
    }
}

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do eleitor: ");
        int idade = sc.nextInt();

        String mensagem = (idade >= 18 && idade <= 70 ? "Voto obrigatório!" : (idade >= 16 && idade < 18) || idade > 70 ? "Voto facultativo" : "Sem direito a votar" );
        System.out.println(mensagem);
    }
}

public class N_Operacoes_Data_Hora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(d04);
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
    }
}


public class N_Data_Hora {
    public static void main(String[] args) {

        //customizar formato de data e hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        //-3:00 -> indica UTC-3:00 (horário de São Paulo)

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println("Horário de Londres: " + d06.toString());
        //.toString() -> converte automaticamente para o padrão texto-ISO8601
        System.out.println(d08);

        System.out.println(d10);
        System.out.println(d11);


    }
}

public class Matrizes_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int l = sc.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o número para busca: ");
        int n = sc.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == n){
                    System.out.println("Posição: " + i + ", " + j);


                }
            }
        }
    }
}


public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas e colunas da matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.println(mat[i][i] + " ");
            }

        int somaNegativo = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    somaNegativo++;
                }
            }
        }

        System.out.println("Números negativos: " + somaNegativo);
    }
}


public class Listas_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        List<FuncionariosListas> list = new ArrayList<>();   //Cria uma lista modificável (ArrayList)

       for (int i = 0; i < n; i++){
           System.out.println("\nFuncionário #" + (i + 1));

           System.out.print("Id: ");
           Integer id = sc.nextInt();
           sc.nextLine();

           System.out.print("Nome: ");
           String nome = sc.nextLine();

           System.out.print("Salário: ");
           Double salario = sc.nextDouble();

           FuncionariosListas func = new FuncionariosListas(nome, id, salario);
           list.add(func);
       }

       System.out.println("\nDigite o ID do funcionário que terá aumento salarial: ");
       int idFuncionario = sc.nextInt();

       Integer pos = position(list, idFuncionario);

       if (pos == null){
           System.out.println("\nID não encontrado");
       } else {
           System.out.println("\nEntre com uma porcentagem: ");
           double percente = sc.nextDouble();

           list.get(pos).increaseSalary(percente);
       }

        System.out.println("\nLista de funcionários: ");

       for (FuncionariosListas func : list){
           System.out.println(func);
       }
    }

    //Função para dizer a posição do funcionário na lista
    public static Integer position(List<FuncionariosListas> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}

public class Listas {
    public static void main(String[] args) {
        String vect[] = {"Maria", "Matheus", "Tadeu"};

        //Para cada objeto "obj" contido no vetor "vect", faça:
        for (String obj : vect){
            System.out.println(obj);
        }
        System.out.println("*-------------*");

        //Lista
        List<String> list = new ArrayList<>();

        list.add("João");
        list.add("Amaranto");
        list.add("Maria");
        list.add("Kleber");
        list.add("Marta");
        list.add("Amadeu");

        /*list.add(1, "Guilhermino");*/
        list.remove(2);

        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("*-------------*");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("*-------------*");
        System.out.println("Index do Kleber: " + list.indexOf("Kleber"));
        System.out.println("Index do Luiz: " + list.indexOf("Luiz"));

        System.out.println("*-------------*");
        //list.stream() -> converte para String (para usar o filter)
        //.filter() -> Filtra em determinada condição
        //.collect() -> converte para lista
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("*-------------*");
        //.findFirst -> pega primeiro elemento da String
        //.orElse -> Se não encontrar o elemeno, retornará "null"
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}

public class ExDesafio_Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados?");
        int n = sc.nextInt();
        int numeroQuarto = 0;

        Rent[] vetor = new Rent[10];        //Criação de um vetor baseado na entidade "Rent"

        for (int i = 0; i < n; i++){
            System.out.println("\nRent #" + i);
            System.out.print("Nome: ");
            sc.nextLine();                          //Limpar o buffer
            String nome = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Quarto: ");
            numeroQuarto = sc.nextInt();

           vetor[numeroQuarto] =  new Rent(nome, email);  //Instanciando o vetor da entidade
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            }
        }

    }
}

public class Ex12_Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão inseridas?  ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < alturas.length; i++){
            System.out.print("Atura da " + i + "a pessoa: ");
            alturas[i] = sc.nextDouble();

            System.out.print("Gênero: ");
            genero[i] = sc.next().charAt(0);

            System.out.println();
        }

        double maiorAltura = alturas[0];
        double menorALtura = alturas[0];
        double mediaAlturaMulheres;
        double alturaMulheres = 0;
        int numeroMulheres = 0;
        int numeroHomens = 0;

        for (int i = 0; i < alturas.length; i++){
          if (alturas[i] > maiorAltura){
              maiorAltura = alturas[i];
          }
        }

        for (int i = 0; i < alturas.length; i++){
            if (alturas[i] < menorALtura){
                menorALtura = alturas[i];
            }
        }

        for (int i = 0; i < genero.length; i++){
            if (genero[i] == 'M'){
                numeroHomens++;
            }
        }

        for (int i = 0; i < genero.length; i++){
            if (genero[i] == 'F'){
                alturaMulheres += alturas[i];
                numeroMulheres++;
            }
        }

        mediaAlturaMulheres = alturaMulheres / numeroMulheres;

        System.out.println(maiorAltura);
        System.out.println(menorALtura);
        System.out.println(numeroHomens);
        System.out.println(mediaAlturaMulheres);


    }
}



public class Ex11_Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] notas = new int[n];
        int[] notas2 = new int[n];


        for (int i = 0; i < notas.length; i++){
            System.out.println("Dados do " + i + "o aluno:");
            System.out.print("Nome, primeira e segunda notas: ");
            nomes[i] = sc.next();
            notas[i] = sc.nextInt();
            notas2[i] = sc.nextInt();
        }

        for (int i = 0; i < notas.length; i++){
           if ((notas[i] + notas2[i]) / 2 > 6){
               System.out.println(nomes[i] + " aprovado!");
           }
        }

    }
}



public class Ex10_Vet {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoa você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];


        for (int i = 0; i < idades.length; i++){
            System.out.println("Dados da " + i + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maisVelho = idades[0];
        String nomeMaisVelho = nomes[0];

        for (int i = 0; i < idades.length; i++){
            if (idades[i] > maisVelho){
                maisVelho = idades[i];
                nomeMaisVelho = nomes[i];
            }
        }

        System.out.println(nomeMaisVelho);
        System.out.println(maisVelho);
    }
}


public class Ex9_Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int somaPar = 0;
        int somaMedia = 0;
        double media = 0;

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                somaPar++;
                somaMedia += vetor[i];
            }
        }

        if (somaPar > 0){
            media = somaMedia/somaPar;
            System.out.println("Media dos pares = " + media);
        } else {
            System.out.println("Nenhum numero par");
        }

    }
}


public class Ex8_Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int soma = 0;
        double media;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número - vetorA: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            soma += vetorA[i];
        }

        media = soma/vetorA.length;

        System.out.println("Media = " + media);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vetorA.length; i++){
           if (vetorA[i] < media){
               System.out.println(vetorA[i]);
           }
        }

    }
}

public class Ex7_Vet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número - vetorA: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Digite um número - vetorB: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println(Arrays.toString(vetorC));
    }
}


public class Ex6_Vetores_Fixacao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números irá digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = 0;
        int posicao = 0;

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);



    }
}



public class Ex5_Vetores_Fixacao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Digite um número: ");
            arr[i] = sc.nextInt();
        }

        double soma = 0;

        for(int j = 0; j < arr.length; j++){
            soma += arr[j];
        }

        double media = soma / arr.length;

        System.out.println("Valores: " + Arrays.toString(arr));
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

    }
}

  
public class Ex4_Vetores_Fixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Digite um número: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                System.out.println(arr[i]);
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}

public class Ex3_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de itens: ");
        int n = sc.nextInt();

        Produto[] vect = new Produto[n];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do item: ");
            String nome = sc.nextLine();
            System.out.print("Digite o valor do item: ");
            double valor = sc.nextDouble();
            vect[i] = new Produto(nome, valor);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getValor();
        }

        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

    }
}


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Nome: ");
        emp.name = sc.nextLine();

        System.out.println("Salário bruto: ");
        emp.grossSalary = sc.nextDouble();

        System.out.println("Taxa: ");
        emp.tax = sc.nextDouble();

        System.out.println(emp);

        System.out.println("Quanto deseja aumentar no salário: ");
        emp.increaseSalary(sc.nextDouble());

        System.out.println(emp.grossSalary);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle ret = new Rectangle();

        System.out.println("Digite a largura: ");
        ret.width = sc.nextDouble();

        System.out.println("Digite a altura: ");
        ret.height = sc.nextDouble();

        System.out.println("A area é de:");
        System.out.println(ret.area());
    }
}


package entitites;

public class Student {

    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double finalGrade(){
        return n1 + n2 + n3;
    }

    public String passOrFail(){
        String prf;
        double missing = 0;

        if (finalGrade() >= 60){
            prf = "PASS";
        } else {
            prf = "FAIL";
            missing = (60 - finalGrade());
        }
        return prf + " " + missing;
    }

    public String toString(){
        return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + " " + passOrFail();
    }
}


package app;

import entitites.Student;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner ipt = new Scanner(System.in);
        Student std = new Student();

        System.out.println("Digite o nome do aluno: ");
        std.name = ipt.nextLine();

        System.out.println("Digite as notas do aluno: ");
        std.n1 = ipt.nextDouble();
        std.n2 = ipt.nextDouble();
        std.n3 = ipt.nextDouble();

        System.out.println(std);

    }

}


public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double n1;
        double n2;

        if (args.length == 0){
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextDouble();

            System.out.println("Digite o segundo número: ");
            n2 = sc.nextDouble();

            soma = n1 + n2;
        } else if (args.length == 1){
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextDouble();

            n2 = Double.parseDouble(args[0]);

            soma = n1 + n2;
        } else if (args.length == 2){
            n1 = Double.parseDouble(args[0]);
            n2 = Double.parseDouble(args[1]);

            soma = n1 + n2;
        } else {
            System.out.println("Quantidade de parâmetros inválida");
        }
        System.out.println(soma);
    }
}

    public class Application {

    public static final Double fator1 = (double) 9/5;
    public static final Integer fator2 = 32;

    public static void main(String[] args) {
        System.out.println(conversor(20));
        System.out.println(conversor(25));
        System.out.println(conversor(33));
    }
    public static double conversor(double celsius){
        double fahrenheit = (celsius * fator1) + fator2;
        return fahrenheit;
    }
}


/*
  double f1 = (double) 9/5;
        System.out.println(f1);
 */


/*
public class Application {
    public static void main(String[] args) {
        System.out.println((Integer.parseInt(args[0]) % 2 == 0 ? "O número é par" : "O número é ímpar"));
    }
}
 */

/*
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.printf("1- Adição %n2- Subtração %n3- Multiplicação %n4- Divisão %nDigite o número da operação que deseja realizar: ");
        double option = sc.nextInt();

        if (option == 1){
            System.out.println(n1 + n2);
        } else if (option == 2){
            System.out.println(n1 - n2);
        } else if (option == 3){
            System.out.println(n1 * n2);
        } else if (option == 4){
            System.out.println((n2 == 0 ? "Divisão impossível" : n1 / n2));
        }
    }
}
 */

/*
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double n1;
        double n2;

        if (args.length == 0){
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextDouble();

            System.out.println("Digite o segundo número: ");
            n2 = sc.nextDouble();

            soma = n1 + n2;
        } else if (args.length == 1){
            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextDouble();

            n2 = Double.parseDouble(args[0]);

            soma = n1 + n2;
        } else if (args.length == 2){
            n1 = Double.parseDouble(args[0]);
            n2 = Double.parseDouble(args[1]);

            soma = n1 + n2;
        } else {
            System.out.println("Quantidade de parâmetros inválida");
        }
        System.out.println(soma);
    }
}
 */

/*
public class Application {
    public static void main(String[] args) {
        System.out.println((Double.parseDouble(args[0]) % 2 == 0 ? "O número é par" : "O número é ímpar"));
    }
}
 */

/*
public class Hello{
    public static void main (String[] args){

        Scanner ipt = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int n1 = ipt.nextInt();
        int n2 = ipt.nextInt();
        int n3 = ipt.nextInt();

        int maior = max(n1, n2, n3);
        showResult(maior);
    }

    public static int max(int a, int b, int c){
        int aux;

        if (a > b && a > c){
            aux = a;
        } else if (b > c){
            aux = b;
        } else{
            aux = c;
        }

        return aux;
    }

    public static void showResult(int value){
        System.out.println("Maior número: " + value);
    }

}
 */

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
