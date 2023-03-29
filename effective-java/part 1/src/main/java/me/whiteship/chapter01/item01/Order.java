package me.whiteship.chapter01.item01;

import java.util.*;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    // //일반 주문
    // public Order(Product product, boolean prime) {
    //     this.product = product;
    //     this.prime = prime;
    // }
    //
    // //급한 주문
    // public Order(boolean prime,Product product) {
    //     this.product = product;
    //     this.prime = prime;
    // }


    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {

        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
    }

}
