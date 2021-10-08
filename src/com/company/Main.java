package com.company;

public class Main {
    public static void main(String[] args) {
        Orders order = new Orders();
        order.addOrder("15 roses");
        order.addOrder("17 peonies + chocolate");

        Customer customer = new Customer("Alina");
        Customer customer1 = new Customer("Nurlan");

        order.addCustomer(customer);
        order.addCustomer(customer1);

        order.addOrder("13 tulips");
        order.deleteOrder("15 roses");
    }
}
