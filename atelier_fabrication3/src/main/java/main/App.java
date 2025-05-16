package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * JavaFX App
 */
public class App extends Application {

    public void start(Stage stage) {
    
        // paramèttres de la fenêtre
        stage.setTitle("Atelier de fabrication");
        stage.setScene(scene_welcome);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}