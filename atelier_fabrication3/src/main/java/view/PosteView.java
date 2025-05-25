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
    //Scene scene_poste = new Scene(pane_poste);
    Label ref_poste = new Label("Référence :  ");
    TextField recup_ref_poste = new TextField();
    Label des_poste = new Label("Désignation :  ");
    TextField recup_des_poste = new TextField();
    Button creer_poste = new Button("Créer");
    Button aff_poste = new Button("Afficher");
    Button mod_poste = new Button("Modifier");
    Button supp_poste = new Button("Supprimer");
    Menu produit_b = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_poste = new MenuBar();
    
    public PosteView() {
        this.pane_poste_info.add(this.ref_poste,0,0,1,1);
        this.pane_poste_info.add(this.recup_ref_poste,1,0,1,1);
        this.pane_poste_info.add(this.des_poste,0,1,1,1);
        this.pane_poste_info.add(this.recup_des_poste,1,1,1,1);
        this.hb_poste.getChildren().addAll(this.creer_poste,this.aff_poste,this.mod_poste,this.supp_poste);
        pane_poste_next.getChildren().add(this.hb_poste);
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_poste.getMenus().addAll(this.produit_b, this.gamme_b, this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_poste.setBottom(this.pane_poste_next);
        this.pane_poste.setCenter(this.pane_poste_info);
        this.pane_poste.setTop(this.barre_menu_poste);
    }
    
    public void afficheposte (Scene scene){
        this.scene_poste = scene;
        scene.setRoot(pane_poste);
        //AccueilView.getFenetre_principale().setScene(scene);
        //AccueilView.getFenetre_principale().show();
        
        //PosteView view_poste = new PosteView();
        ControlePoste controler_poste = new ControlePoste(this) ;
        Poste poste_12 = new Poste();
        
        this.creer_poste.setOnAction(evt -> {controler_poste.creerPoste();});
        this.aff_poste.setOnAction(evt -> {controler_poste.afficherPoste(poste_12);});
        this.mod_poste.setOnAction(evt -> {controler_poste.modifierPoste(poste_12);});
        this.supp_poste.setOnAction(evt -> {controler_poste.supprimerPoste(poste_12);});
        this.produit_b.setOnAction(e->{controler_poste.afficherProduitScene();});
        this.gamme_b.setOnAction(e->{controler_poste.afficherGammeScene();});
        this.operation_b.setOnAction(e->{controler_poste.afficherOperationScene();});
        this.equipement_b.setOnAction(e->{controler_poste.afficherEquipementScene();});
        this.personnel_b.setOnAction(e->{controler_poste.afficherPersonnelScene();});
        this.poste_b.setOnAction(evt -> {controler_poste.afficherposteScene();});
        this.machine_b.setOnAction(evt ->{controler_poste.affichermachineScene();});
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
