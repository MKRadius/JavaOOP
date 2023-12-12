package com.example.controller;

import com.example.model.Note;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ListView;

public class NoteController {
    private Note note = new Note();

    @FXML
    private TextField title;

    @FXML
    private TextArea content;

    @FXML
    private ListView<String> noteList;

    @FXML
    void addToNote(ActionEvent event) {
        this.note.add(title.getText(), content.getText());
        this.noteList.getItems().add(title.getText());
    }

    @FXML
    void displayNote(MouseEvent event) {
        String key = this.noteList.getSelectionModel().getSelectedItem();
        this.title.setText(key);
        this.content.setText(this.note.get(key));
    }

    @FXML
    void removeFromNote(ActionEvent event) {
        this.note.remove(title.getText());
        this.noteList.getItems().remove(title.getText());

        this.title.setText("");
        this.content.setText("");
    }
}