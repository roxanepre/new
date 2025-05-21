/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import controler.*;

/**
 *
 * @author roxanepierre
 */
public class PosteView {
    
    GridPane pane_poste_info = new GridPane();
    AnchorPane pane_poste_next = new AnchorPane();
    BorderPane pane_poste = new BorderPane();
    HBox hb_poste = new HBox(15);
    Scene scene_poste = new Scene(pane_poste);
    Label ref_poste = new Label("Référence");
    TextField recup_ref_poste = new TextField();
    Label des_poste = new Label("Désignation");
    TextField recup_des_poste = new TextField();
    Button creer_poste = new Button("Créer");
    Button aff_poste = new Button("Afficher");
    Button mod_poste = new Button("Modifier");
    Button supp_poste = new Button("Ajouter");
    
    public PosteView() {
        this.pane_poste_info.add(this.ref_poste,0,0,1,1);
        this.pane_poste_info.add(this.recup_ref_poste,0,1,1,1);
        this.pane_poste_info.add(this.des_poste,1,0,1,1);
        this.pane_poste_info.add(this.recup_des_poste,1,1,1,1);
        this.hb_poste.getChildren().addAll(this.creer_poste,this.aff_poste,this.mod_poste,this.supp_poste);
        this.pane_poste_next.setRightAnchor(this.hb_poste,10.0);
        this.pane_poste.setBottom(this.pane_poste_next);
        this.pane_poste.setCenter(this.pane_poste_info);
    }
    
    public void afficheposte (Scene scene){
        this.scene_poste = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        
        PosteView view_poste = new PosteView();
        ControlePoste controler_poste = new ControlePoste(view_poste) ;
        this.creer_poste.setOnAction(evt -> {controler_poste.creerPoste();});
        this.aff_poste.setOnAction(evt -> {controler_poste.afficherPoste();});
        this.mod_poste.setOnAction(evt -> {controler_poste.modifierPoste();});
        this.supp_poste.setOnAction(evt -> {controler_poste.supprimerPoste();});
    }
    
    public TextField getRecup_ref_poste() {
        return recup_ref_poste;
    }

    public TextField getRecup_des_poste() {
        return recup_des_poste;
    }

}
