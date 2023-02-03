package com.example.resistrontest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import java.io.IOException;

public class Resistroncode extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resistronApp.fxml"));
        Stage stage = loader.load();
        stage.show();
    }
    //We declare 4 variables, one for each line to which we will assign a value according to the button clicked
    static int valueline1;
    static int valueline2;
    static double valueline3 = 1;
    static double valueline4;
}
