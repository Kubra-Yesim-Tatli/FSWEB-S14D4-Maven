package org.example.model;

public class Chocolate extends ProductForSale {
    private String chocolateType;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.chocolateType = "Milk";  // Default value, can be customized
    }

    public String getChocolateType() {
        return chocolateType;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Chocolate Type: " + chocolateType);
    }
}
