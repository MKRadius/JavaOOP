package com.example.controller;

import com.example.model.Notebook;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ListView;

public class NoteController {
    private Notebook notebook = new Notebook();

    @FXML
    private TextField title;

    @FXML
    private TextArea content;

    @FXML
    private ListView<String> noteList;

    @FXML
    void addToNote(ActionEvent event) {
        this.notebook.add(title.getText(), content.getText());
        this.noteList.getItems().add(title.getText());
    }

    @FXML
    void displayNote(MouseEvent event) {
        String title = this.noteList.getSelectionModel().getSelectedItem();
        this.title.setText(title);
        this.content.setText(this.notebook.getNoteWithTitle(title).getContent());
    }

    @FXML
    void removeFromNote(ActionEvent event) {
        this.notebook.remove(title.getText());
        this.noteList.getItems().remove(title.getText());

        this.title.setText("");
        this.content.setText("");
    }
}