package com.example.selectorcolores;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        Vista vista= new Vista();
        Scene scene = new Scene(vista, 200, 350);
        stage.setTitle("Selector de colores RGB");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}