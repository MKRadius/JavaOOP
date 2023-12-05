package com.example;

import java.util.HashMap;

public class ShoppingCart {
    private HashMap<String, Double> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void addItem(String item, double price) {
        cart.put(item, price);
    }

    public void removeItem(String item) {
        cart.remove(item);
    }

    public int getItemCount() {
        return cart.size();
    }

    public void clear() {
        cart.clear();
    }

    public double calculateTotal() {
        double totalCost = 0.0;
        for (double price : cart.values()) {
            totalCost += price;
        }
        return totalCost;
    } 
    public static void main(String[] args) {
        System.out.println("ShoppingCart");
    }
}