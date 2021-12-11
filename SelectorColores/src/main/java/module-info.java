module com.example.selectorcolores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.selectorcolores to javafx.fxml;
    exports com.example.selectorcolores;
}