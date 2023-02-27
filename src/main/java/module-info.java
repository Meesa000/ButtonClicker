module com.example.buttonclicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttonclicker to javafx.fxml;
    exports com.example.buttonclicker;
}