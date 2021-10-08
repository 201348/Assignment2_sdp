package com.company;

import java.util.List;

public class Customer implements Observer{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> orders) {
        System.out.println("dear " + this.name + " we have some changes in orders" + orders);
    }
}
