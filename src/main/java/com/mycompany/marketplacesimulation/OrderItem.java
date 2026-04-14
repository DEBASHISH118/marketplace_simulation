
package com.mycompany.marketplacesimulation;

public class OrderItem {
    private Product product;
    private int quantity;
    private double subtotal;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.subtotal = product.calculateFinalPrice() * quantity;
    }

    public double getSubtotal() { 
        return subtotal; 
    }
    public Product getProduct() { 
        return product; 
    }
    public int getQuantity() { 
        return quantity; 
    }
}