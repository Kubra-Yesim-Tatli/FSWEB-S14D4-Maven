package org.example.model;

public class Bread extends ProductForSale {
    private boolean isWholeGrain;

    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.isWholeGrain = false;  // Default value
    }

    public boolean isWholeGrain() {
        return isWholeGrain;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Whole Grain: " + isWholeGrain);
    }
}
