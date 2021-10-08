package com.company;

public interface Observable {
    void addCustomer(Observer customer);
    void deleteCustomer(Observer customer);
    void notifyAllCustomers();
}
