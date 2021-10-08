package com.company;

import java.util.ArrayList;
import java.util.List;

public class Orders implements Observable{
    private List<String> orders = new ArrayList<>();
    private List<Observer> customers = new ArrayList<>();

    public List<String> getOrders() {
        return orders;
    }
    public void setOrders(List<String> orders) {
        this.orders = orders;
    }

    public List<Observer> getCustomers() {
        return customers;
    }
    public void setCustomers(List<Observer> customers) {
        this.customers = customers;
    }

    public void addOrder(String order) {
        this.orders.add(order);
        notifyAllCustomers();
    }
    public void deleteOrder(String order) {
        this.orders.remove(order);
        notifyAllCustomers();
    }

    @Override
    public void addCustomer(Observer customer) {
        this.customers.add(customer);
    }

    @Override
    public void deleteCustomer(Observer customer) {
        this.customers.remove(customer);
    }

    @Override
    public void notifyAllCustomers() {
        for(Observer observer: this.customers) {
            observer.update(this.orders);
        }
    }

}
