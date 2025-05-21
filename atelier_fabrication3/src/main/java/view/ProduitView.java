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
import controler.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author roxanepierre
 */
public class ProduitView {
    
    GridPane pane_produit_info = new GridPane();
    AnchorPane pane_produit_next = new AnchorPane();
    BorderPane pane_produit = new BorderPane();
    HBox hb_produit = new HBox(15);
    Scene scene_produit = new Scene(pane_produit);
    Label code_prod = new Label("code produit");
    TextField recup_code_prod = new TextField();
    Label desc_prod = new Label("description ");
    TextField recup_desc_prod = new TextField();
    Button creer_prod = new Button("créer");
    Button aff_prod = new Button("afficher");
    Button mod_prod = new Button("modifier");
    Button supp_prod = new Button("supprimer");

    public ProduitView() {
        this.pane_produit_info.add(this.code_prod,0,0,1,1);
        this.pane_produit_info.add(this.recup_code_prod,0,1,1,1);
        this.pane_produit_info.add(this.desc_prod,1,0,1,1);
        this.pane_produit_info.add(this.recup_desc_prod,1,1,1,1);
        this.hb_produit.getChildren().addAll(this.creer_prod,this.aff_prod,this.mod_prod,this.supp_prod);
        this.pane_produit_next.setRightAnchor(this.hb_produit,10.0);
        this.pane_produit.setCenter(this.pane_produit_info);
        this.pane_produit.setBottom(this.pane_produit_next);
    }
    
    public void actionProd(Scene scene){
        this.scene_produit = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        
        ProduitView view_prod = new ProduitView();
        ControleProduit controler_prod = new ControleProduit(view_prod);
        
        this.creer_prod.setOnAction(evt -> {controler_prod.creerProd();});
        this.aff_prod.setOnAction(evt -> {controler_prod.afficherProd();});
        this.mod_prod.setOnAction(evt -> {controler_prod.modifierProd();});
        this.supp_prod.setOnAction(evt -> {controler_prod.supprimerProd();});
    
    }
    
    public TextField getRecup_code_prod() {
        return recup_code_prod;
    }

    public TextField getRecup_desc_prod() {
        return recup_desc_prod;
    }
}
