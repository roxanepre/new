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
    Scene scene_personnel;
    
    GridPane pane_personnel_info = new GridPane();
    AnchorPane pane_personnel_next = new AnchorPane();
    BorderPane pane_personnel = new BorderPane();
    HBox hb_personnel = new HBox(15);
    //Scene scene_personnel = new Scene(pane_personnel);
    Label id_pers = new Label("Identifiant personnel :  ");
    TextField recup_id_pers = new TextField();
    Label nom_pers = new Label("Nom :  ");
    TextField recup_nom_pers = new TextField();
    Label pren_pers = new Label("Prénom :  ");
    TextField recup_pren_pers = new TextField();
    Label mdp_pers = new Label("Mot de passe :  ");
    TextField recup_mdp_pers = new TextField();
    Label dispo_pers = new Label("Disponibilité :  ");
    TextField recup_dispo_pers = new TextField();
    Label comp_mac = new Label("Compétences machine :  ");
    TextField recup_comp_mac = new TextField();
    Button fiche = new Button("Fiche");
    Button embauche = new Button("Embaucher");
    Button virer = new Button("Virer");
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
    MenuBar barre_menu_personnel = new MenuBar();

    public PersonnelView() {
        pane_personnel_info.add(id_pers,0,0,1,1);
        pane_personnel_info.add(recup_id_pers,1,0,1,1);
        pane_personnel_info.add(nom_pers,0,1,1,1);
        pane_personnel_info.add(recup_nom_pers,1,1,1,1);
        pane_personnel_info.add(pren_pers,0,2,1,1);
        pane_personnel_info.add(recup_pren_pers,1,2,1,1);
        pane_personnel_info.add(mdp_pers,0,3,1,1);
        pane_personnel_info.add(recup_mdp_pers,1,3,1,1);
        pane_personnel_info.add(dispo_pers,0,4,1,1);
        pane_personnel_info.add(recup_dispo_pers,1,4,1,1);
        pane_personnel_info.add(comp_mac,0,5,1,1);
        pane_personnel_info.add(recup_comp_mac,1,5,1,1);
        hb_personnel.getChildren().addAll(fiche,embauche,virer);
        pane_personnel_next.getChildren().add(hb_personnel);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        equipement_b.getItems().addAll(machine_b,poste_b);
        barre_menu_personnel.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_personnel.setCenter(pane_personnel_info);
        pane_personnel.setBottom(pane_personnel_next);
        pane_personnel.setTop(barre_menu_personnel);
    }
    
    public void actionPersonnel(Scene scene){
        this.scene_personnel = scene;
        scene.setRoot(pane_personnel);
        ControlePersonnel controler_pers = new ControlePersonnel(this);
        Personnel pers_12 = new Personnel();
        fiche.setOnAction(evt -> {controler_pers.fichePersonnel(pers_12);});
        embauche.setOnAction(evt -> {controler_pers.embaucherPersonnel();});
        virer.setOnAction(evt -> {controler_pers.virerPersonnel(pers_12);}); 
        produit_b.setOnAction(e->{controler_pers.afficherProduitScene();});
        gamme_b.setOnAction(e->{controler_pers.afficherGammeScene();});
        operation_b.setOnAction(e->{controler_pers.afficherOperationScene();});
        equipement_b.setOnAction(e->{controler_pers.afficherEquipementScene();});
        personnel_b.setOnAction(e->{controler_pers.afficherPersonnelScene();});
        poste_b.setOnAction(evt -> {controler_pers.afficherposteScene();});
        machine_b.setOnAction(evt ->{controler_pers.affichermachineScene();});
        
        
    }

    public Scene getScene(){
        return scene_personnel;
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

    public Label getId_pers() {
        return id_pers;
    }

    public Label getNom_pers() {
        return nom_pers;
    }

    public Label getPren_pers() {
        return pren_pers;
    }

    public Label getMdp_pers() {
        return mdp_pers;
    }

    public Label getDispo_pers() {
        return dispo_pers;
    }

    public Label getComp_mac() {
        return comp_mac;
    }
   
}
