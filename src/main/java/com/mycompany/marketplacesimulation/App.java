package com.mycompany.marketplacesimulation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        HomeView homeView = new HomeView();
        
        Scene scene = new Scene(homeView, 640, 480);
        
        stage.setScene(scene);
        stage.setTitle("Marketplace Sim");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}