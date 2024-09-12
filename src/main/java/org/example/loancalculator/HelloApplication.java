package org.example.loancalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("LoanCalculator");

        Label textLine1 = new Label("Annual Interest Rate:");
        Label textLine2 = new Label("Number of Years:");
        Label textLine3 = new Label("Loan Amount");
        Label textLine4 = new Label("Monthly Payment:");
        Label textLine5 = new Label("Total  Payment:");

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        textField1.setPrefWidth(200);
        textField2.setPrefWidth(200);
        textField3.setPrefWidth(200);
        textField4.setPrefWidth(200);
        textField5.setPrefWidth(200);

        Button calculator = new Button("Calculator");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);
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

        VBox vBox = new VBox(gridPane, calculator);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);
        Scene scene = new Scene(vBox, 350, 240);
        stage.setTitle("LoanCalculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}