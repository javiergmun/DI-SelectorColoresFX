package com.example.selectorcolores;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Vista extends Parent {
    private final Pane panel;
    private final HBox hboxRed;
    private final HBox hboxGreen;
    private final HBox hboxBlue;
    private final VBox selector;
    private final Slider sliderRed;
    private final Slider sliderGreen;
    private final Slider sliderBlue;
    private final Label red;
    private final Label green;
    private final Label blue;
    private final Label numRed;
    private final Label numGreen;
    private final Label numBlue;
    Controller controller;

    public Vista() {

        panel = new Pane();
        selector = new VBox();
        hboxRed = new HBox();
        hboxGreen = new HBox();
        hboxBlue = new HBox();
        sliderRed = new Slider();
        sliderGreen = new Slider();
        sliderBlue = new Slider();

        red = new Label(" Red ");
        green = new Label(" Green ");
        blue = new Label(" Blue ");
        numRed = new Label("0");
        numGreen = new Label("0");
        numBlue = new Label("0");
        controller = new Controller(sliderRed, sliderGreen, sliderBlue, numRed, numGreen, numBlue, panel);


        iniciarVista();
    }

    private void iniciarVista() {


        //Padding and set Colors
        panel.setPadding(new Insets(100));
        panel.setTranslateY(110);


        red.setTextFill(Paint.valueOf(String.valueOf(Color.RED)));
        numRed.setTextFill(Paint.valueOf(String.valueOf(Color.RED)));
        sliderRed.setMax(255);

        green.setTextFill(Paint.valueOf(String.valueOf(Color.GREEN)));
        numGreen.setTextFill(Paint.valueOf(String.valueOf(Color.GREEN)));
        sliderGreen.setMax(255);

        blue.setTextFill(Paint.valueOf(String.valueOf(Color.BLUE)));
        numBlue.setTextFill(Paint.valueOf(String.valueOf(Color.BLUE)));
        sliderBlue.setMax(255);

        //Sets
        hboxRed.getChildren().addAll(red, sliderRed, numRed);
        hboxRed.prefHeightProperty().bind(panel.heightProperty().divide(5));

        hboxGreen.getChildren().addAll(green, sliderGreen, numGreen);
        hboxGreen.prefHeightProperty().bind(panel.heightProperty().divide(5));

        hboxBlue.getChildren().addAll(blue, sliderBlue, numBlue);
        hboxBlue.prefHeightProperty().bind(panel.heightProperty().divide(5));


        panel.setMaxSize(100, 100);
        panel.prefHeightProperty().bind(panel.heightProperty().divide(2));
        selector.getChildren().addAll(hboxRed, hboxGreen, hboxBlue);
        this.getChildren().addAll(panel, selector);


    }
}
