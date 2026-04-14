package com.mycompany.marketplacesimulation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Load the HomeView we created above
        HomeView homeView = new HomeView();
        
        // Put it in a Scene
        Scene scene = new Scene(homeView, 640, 480);
        
        // Show the window
        stage.setScene(scene);
        stage.setTitle("Marketplace Sim");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}