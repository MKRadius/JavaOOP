package com.example;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    public Pen() {

    }

    public Pen(Color c) {

    }
    
    public String draw() {
        return "";
    }

    public void capOff() {

    }

    public void capOn() {

    }

    public void changeColor(Color c) {

    }

    public static void main(String[] args) {
        
    }
}
