package Aula_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaDeCompras = new ArrayList<>();

        System.out.print("Digite quantos produtos serão inseridos na lista: ");
        int n = sc.nextInt();
        String produto;
        double preco;
        int qtd;
        double soma = 0;

        for (int i = 0; i < n; i++){
            System.out.print("\nDigite o produto " + (i + 1) + " : ");
            produto = sc.next();

            System.out.print("Digite a quantidade: ");
            qtd = sc.nextInt();


            System.out.print("Digite o preço: ");
            preco = sc.nextDouble();

            listaDeCompras.add(produto);
            listaDeCompras.add(String.valueOf(qtd));
            listaDeCompras.add(String.valueOf(preco));
        }

        for (int i = 0; i < listaDeCompras.size(); i++){
            System.out.println(listaDeCompras.get(i));
        }

        for (int i = 2; i < listaDeCompras.size(); i = i + 3){
            double valores = Double.parseDouble(listaDeCompras.get(i));
            int quantidade = Integer.parseInt(listaDeCompras.get(i-1));
            double valorFinal = valores * quantidade;

            soma += valorFinal;
        }

        System.out.println();
        System.out.println(listaDeCompras);
        System.out.println("\n Total da compra: R$" + soma);
    }
}
