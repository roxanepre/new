/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.stage.Stage;
import controler.ControleIdentification;
/**
 *
 * @author User
 */

public class IdentificationView {
    Scene scene_identification;
    GridPane pane_identification_info = new GridPane();
    HBox pane_id_next = new HBox(15);
    BorderPane pane_identification = new BorderPane();
    Label id = new Label("Identifiez-vous");
    Label identifiant = new Label ("Identifiant :");
    public TextField recup_identifiant = new TextField();
    Label pwd = new Label ("Mot de passe :");
    public TextField recup_pwd = new TextField();
    Button next_id = new Button("Chef");
    Button next_idO = new Button("Op");
    
    
    public IdentificationView(){
        pane_identification_info.add(identifiant,0,0,1,1);
        pane_identification_info.add(recup_identifiant,1,0,1,1);
        pane_identification_info.add(pwd,0,1,1,1);
        pane_identification_info.add(recup_pwd,1,1,1,1);
        pane_id_next.getChildren().addAll(next_id,next_idO);
        pane_identification.setTop(id);
        pane_identification.setCenter(pane_identification_info);
        pane_identification.setBottom(pane_id_next);
    }
    
    public void affich(Scene scene){
        this.scene_identification = scene;
        scene.setRoot(pane_identification);
        ControleIdentification controleur_id = new ControleIdentification(this);
       next_id.setOnAction(evt -> {controleur_id.afficherMenuC();});
       next_idO.setOnAction(evt ->{controleur_id.afficherMenuO();});
    }

    public TextField getRecup_identifiant(){
        return recup_identifiant;
    }
    
    public TextField getRecup_pwd(){
        return recup_pwd;
    }
    
    public Scene getScene() {
        return scene_identification;
    }
    // getters et setters
}

