package com.rchacin.descansos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override

    public void start(Stage stage){

        Label mensaje = new Label("Descansos T3 - Funciona!");

        StackPane raiz = new StackPane(mensaje);

        Scene escena = new Scene(raiz, 400, 300);

        stage.setScene(escena);
        stage.setTitle("Descansos T3");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
