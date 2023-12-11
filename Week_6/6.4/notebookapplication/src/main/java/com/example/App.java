package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

/**
 * JavaFX App
 */
public class App extends Application {
    // private Parent loadFXML(String fxml) throws IOException {
    //     FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    //     return fxmlLoader.load();
    // }

    // @Override
    // public void start(Stage stage) throws IOException {
    //     Scene scene = new Scene(loadFXML("note"));
    //     stage.setTitle("Notebook Application");
    //     stage.setScene(scene);
    //     stage.show();
    // }

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = getClass().getResource("note.fxml");
        System.out.println("URL: " + url);

        Parent root = FXMLLoader.load(getClass().getResource("note.fxml"));
        primaryStage.setTitle("My JavaFX App");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}