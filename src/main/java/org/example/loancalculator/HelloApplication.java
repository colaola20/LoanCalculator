package org.example.loancalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static java.lang.Math.pow;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader allows us to work with the Scene builder
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));

        stage.setTitle("LoanCalculator"); //set a title of the window

        // creates labels for the Loan Calculator
        Label textLine1 = new Label("Annual Interest Rate:");
        Label textLine2 = new Label("Number of Years:");
        Label textLine3 = new Label("Loan Amount:");
        Label textLine4 = new Label("Monthly Payment:");
        Label textLine5 = new Label("Total  Payment:");

        // creates text fields for the Loan Calculator which allows a user to write they data and a program to read the data and print calculation results for the user
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        // adjusts width of the text fields to 150
        textField1.setPrefWidth(150);
        textField2.setPrefWidth(150);
        textField3.setPrefWidth(150);
        textField4.setPrefWidth(150);
        textField5.setPrefWidth(150);

        // adjusts the text of the text fields to the right side
        textField1.setAlignment(Pos.CENTER_RIGHT);
        textField2.setAlignment(Pos.CENTER_RIGHT);
        textField3.setAlignment(Pos.CENTER_RIGHT);
        textField4.setAlignment(Pos.CENTER_RIGHT);
        textField5.setAlignment(Pos.CENTER_RIGHT);

        // creates a calculator button
        Button calculator = new Button("Calculator");

        //the Border Pane helps to set the calculator button to the right side
        BorderPane borderPane = new BorderPane();
        borderPane.setRight(calculator);

        //the GridPane container is the main container which helps to place labels and text fields in table style
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5); // sets horizontal and vertical gaps between objects to 5
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER); // sets the GridPane to the center

        // adds labels and text field to the GridPane
        gridPane.add(textLine1, 0, 0);
        gridPane.add(textLine2, 0, 1);
        gridPane.add(textLine3, 0, 2);
        gridPane.add(textLine4, 0, 3);
        gridPane.add(textLine5, 0, 4);
        gridPane.add(textField1, 1, 0);
        gridPane.add(textField2, 1, 1);
        gridPane.add(textField3, 1, 2);
        gridPane.add(textField4, 1, 3);
        gridPane.add(textField5, 1, 4);
        gridPane.add(borderPane, 1, 5);

        // we don't really need a VBox here, but I decided to leave it
        // the VBox is the container which contains everything including the GridPane
        VBox vBox = new VBox(gridPane);
        vBox.setAlignment(Pos.CENTER); // sets the VBox to the center

        // creates the Scene
        Scene scene = new Scene(fxmlLoader.load(), 300, 240);

        stage.setScene(scene);  // sets scene
        stage.show(); // shows scene
    }

    public static void main(String[] args) {
        launch();
    }
}