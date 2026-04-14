
package com.mycompany.marketplacesimulation;

public class DigitalProduct extends Product {
    private int fileSize;
    private String downloadLink;

    public DigitalProduct(int productID, String name, double price, int stockQuantity, int fileSize, String downloadLink) {
        super(productID, name, price, stockQuantity);
        this.fileSize = fileSize;
        this.downloadLink = downloadLink;
    }

    @Override
    public double calculateFinalPrice() {
        return price; 
    }
}