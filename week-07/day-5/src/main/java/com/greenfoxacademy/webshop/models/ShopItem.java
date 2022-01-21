package com.greenfoxacademy.webshop.models;

public class ShopItem {
    private final String name;
    private final String description;
    private final double price;
    private final int quantityOfStock;

    public ShopItem(String name, String description, double price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }
}
