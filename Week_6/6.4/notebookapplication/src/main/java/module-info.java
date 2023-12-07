module com.example {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    opens com.example.controller to javafx.fxml;

    exports com.example;
    exports com.example.controller;
    exports com.example.model;
    exports com.example.view;
}
