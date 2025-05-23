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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import controler.ControleGamme;

/**
 *
 * @author roxanepierre
 */

public class GammeView {
    GridPane pane_gamme_info = new GridPane();
    AnchorPane pane_gamme_loc = new AnchorPane();
    BorderPane pane_gamme = new BorderPane();
    HBox hb_gamme = new HBox(15);
    Scene scene_gamme = new Scene(pane_gamme,400,300);
    
    Label ref_gam = new Label("reference");
    TextField recup_ref_gam = new TextField();
    Label id_gam = new Label("identifiant");
    TextField recup_id_gam = new TextField();

    public TextField getRecup_ref_gam() {
        return recup_ref_gam;
    }

    public TextField getRecup_id_gam() {
        return recup_id_gam;
    }
    
    Button creer_gamme = new Button("Créer");
    Button aff_gamme = new Button("Afficher");
    Button mod_gamme = new Button("Modifier");
    Button supp_gamme = new Button("Ajouter");
    Button dur_gamme = new Button("Durée gamme");
    Button c_gamme = new Button("Coût gamme");
    
    public GammeView() {
        this.pane_gamme_info.add(this.ref_gam,0,0,1,1);
        this.pane_gamme_info.add(this.recup_ref_gam,0,1,1,1);
        this.pane_gamme_info.add(this.id_gam,1,0,1,1);
        this.pane_gamme_info.add(this.recup_id_gam,1,1,1,1);
        this.hb_gamme.getChildren().addAll(this.creer_gamme,this.aff_gamme,this.mod_gamme,this.supp_gamme,this.c_gamme,this.dur_gamme);
        this.pane_gamme_loc.setRightAnchor(this.hb_gamme,10.0);
        this.pane_gamme.setCenter(this.pane_gamme_info);
        this.pane_gamme.setBottom(this.pane_gamme_loc);
    } 
    
    public void afficheGamme(Scene scene){
        this.scene_gamme = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        GammeView vue_gam = new GammeView();
        ControleGamme controler_gamme = new ControleGamme(vue_gam);
        
        
    }
}
    
    

    
    
