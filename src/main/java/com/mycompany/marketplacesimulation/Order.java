
package com.mycompany.marketplacesimulation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderID;
    private Date orderDate;
    private String status;
    private List<OrderItem> orderItems; 

    public Order(int orderID) {
        this.orderID = orderID;
        this.orderDate = new Date();
        this.status = "Pending";
        this.orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem item) {
        orderItems.add(item);
    }

    public void processOrder() {
        this.status = "Processed";
    }

    public void cancelOrder() {
        this.status = "Cancelled";
        this.orderItems.clear(); 
    }

    public List<OrderItem> getOrderItems() { return orderItems; }
    public int getOrderID() { return orderID; }
    public String getStatus() { return status; }
}