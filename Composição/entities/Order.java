package Aula13_Enum_Composicao.ex_fixacao.entities;

import Aula13_Enum_Composicao.ex_fixacao.enums.OrderStatus;
import Aula13_Enum_Composicao.ex_resolvido2.entities.Comment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    List<OrderItem> items = new ArrayList<>();

    public Order(){};

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double soma = 0;
        for (OrderItem x : items) {
            soma += x.subTotal();
        }
        return soma;
    }

@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(moment + "\n");
        sb.append(status);
        sb.append(client + "\n");
    for (OrderItem item : items) {
        sb.append(item + "\n");
    }
        return sb.toString();
    }
}