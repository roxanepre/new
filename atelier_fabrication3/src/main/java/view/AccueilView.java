/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.ControleAccueil;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author User
 */
public class AccueilView {
    StackPane pane_welcome = new StackPane();
    Scene scene_welcome = new Scene(pane_welcome,400,300);
    Label welcome = new Label("Bienvenue dans l'application de votre atelier !");
    Button enter_atelier = new Button("Entrer dans l'atelier");
    // pane_welcome.getChildren().addAll(welcome,enter_atelier); //cette ligne ne marche pas car il n'y a pas de constructeur
    
    public AccueilView(Stage stage) {
        pane_welcome.getChildren().addAll(welcome,enter_atelier);
        stage.setScene(scene_welcome);
        
        ControleAccueil controleur = new ControleAccueil(this);        
        enter_atelier.setOnAction(e->controleur.afficher(stage));
        stage.show();
        
        
    }
}
    

