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
import controler.* ;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import controler.ControlePersonnel;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import modele.Personnel;

/**
 *
 * @author roxanepierre
 */
public class PersonnelView {
 
    GridPane pane_personnel_info = new GridPane();
    AnchorPane pane_personnel_next = new AnchorPane();
    BorderPane pane_personnel = new BorderPane();
    HBox hb_personnel = new HBox(15);
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
    Menu produit_b = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_personnel = new MenuBar();

    public PersonnelView() {
        this.pane_personnel_info.add(this.id_pers,0,0,1,1);
        this.pane_personnel_info.add(this.recup_id_pers,0,1,1,1);
        this.pane_personnel_info.add(this.nom_pers,1,0,1,1);
        this.pane_personnel_info.add(this.recup_nom_pers,1,1,1,1);
        this.pane_personnel_info.add(this.pren_pers,2,0,1,1);
        this.pane_personnel_info.add(this.recup_pren_pers,2,1,1,1);
        this.pane_personnel_info.add(this.mdp_pers,3,0,1,1);
        this.pane_personnel_info.add(this.recup_mdp_pers,3,1,1,1);
        this.pane_personnel_info.add(this.dispo_pers,4,0,1,1);
        this.pane_personnel_info.add(this.recup_dispo_pers,4,1,1,1);
        this.pane_personnel_info.add(this.comp_mac,5,0,1,1);
        this.pane_personnel_info.add(this.recup_comp_mac,5,1,1,1);
        this.hb_personnel.getChildren().addAll(this.fiche, this.embauche,this.virer);
        this.pane_personnel_next.setRightAnchor(this.hb_personnel,10.0);
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_personnel.getMenus().addAll(this.produit_b, this.gamme_b, this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_personnel.setCenter(this.pane_personnel_info);
        this.pane_personnel.setBottom(this.pane_personnel_next);
        this.pane_personnel.setTop(this.barre_menu_personnel);
    }
    
    public void actionPersonnel(Scene scene){
        this.scene_personnel = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        
        PersonnelView view_pers = new PersonnelView();
        ControlePersonnel controler_pers = new ControlePersonnel(view_pers);
        Personnel pers_12 = new Personnel();
        
        this.fiche.setOnAction(evt -> {controler_pers.fichePersonnel(pers_12);});
        this.embauche.setOnAction(evt -> {controler_pers.embaucherPersonnel();});
        this.virer.setOnAction(evt -> {controler_pers.virerPersonnel(pers_12);}); 
        this.produit_b.setOnAction(e->{controler_pers.afficherProduitScene(scene);});
        this.gamme_b.setOnAction(e->{controler_pers.afficherGammeScene(scene);});
        this.operation_b.setOnAction(e->{controler_pers.afficherOperationScene(scene);});
        this.equipement_b.setOnAction(e->{controler_pers.afficherEquipementScene(scene);});
        this.personnel_b.setOnAction(e->{controler_pers.afficherPersonnelScene(scene);});
        this.poste_b.setOnAction(evt -> {controler_pers.afficherposteScene(scene);});
        this.machine_b.setOnAction(evt ->{controler_pers.affichermachineScene(scene);});
        
        
    }

    public TextField getRecup_id_pers() {
        return recup_id_pers;
    }

    public TextField getRecup_nom_pers() {
        return recup_nom_pers;
    }

    public TextField getRecup_pren_pers() {
        return recup_pren_pers;
    }

    public TextField getRecup_mdp_pers() {
        return recup_mdp_pers;
    }

    public TextField getRecup_dispo_pers() {
        return recup_dispo_pers;
    }

    public TextField getRecup_comp_mac() {
        return recup_comp_mac;
    }
   
}
