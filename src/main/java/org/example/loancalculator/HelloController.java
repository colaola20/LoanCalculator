package org.example.loancalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import static java.lang.Math.pow;

public class HelloController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button calculator;

    @FXML
    private GridPane gridPane;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private TextField textField4;

    @FXML
    private TextField textField5;

    @FXML
    private Label textLine1;

    @FXML
    private Label textLine2;

    @FXML
    private Label textLine3;

    @FXML
    private Label textLine4;

    @FXML
    private Label textLine5;

    @FXML
    private VBox vBox;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        double annualInterestRate = Double.parseDouble(textField1.getText());
        int numYears = Integer.parseInt(textField2.getText());
        double loanAmount = Double.parseDouble(textField3.getText());
        int numOfMonths = numYears*12;
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate * pow((1 + monthlyInterestRate), numOfMonths)) / (pow((1 + monthlyInterestRate), numOfMonths) - 1);
        double totalPayment = monthlyPayment * numOfMonths;

        textField4.setText(String.format("%.2f", monthlyPayment));
        textField5.setText(String.format("%.2f", totalPayment));
    }

}
