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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import modele.Poste;

/**
 *
 * @author roxanepierre
 */
public class PosteView {
    Scene scene_poste;
    GridPane pane_poste_info = new GridPane();
    AnchorPane pane_poste_next = new AnchorPane();
    BorderPane pane_poste = new BorderPane();
    HBox hb_poste = new HBox(15);
    Label ref_poste = new Label("Référence :  ");
    TextField recup_ref_poste = new TextField();
    Label des_poste = new Label("Désignation :  ");
    TextField recup_des_poste = new TextField();
    Button creer_poste = new Button("Créer");
    Button aff_poste = new Button("Afficher");
    Button mod_poste = new Button("Modifier");
    Button supp_poste = new Button("Supprimer");
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
    MenuBar barre_menu_poste = new MenuBar();
    
    public PosteView() {
        pane_poste_info.add(ref_poste,0,0,1,1);
        pane_poste_info.add(recup_ref_poste,1,0,1,1);
        pane_poste_info.add(des_poste,0,1,1,1);
        pane_poste_info.add(recup_des_poste,1,1,1,1);
        hb_poste.getChildren().addAll(creer_poste,aff_poste,mod_poste,supp_poste);
        pane_poste_next.getChildren().add(hb_poste);
        equipement_b.getItems().addAll(machine_b,poste_b);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        barre_menu_poste.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_poste.setBottom(pane_poste_next);
        pane_poste.setCenter(pane_poste_info);
        pane_poste.setTop(barre_menu_poste);
    }
    
    public void afficheposte (Scene scene){
        this.scene_poste = scene;
        scene.setRoot(pane_poste);
        ControlePoste controler_poste = new ControlePoste(this) ;
        Poste poste_12 = new Poste();
        creer_poste.setOnAction(evt -> {controler_poste.creerPoste();});
        aff_poste.setOnAction(evt -> {controler_poste.afficherPoste(poste_12);});
        mod_poste.setOnAction(evt -> {controler_poste.modifierPoste(poste_12);});
        supp_poste.setOnAction(evt -> {controler_poste.supprimerPoste(poste_12);});
        produit_b.setOnAction(e->{controler_poste.afficherProduitScene();});
        gamme_b.setOnAction(e->{controler_poste.afficherGammeScene();});
        operation_b.setOnAction(e->{controler_poste.afficherOperationScene();});
        equipement_b.setOnAction(e->{controler_poste.afficherEquipementScene();});
        personnel_b.setOnAction(e->{controler_poste.afficherPersonnelScene();});
        poste_b.setOnAction(evt -> {controler_poste.afficherposteScene();});
        machine_b.setOnAction(evt ->{controler_poste.affichermachineScene();});
    }
    
    public Scene getScene(){
        return scene_poste;
    }
    public TextField getRecup_ref_poste() {
        return recup_ref_poste;
    }

    public TextField getRecup_des_poste() {
        return recup_des_poste;
    }

    public Label getRef_poste() {
        return ref_poste;
    }

    public Label getDes_poste() {
        return des_poste;
    }

}
