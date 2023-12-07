package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

import com.example.controller.ConverterController;
import com.example.model.Converter;
import com.example.view.ConverterView;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Converter converterModel = new Converter();
        ConverterView converterView = new ConverterView();
        ConverterController converterController = new ConverterController(converterModel, converterView);

        converterView.setController(converterController);
        converterView.start(stage);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}