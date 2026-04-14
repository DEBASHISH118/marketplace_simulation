
package com.mycompany.marketplacesimulation;

public class PhysicalProduct extends Product {
    private double weight;
    private double shippingCost;

    public PhysicalProduct(int productID, String name, double price, int stockQuantity, double weight, double shippingCost) {
        super(productID, name, price, stockQuantity);
        this.weight = weight;
        this.shippingCost = shippingCost;
    }

    @Override
    public double calculateFinalPrice() {
        return price + shippingCost; 
    }
}
