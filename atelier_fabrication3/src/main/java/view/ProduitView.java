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
    Label code_prod = new Label("Code produit :  ");
    TextField recup_code_prod = new TextField();
    Label desc_prod = new Label("Description :  ");
    TextField recup_desc_prod = new TextField();
    Button creer_prod = new Button("Créer");
    Button aff_prod = new Button("Afficher");
    Button mod_prod = new Button("Modifier");
    Button supp_prod = new Button("Supprimer");
    Menu produit_b = new Menu("Produit");
    Menu produit_b1 = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu gamme_b1 = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu operation_b1 = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu personnel_b1 = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_produit = new MenuBar();

    public ProduitView() {
        pane_produit_info.add(code_prod,0,0,1,1);
        pane_produit_info.add(recup_code_prod,1,0,1,1);
        pane_produit_info.add(desc_prod,0,1,1,1);
        pane_produit_info.add(recup_desc_prod,1,1,1,1);
        hb_produit.getChildren().addAll(creer_prod,aff_prod,mod_prod,supp_prod);
        pane_produit_next.getChildren().add(hb_produit);
        equipement_b.getItems().addAll(machine_b,poste_b);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        barre_menu_produit.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_produit.setCenter(pane_produit_info);
        pane_produit.setBottom(pane_produit_next);
        pane_produit.setTop(barre_menu_produit);
    }
    
    public void actionProd(Scene scene){
        this.scene_produit = scene;
        scene.setRoot(pane_produit);
        ControleProduit controler_prod = new ControleProduit(this);
        Produit prod_12 = new Produit();
        
        creer_prod.setOnAction(evt -> {controler_prod.creerProd();});
        aff_prod.setOnAction(evt -> {controler_prod.afficherProd(prod_12);});
        mod_prod.setOnAction(evt -> {controler_prod.modifierProd(prod_12);});
        supp_prod.setOnAction(evt -> {controler_prod.supprimerProd(prod_12);});
        produit_b.setOnAction(e->{controler_prod.afficherProduitScene();});
        gamme_b.setOnAction(e->{controler_prod.afficherGammeScene();});
        operation_b.setOnAction(e->{controler_prod.afficherOperationScene();});
        equipement_b.setOnAction(e->{controler_prod.afficherEquipementScene();});
        personnel_b.setOnAction(e->{controler_prod.afficherPersonnelScene();});
        poste_b.setOnAction(evt -> {controler_prod.afficherposteScene();});
        machine_b.setOnAction(evt ->{controler_prod.affichermachineScene();});
        
    
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

    public Label getCode_prod() {
        return code_prod;
    }

    public Label getDesc_prod() {
        return desc_prod;
    }
    
}
