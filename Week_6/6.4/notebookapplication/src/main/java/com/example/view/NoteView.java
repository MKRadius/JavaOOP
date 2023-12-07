package com.example.view;

import com.example.controller.NoteController;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class NoteView extends Application {
    private NoteController noteController;

    public void setController(NoteController noteController) {
        this.noteController = noteController;
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/note.fxml"));
        Parent root = loader.load();

        // Get the controller from FXMLLoader
        noteController = loader.getController();
        setController(noteController);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }  
}
