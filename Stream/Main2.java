package Aula20_ProgramacaoFuncional.Ex_261;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        Product p1 = new Product("Mouse", 500.0);
        Product p2 = new Product("Tablet", 350.50);
        Product p3 = new Product("Mouse", 80.0);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        //System.out.println(lista);

        Long cont = lista.stream().count();

        Double soma = lista.stream()
                .map(x -> x.getPreco())
                .reduce((double) 0, (x, y) -> x + y);

        Double media = soma/cont;

        System.out.printf("Preço médio: %.2f", media);
        System.out.println();

        lista.stream()
                .map(x -> x.getNome())
                .forEach(System.out::println);

    }
}
