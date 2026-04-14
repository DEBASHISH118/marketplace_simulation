
package com.mycompany.marketplacesimulation;


public abstract class Product {
    protected int productID;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(int productID, String name, double price, int stockQuantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract double calculateFinalPrice();

    public String getName() { return name; }
    public double getPrice() { return price; }
}