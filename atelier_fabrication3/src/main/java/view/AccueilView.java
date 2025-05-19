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
    public Stage fenetre_principale = new Stage();
    StackPane pane_welcome = new StackPane();
    Scene scene_welcome = new Scene(pane_welcome,400,300);
    Label welcome = new Label("Bienvenue dans l'application de votre atelier !");
    Button enter_atelier = new Button("Entrer dans l'atelier");
    // pane_welcome.getChildren().addAll(welcome,enter_atelier); //cette ligne ne marche pas car il n'y a pas de constructeur
    
    public AccueilView(Stage stage) {
        this.fenetre_principale = stage;
        stage.setTitle("Atelier de fabrication");
        stage.setMaxHeight(2362);
        stage.setMaxWidth(2573);
        stage.setMinHeight(1772);
        stage.setMinWidth(2362);
        stage.isResizable();
        stage.isMaximized();
        pane_welcome.getChildren().addAll(welcome,enter_atelier);
        stage.setScene(scene_welcome);
        
        ControleAccueil controleur = new ControleAccueil(/*stage*/);        
        enter_atelier.setOnAction(evt -> {controleur.afficher(stage);});
        stage.show();
        
        
    }
}
    

