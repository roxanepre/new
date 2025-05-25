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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import modele.Produit;
import modele.Gamme;
import modele.Operation;
import modele.Machine;

/**
 *
 * @author roxanepierre
 */

public class GammeView {
    Scene scene_gamme;
    
    GridPane pane_gamme_info = new GridPane();
    AnchorPane pane_gamme_loc = new AnchorPane();
    BorderPane pane_gamme = new BorderPane();
    HBox hb_gamme = new HBox(15);
    Label ref_gam = new Label("Référence :  ");
    TextField recup_ref_gam = new TextField();
    Label id_gam = new Label("Identifiant :  ");
    TextField recup_id_gam = new TextField();
    Button creer_gamme = new Button("Créer");
    Button aff_gamme = new Button("Afficher");
    Button mod_gamme = new Button("Modifier");
    Button supp_gamme = new Button("Supprimer");
    Button ajout_mach = new Button("Ajouter une machine");
    Button ajout_op = new Button("Ajouter une opération");
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
    MenuBar barre_menu_gamme = new MenuBar();
    
    public GammeView() {
        pane_gamme_info.add(ref_gam,0,0,1,1);
        pane_gamme_info.add(recup_ref_gam,1,0,1,1);
        pane_gamme_info.add(id_gam,0,1,1,1);
        pane_gamme_info.add(recup_id_gam,1,1,1,1);
        hb_gamme.getChildren().addAll(creer_gamme,aff_gamme,mod_gamme,supp_gamme,ajout_mach,ajout_op);
        pane_gamme_loc.getChildren().add(hb_gamme);
        equipement_b.getItems().addAll(machine_b,poste_b);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        barre_menu_gamme.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_gamme.setCenter(pane_gamme_info);
        pane_gamme.setBottom(pane_gamme_loc);
        pane_gamme.setTop(barre_menu_gamme);
    } 
    
    public void afficheGamme(Scene scene){
        this.scene_gamme = scene;
        scene.setRoot(pane_gamme);
        Produit prod_g = new Produit();
        Gamme gamme_g = new Gamme();
        Machine mach_g = new Machine();
        Operation op_g = new Operation();
        ControleGamme controler_gamme = new ControleGamme(this);
        creer_gamme.setOnAction(evt -> {controler_gamme.creerGamme(prod_g);});
        aff_gamme.setOnAction(evt -> {controler_gamme.afficherGamme(gamme_g);});
        mod_gamme.setOnAction(evt -> {controler_gamme.modifierGamme(gamme_g);});
        supp_gamme.setOnAction(evt -> {controler_gamme.supprimerGamme(gamme_g);});
        ajout_op.setOnAction(evt -> {controler_gamme.ajouterOp(gamme_g,op_g);});
        ajout_mach.setOnAction(evt -> {controler_gamme.ajouterMach(gamme_g,mach_g);});
        produit_b.setOnAction(e->{controler_gamme.afficherProduitScene();});
        gamme_b.setOnAction(e->{controler_gamme.afficherGammeScene();});
        operation_b.setOnAction(e->{controler_gamme.afficherOperationScene();});
        equipement_b.setOnAction(e->{controler_gamme.afficherEquipementScene();});
        personnel_b.setOnAction(e->{controler_gamme.afficherPersonnelScene();});
        poste_b.setOnAction(evt -> {controler_gamme.afficherposteScene();});
        machine_b.setOnAction(evt ->{controler_gamme.affichermachineScene();}); 
    }
    public Scene getScene(){
        return scene_gamme;
    }
    public TextField getRecup_ref_gam() {
        return recup_ref_gam;
    }

    public TextField getRecup_id_gam() {
        return recup_id_gam;
    }
    
   
}
    
    

    
    
