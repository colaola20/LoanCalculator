module org.example.loancalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.loancalculator to javafx.fxml;
    exports org.example.loancalculator;
}