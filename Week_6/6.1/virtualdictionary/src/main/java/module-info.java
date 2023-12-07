module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.example to javafx.fxml;
    exports com.example;
    exports com.example.model;
    exports com.example.view;
    exports com.example.controller;
}
