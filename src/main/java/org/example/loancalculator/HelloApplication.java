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
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static java.lang.Math.pow;

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
        textField1.setPrefWidth(150);
        textField2.setPrefWidth(150);
        textField3.setPrefWidth(150);
        textField4.setPrefWidth(150);
        textField5.setPrefWidth(150);

        Button calculator = new Button("Calculator");
        calculator.setOnAction(event -> {
            double annualInterestRate = Double.parseDouble(textField1.getText());
            int numYears = Integer.parseInt(textField2.getText());
            double loanAmount = Double.parseDouble(textField3.getText());
            int numOfMonths = numYears*12;
            double monthlyInterestRate = annualInterestRate / 100 / 12;
            double monthlyPayment = (loanAmount * monthlyInterestRate * pow((1 + monthlyInterestRate), numOfMonths)) / (pow((1 + monthlyInterestRate), numOfMonths) - 1);
            double totalPayment = monthlyPayment * numOfMonths;

            textField4.setText(String.format("%.2f", monthlyPayment));
            textField5.setText(String.format("%.2f", totalPayment));
        });
        BorderPane borderPane = new BorderPane();
        borderPane.setRight(calculator);

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
        gridPane.add(borderPane, 1, 5);

        VBox vBox = new VBox(gridPane);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);

        Scene scene = new Scene(vBox, 300, 240);
        stage.setTitle("LoanCalculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}