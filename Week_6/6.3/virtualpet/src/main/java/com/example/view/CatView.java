package com.example.view;

import com.example.controller.CatController;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class CatView extends Application {
    private Image image;
    private ImageView imageView;
    private Pane root;
    private CatController catController;

    public void setController(CatController catController) {
        this.catController = catController;
    }

    public void initialize() {
        try {
            image = new Image(getClass().getResourceAsStream("/com/example/cat.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        root = new Pane();
        root.getChildren().add(imageView);
    }

    @Override
    public void start(Stage stage) {
        initialize();

        root.setOnMouseMoved(e -> {
            PauseTransition pause = new PauseTransition(Duration.millis(300)); // 100 milliseconds delay
            pause.setOnFinished(event -> {
                catController.moveCat(e.getX() - 60, e.getY() - 60);
                imageView.setLayoutX(catController.getCatX());
                imageView.setLayoutY(catController.getCatY());
            });
            pause.play();
        });
        
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Image Viewer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
