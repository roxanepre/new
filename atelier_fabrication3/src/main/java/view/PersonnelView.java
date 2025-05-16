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
public class PersonnelView {
 
    BorderPane pane_personnel = new BorderPane();
    Scene scene_personnel = new Scene(pane_personnel);
    
    Label id_pers = new Label("identifiant personnel");
        TextField recup_id_pers = new TextField();
        Label nom_pers = new Label("Nom");
        TextField recup_nom_pers = new TextField();
        Label pren_pers = new Label("Prénom");
        TextField recup_pren_pers = new TextField();
        Label mdp_pers = new Label("mot de passe");
        TextField recup_mdp_pers = new TextField();
        Label dispo_pers = new Label("disponibilité");
        TextField recup_dispo_pers = new TextField();
        Label comp_mac = new Label("compétences machine");
        TextField recup_comp_mac = new TextField();
        Button fiche = new Button("fiche");
        Button embauche = new Button("embaucher");
        Button virer = new Button("virer");
        pane_personnel.getChildren().addAll(id_pers,recup_id_pers,nom_pers,recup_nom_pers,pren_pers,recup_pren_pers,mdp_pers,recup_mdp_pers,dispo_pers,recup_dispo_pers,comp_mac,recup_comp_mac,fiche,embauche,virer);
        
}
