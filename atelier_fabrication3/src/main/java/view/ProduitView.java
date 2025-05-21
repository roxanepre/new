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

/**
 *
 * @author roxanepierre
 */
public class ProduitView {
    
    BorderPane pane_produit = new BorderPane();
    Scene scene_produit = new Scene(pane_produit);
   
    Label code_prod = new Label("code produit");
    TextField recup_code_prod = new TextField();
    Label desc_prod = new Label("description ");
    TextField recup_desc_prod = new TextField();
    
    ControleProduit controler_prod = new ControleProduit();
    
    Button creer_prod = new Button("créer");
    
    creer_prod.setOnAction(evt -> {
        controler_prod.creerProd();});
        
    Button aff_prod = new Button("afficher");
    
    aff_prod.setOnAction(evt -> {
        controler_prod.creerPoste();});
        
    Button mod_prod = new Button("modifier");
    
    mod_prod.setOnAction(evt -> {
        controler_prod.creerProd();});
        
    Button supp_prod = new Button("supprimer");
    
    supp_prod.setOnAction(evt -> {
        controler_prod.creerProd();});
    
    
    //pane_produit.getChildren().addAll(code_prod,recup_code_prod,desc_prod,recup_desc_prod,creer_prod,mod_prod,aff_prod,supp_prod);

    public TextField getRecup_code_prod() {
        return recup_code_prod;
    }

    public TextField getRecup_desc_prod() {
        return recup_desc_prod;
    }
}
