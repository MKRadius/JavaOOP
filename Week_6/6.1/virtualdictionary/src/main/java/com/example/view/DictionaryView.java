package com.example.view;

import com.example.controller.DictionaryController;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController dictionaryController;

    @Override
    public void start(Stage primaryStage) {
        dictionaryController = new DictionaryController();
        
        VBox layout = new VBox(10);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(300);
                
        TextField wordInput = new TextField();
        TextField definitionInput = new TextField();
        Button addButton = new Button("Add Word");
        Label addResult = new Label();
        Label searchResult = new Label();
        TextField searchInput = new TextField();
        Button searchButton = new Button("Search");

        wordInput.setPromptText("Word"); 
        definitionInput.setPromptText("Definition");
        searchInput.setPromptText("Search word");

        addButton.setOnAction(e -> {
            String word = wordInput.getText();
            String Definition = definitionInput.getText();

            if (word.isEmpty() || Definition.isEmpty()) {
                addResult.setText("Please enter a word and its definition");
                return;
            }
            
            dictionaryController.addWordToDictionary(word, Definition);
            addResult.setText("Word added");
        });

        searchButton.setOnAction(e -> {
            String word = searchInput.getText();

            if (word.isEmpty()) {
                searchResult.setText("Please enter a word to search");
                return;
            }

            String meaning = dictionaryController.searchWordInDictionary(word);
            searchResult.setText(meaning);
        });

        layout.getChildren().addAll(
            wordInput, definitionInput, addButton, addResult,
            searchInput, searchButton, searchResult
        );

        wordInput.setMaxWidth(0.5 * scene.getWidth());
        definitionInput.setMaxWidth(0.5 * scene.getWidth());
        searchInput.setMaxWidth(0.5 * scene.getWidth());

        layout.setAlignment(Pos.TOP_CENTER);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dictionary App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}