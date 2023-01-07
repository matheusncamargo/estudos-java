package Aula13_Enum_Composicao.ex_fixacao.application;

import Aula13_Enum_Composicao.ex_fixacao.entities.Client;
import Aula13_Enum_Composicao.ex_fixacao.entities.Order;
import Aula13_Enum_Composicao.ex_fixacao.entities.OrderItem;
import Aula13_Enum_Composicao.ex_fixacao.entities.Product;
import Aula13_Enum_Composicao.ex_fixacao.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        //Cliente
        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.next();

        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        //Instanciando um cliente
        Client client = new Client(name, email, birthDate);

        //Ordem
        System.out.println("Digite os dados da ordem: ");

        System.out.print("Status: ");
        String orderStatus = sc.next();

        System.out.println("Digite quantos itens serão pedidos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Entre com os dados do item " + (i + 1));
            System.out.print("Nome do produto: ");
            String productName = sc.next();

            System.out.print("Preço do produto: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantidade do produto: ");
            int productQuantity = sc.nextInt();

            //Instanciando um novo item de ordem
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));

            //Instanciando uma nova ordem
            order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);
            order.addItem(orderItem);
        }

        System.out.println(order);
    }
}
