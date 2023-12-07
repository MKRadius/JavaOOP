package com.example;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

import com.example.model.Cat;
import com.example.view.CatView;
import com.example.controller.CatController;


/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Cat cat = new Cat("Tom");
        CatView catView = new CatView();
        CatController catController = new CatController(cat, catView);

        catView.setController(catController);
        catView.start(stage);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}