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

/**
 *
 * @author roxanepierre
 */
public class PosteView {
    
    BorderPane pane_poste = new BorderPane();
    Scene scene_poste = new Scene(pane_poste);
    Label ref_poste = new Label("référence");
    TextField recup_ref_poste = new TextField();
    Label des_poste = new Label("désignation");
    TextField recup_des_poste = new TextField();
    Button creer_poste = new Button("créer");
    Button aff_poste = new Button("afficher");
    Button mod_poste = new Button("modifier");
    Button aj_poste = new Button("ajouter");
    pane_poste.getChildren().addAll(ref_poste,recup_ref_poste,des_poste,recup_des_poste,creer_poste,aff_poste,mod_poste,aj_poste);
        
    
}
