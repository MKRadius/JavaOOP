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
    private ListView<Note> noteList;



    @FXML
    void addToNote(ActionEvent event) {
        this.note.add(title.getText(), content.getText());
        this.noteList.getItems().add(this.note);
        System.out.println("added");
    }

    @FXML
    void getAllNotes(ActionEvent event) {
        this.noteList.getItems().addAll(this.note);
    }

    @FXML
    void displayNote(MouseEvent event) {
        title.setText(noteList.getSelectionModel().getSelectedItem().toString());
        content.setText(noteList.getSelectionModel().getSelectedItem().toString());
    }

    @FXML
    void removeFromNote(ActionEvent event) {
        this.note.remove(title.getText());
    }

}