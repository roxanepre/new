/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.ControleAccueil;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 *
 * @author User
 */
public class AccueilView {
    public static Stage fenetre_principale = new Stage();
    BorderPane layout = new BorderPane();
    VBox pane_welcome = new VBox(8);
    Scene scene = new Scene(layout);
    Label welcome = new Label("Bienvenue dans l'application de votre atelier !");
    Button enter_atelier = new Button("Entrer dans l'atelier");
    
    public AccueilView(Stage stage) {
        AccueilView.fenetre_principale = stage;
        stage.setTitle("Atelier de fabrication");
        stage.setMaxHeight(800);
        stage.setMaxWidth(1000);
        stage.setMinHeight(400);
        stage.setMinWidth(600);
        stage.isResizable();
        pane_welcome.getChildren().addAll(welcome,enter_atelier);
        layout.setCenter(pane_welcome);
        stage.setScene(scene);
        ControleAccueil controleur = new ControleAccueil(this);
        enter_atelier.setOnAction(evt -> {controleur.afficher();});
    }
        
    public Scene getScene() {
        return scene;
    }
    public static Stage getFenetre_principale() {
        return fenetre_principale;
    }

    public void setFenetre_principale(Stage fenetre_principale) {
        AccueilView.fenetre_principale = fenetre_principale;
    }
    
}
    

