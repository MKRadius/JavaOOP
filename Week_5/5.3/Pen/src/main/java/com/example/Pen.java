package com.example;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color color;
    private boolean isCapped = true;

    public Pen() {
        this(Color.RED);
    }

    public Pen(Color c) {
        this.color = c;
    }
    
    public String draw() {
        if (this.isCapped) {
            return "";
        } else {
            return "Drawing " + this.color;
        }
    }

    public void capOff() {
        this.isCapped = false;
    }

    public void capOn() {
        this.isCapped = true;
    }

    public void changeColor(Color c) {
        if (this.isCapped) {
            this.color = c;
        }
    }
}
