
package com.mycompany.marketplacesimulation;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private int categoryID;
    private String title;
    private String description;
    private List<Product> products;

    public Category(int categoryID, String title, String description) {
        this.categoryID = categoryID;
        this.title = title;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    
    public int getCategoryID() { return categoryID; }
    public String getTitle() { return title; }
    public List<Product> getProducts() { return products; }
}