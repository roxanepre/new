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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import modele.Produit;

/**
 *
 * @author roxanepierre
 */
public class ProduitView {
    Scene scene_produit;
    
    GridPane pane_produit_info = new GridPane();
    AnchorPane pane_produit_next = new AnchorPane();
    BorderPane pane_produit = new BorderPane();
    HBox hb_produit = new HBox(15);
    //Scene scene_produit = new Scene(pane_produit);
    Label code_prod = new Label("code produit");
    TextField recup_code_prod = new TextField();
    Label desc_prod = new Label("description ");
    TextField recup_desc_prod = new TextField();
    Button creer_prod = new Button("créer");
    Button aff_prod = new Button("afficher");
    Button mod_prod = new Button("modifier");
    Button supp_prod = new Button("supprimer");
    Menu produit_b = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_produit = new MenuBar();

    public ProduitView() {
        this.pane_produit_info.add(this.code_prod,0,0,1,1);
        this.pane_produit_info.add(this.recup_code_prod,1,0,1,1);
        this.pane_produit_info.add(this.desc_prod,0,1,1,1);
        this.pane_produit_info.add(this.recup_desc_prod,1,1,1,1);
        this.hb_produit.getChildren().addAll(this.creer_prod,this.aff_prod,this.mod_prod,this.supp_prod);
        pane_produit_next.getChildren().add(this.hb_produit);
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_produit.getMenus().addAll(this.produit_b, this.gamme_b, this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_produit.setCenter(this.pane_produit_info);
        this.pane_produit.setBottom(this.pane_produit_next);
        this.pane_produit.setTop(this.barre_menu_produit);
    }
    
    public void actionProd(Scene scene){
        this.scene_produit = scene;
        scene.setRoot(pane_produit);
        //AccueilView.getFenetre_principale().setScene(scene);
        //AccueilView.getFenetre_principale().show();
        
        //ProduitView view_prod = new ProduitView();
        ControleProduit controler_prod = new ControleProduit(this);
        Produit prod_12 = new Produit();
        
        this.creer_prod.setOnAction(evt -> {controler_prod.creerProd();});
        this.aff_prod.setOnAction(evt -> {controler_prod.afficherProd(prod_12);});
        this.mod_prod.setOnAction(evt -> {controler_prod.modifierProd(prod_12);});
        this.supp_prod.setOnAction(evt -> {controler_prod.supprimerProd(prod_12);});
        this.produit_b.setOnAction(e->{controler_prod.afficherProduitScene();});
        this.gamme_b.setOnAction(e->{controler_prod.afficherGammeScene();});
        this.operation_b.setOnAction(e->{controler_prod.afficherOperationScene();});
        this.equipement_b.setOnAction(e->{controler_prod.afficherEquipementScene();});
        this.personnel_b.setOnAction(e->{controler_prod.afficherPersonnelScene();});
        this.poste_b.setOnAction(evt -> {controler_prod.afficherposteScene();});
        this.machine_b.setOnAction(evt ->{controler_prod.affichermachineScene();});
        
    
    }
    public Scene getScene(){
        return scene_produit;
    }
    
    public TextField getRecup_code_prod() {
        return recup_code_prod;
    }

    public TextField getRecup_desc_prod() {
        return recup_desc_prod;
    }
}
