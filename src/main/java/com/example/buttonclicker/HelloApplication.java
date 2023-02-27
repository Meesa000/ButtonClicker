package com.example.buttonclicker;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application{
    Scene scene1;
    Scene scene2;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("CLICK ME");
        button.setOnAction(event -> AlertBox.display("Alert box", "PLEASE CLOSE THIS WINDOW."));


        //layout
        StackPane root = new StackPane();
        root.getChildren().addAll(button);
        scene1 = new Scene(root, 300,300);




        primaryStage.setTitle("Button Clicker");
        primaryStage.setScene(scene1);
        primaryStage.show();




    }


}