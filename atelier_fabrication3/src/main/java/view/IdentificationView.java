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
import javafx.stage.Stage;
import controler.ControleIdentification;

/**
 *
 * @author User
 */

public class IdentificationView {
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
    
    
    public IdentificationView(/*Scene scene*/){
        pane_identification_info.add(identifiant,0,0,1,1);
        pane_identification_info.add(recup_identifiant,0,1,1,1);
        pane_identification_info.add(pwd,1,0,1,1);
        pane_identification_info.add(recup_pwd,1,1,1,1);
        pane_id_next.setRightAnchor(next_id,10.0);
        pane_identification.setTop(id);
        pane_identification.setCenter(pane_identification_info);
        pane_identification.setBottom(pane_id_next);
        //this.scene_identification=scene;
        
        ControleIdentification controleur_id = new ControleIdentification(/*scene*/);
        next_id.setOnAction(evt -> {controleur_id.verification(recup_identifiant.getText(),recup_pwd.getText());});
        
    }
    
    public void affich(Stage stage){
        stage.setScene(scene_identification);
        stage.show();
        
    }
}
