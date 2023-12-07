package com.example;

import com.example.view.DictionaryView;

import javafx.application.Application;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Create an instance of the DictionaryView and start the application
        DictionaryView dictionaryView = new DictionaryView();
        dictionaryView.start(stage);
    }

    public static void main(String[] args) {
        Application.launch(DictionaryView.class);
    }

}