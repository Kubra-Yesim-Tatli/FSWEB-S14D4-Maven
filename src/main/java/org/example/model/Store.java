package org.example.model;

import org.example.rpg.Monster;
import org.example.rpg.Troll;

public class Store {
    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Bread("Test", 10, "Test Bread");
        products[1] = new Chocolate("Test", 10, "Test Chocolate");
        products[2] = new Coke("Test", 10, "Test Coke");

        Store store = new Store();
        store.listProducts(products);

        Monster troll = new Troll("Shrek", 1000, 100);
        System.out.println("Troll Attack: " + troll.attack());
    }
}
