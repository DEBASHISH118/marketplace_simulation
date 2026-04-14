
package com.mycompany.marketplacesimulation;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String email;
    private String address;
    private List<Order> orders;

    public Customer(int customerID, String name, String email, String address) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public void register() {

    }

    public Order generateOrder(int orderId) {
        return new Order(orderId);
    }

    public void placeOrder(Order order) {
        orders.add(order);
        order.processOrder();
    }
    
    public String getName() { return name; }
}