
package com.mycompany.marketplacesimulation;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace {
    private int marketplaceID;
    private String name;
    private String websiteURL;
    private List<Category> categories;

    public MarketPlace(int marketplaceID, String name, String websiteURL) {
        this.marketplaceID = marketplaceID;
        this.name = name;
        this.websiteURL = websiteURL;
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public Category findCategory(int categoryID) {
        for (Category c : categories) {
            if (c.getCategoryID() == categoryID) return c;
        }
        return null;
    }

    public String getName() { return name; }
}