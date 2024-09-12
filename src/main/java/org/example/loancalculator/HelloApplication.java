package org.example.loancalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("LoanCalculator");

        Label line1 = new Label("Annual Interest Rate:");
        Label line2 = new Label("Number of Years:");
        Label line3 = new Label("Loan Amount");
        Label line4 = new Label("Monthly Payment:");
        Label line5 = new Label("Total  Payment");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(line1, 0, 0);
        gridPane.add(line2, 0, 1);
        gridPane.add(line3, 0, 2);
        gridPane.add(line4, 0, 3);
        gridPane.add(line5, 0, 4);


        Scene scene = new Scene(gridPane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}