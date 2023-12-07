package com.example.controller;

import javafx.stage.Stage;

import com.example.model.Cat;
import com.example.view.CatView;


public class CatController {
    private Cat cat;
    private CatView catView;

    public CatController(Cat cat, CatView catView) {
        this.cat = cat;
        this.catView = catView;
    }

    public void moveCat(double x, double y) {
        cat.move(x, y);
    }

    public double getCatX() {
        return cat.getX();
    }

    public double getCatY() {
        return cat.getY();
    }

    public void start(Stage stage) {
        catView.start(stage);
    }
}
