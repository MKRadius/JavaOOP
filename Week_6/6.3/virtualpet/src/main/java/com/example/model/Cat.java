package com.example.model;

public class Cat {
    private String name;
    private double x;
    private double y;

    public Cat() {
        this.name = "cat";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void meow() {
        System.out.println("Meow!");
    }
}
