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
public class ProduitView {
    
    BorderPane pane_produit = new BorderPane();
    Scene scene_produit = new Scene(pane_produit);
    Label code_prod = new Label("code produit");
    TextField recup_code_prod = new TextField();
    Label desc_prod = new Label("description ");
    TextField recup_desc_prod = new TextField();
    Button creer_prod = new Button("créer");
    Button aff_prod = new Button("afficher");
    Button mod_prod = new Button("modifier");
    Button supp_prod = new Button("supprimer");
    pane_produit.getChildren().addAll(code_prod,recup_code_prod,desc_prod,recup_desc_prod,creer_prod,mod_prod,aff_prod,supp_prod);
}
