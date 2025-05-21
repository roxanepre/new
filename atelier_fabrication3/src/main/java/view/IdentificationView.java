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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import controler.ControleIdentification;
/**
 *
 * @author User
 */

public class IdentificationView {
    //public Stage stage;
    GridPane pane_identification_info = new GridPane();
    AnchorPane pane_id_next = new AnchorPane();
    BorderPane pane_identification = new BorderPane();
    Scene scene_identification = new Scene(pane_identification,400,300);
    Label id = new Label("Identifiez-vous");
    Label identifiant = new Label ("Identifiant :");
    public TextField recup_identifiant = new TextField();
    Label pwd = new Label ("Mot de passe :");
    public TextField recup_pwd = new TextField();
    Button next_id = new Button("Suivant");
    //Label message = new Label();
    
    
    public IdentificationView(Scene scene){
        this.pane_identification_info.add(this.identifiant,0,0,1,1);
        this.pane_identification_info.add(this.recup_identifiant,0,1,1,1);
        this.pane_identification_info.add(this.pwd,1,0,1,1);
        this.pane_identification_info.add(this.recup_pwd,1,1,1,1);
        this.pane_id_next.setRightAnchor(this.next_id,10.0);
        this.pane_identification.setTop(this.id);
        this.pane_identification.setCenter(this.pane_identification_info);
        this.pane_identification.setBottom(this.pane_id_next);
        this.scene_identification=scene;
        // pour le constructeur ci dessus, on pourrait aussi le faire avec des layout
        //mais je pense qu ca va comme ca 
    }
    
    public void affich(Scene scene){
        this.scene_identification = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        IdentificationView id_view = new IdentificationView(scene);
        
       // la méthode afficher prend en paramètre le stage
       //on attricut le stage donné en paramètre à la vue
       //on met la scene dans le stage
       //on affcihe avec show
       
       ControleIdentification controleur_id = new ControleIdentification(id_view);
       next_id.setOnAction(evt -> {controleur_id.verification(this.recup_identifiant.getText(),this.recup_pwd.getText());});
                
           }
    /* de ce que j'ai compris il faut déclarer un objet de la classe controleur,
    puis on défénit ce qu'il se passe en clicant sur les boutons avec les setOnaction et les methodes qui se trouveront dans la classe controleur
    
    */
    
    /*public Stage getStage() {
        return stage;
    }*/
    
   // public Label get Message {
   // return message;

    public TextField getRecup_identifiant(){
        return recup_identifiant;
    }
    
    public TextField getRecup_pwd(){
        return recup_pwd;
    }
    
    // getters et setters
}

