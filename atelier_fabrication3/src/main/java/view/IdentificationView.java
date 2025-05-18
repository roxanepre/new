/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class IdentificationView {
    BorderPane pane_identification = new BorderPane();
    Scene scene_identification = new Scene(pane_identification,400,300);
    Label id = new Label("Identifiez-vous");
    Label identifiant = new Label ("Identifiant :");
    TextField recup_identifiant = new TextField();
    Label pwd = new Label ("Mot de passe :");
    TextField recup_pwd = new TextField();
    Button next_id = new Button("Suivant");
    
    public IdentificationView(){
        pane_identification.getChildren().addAll(id,identifiant,recup_identifiant,pwd,recup_pwd,next_id);
       
    }
    
    public void afficher(Stage stage){
        stage.setScene(scene_identification);
        stage.show();
        
    }
     // il faut placer les différents composants
}
