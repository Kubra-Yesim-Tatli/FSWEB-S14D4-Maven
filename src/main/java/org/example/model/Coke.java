package org.example.model;

public class Coke extends ProductForSale {
    private String cokeFlavor;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.cokeFlavor = "Cola";  // Default value, can be customized
    }

    public String getCokeFlavor() {
        return cokeFlavor;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Flavor: " + cokeFlavor);
    }
}

