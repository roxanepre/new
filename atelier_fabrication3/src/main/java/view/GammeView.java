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
    GridPane pane_gamme_info = new GridPane();
    AnchorPane pane_gamme_loc = new AnchorPane();
    BorderPane pane_gamme = new BorderPane();
    HBox hb_gamme = new HBox(15);
    Scene scene_gamme = new Scene(pane_gamme,400,300);
    Label ref_gam = new Label("reference");
    TextField recup_ref_gam = new TextField();
    Label id_gam = new Label("identifiant");
    TextField recup_id_gam = new TextField();
    Button creer_gamme = new Button("Créer");
    Button aff_gamme = new Button("Afficher");
    Button mod_gamme = new Button("Modifier");
    Button supp_gamme = new Button("Ajouter");
    Button ajout_mach = new Button("Ajouter une machine");
    Button ajout_op = new Button("Ajouter une opération");
    Menu produit_b = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_gamme = new MenuBar();
    //Button dur_gamme = new Button("Durée gamme");
    //Button c_gamme = new Button("Coût gamme");
    //j'ai déjà mis les calculs de durée et de cout directement dans creerGamme en appelant les méthodes de Gamme qui le font
    
    public GammeView() {
        this.pane_gamme_info.add(this.ref_gam,0,0,1,1);
        this.pane_gamme_info.add(this.recup_ref_gam,0,1,1,1);
        this.pane_gamme_info.add(this.id_gam,1,0,1,1);
        this.pane_gamme_info.add(this.recup_id_gam,1,1,1,1);
        this.hb_gamme.getChildren().addAll(this.creer_gamme,this.aff_gamme,this.mod_gamme,this.supp_gamme, this.ajout_mach, this.ajout_op);
        this.pane_gamme_loc.setRightAnchor(this.hb_gamme,10.0);
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_gamme.getMenus().addAll(this.produit_b, this.gamme_b, this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_gamme.setCenter(this.pane_gamme_info);
        this.pane_gamme.setBottom(this.pane_gamme_loc);
        this.pane_gamme.setTop(this.barre_menu_gamme);
    } 
    
    public void afficheGamme(Scene scene){
        this.scene_gamme = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        Produit prod_g = new Produit();
        Gamme gamme_g = new Gamme();
        Machine mach_g = new Machine();
        Operation op_g = new Operation();
        
        GammeView vue_gam = new GammeView();
        ControleGamme controler_gamme = new ControleGamme(vue_gam);
        
        this.creer_gamme.setOnAction(evt -> {controler_gamme.creerGamme(prod_g);});
        this.aff_gamme.setOnAction(evt -> {controler_gamme.afficherGamme(gamme_g);});
        this.mod_gamme.setOnAction(evt -> {controler_gamme.modifierGamme(gamme_g);});
        this.supp_gamme.setOnAction(evt -> {controler_gamme.supprimerGamme(gamme_g);});
        this.ajout_op.setOnAction(evt -> {controler_gamme.ajouterOp(gamme_g,op_g);});
        this.ajout_mach.setOnAction(evt -> {controler_gamme.ajouterMach(gamme_g,mach_g);});
        this.produit_b.setOnAction(e->{controler_gamme.afficherProduitScene(scene);});
        this.gamme_b.setOnAction(e->{controler_gamme.afficherGammeScene(scene);});
        this.operation_b.setOnAction(e->{controler_gamme.afficherOperationScene(scene);});
        this.equipement_b.setOnAction(e->{controler_gamme.afficherEquipementScene(scene);});
        this.personnel_b.setOnAction(e->{controler_gamme.afficherPersonnelScene(scene);});
        this.poste_b.setOnAction(evt -> {controler_gamme.afficherposteScene(scene);});
        this.machine_b.setOnAction(evt ->{controler_gamme.affichermachineScene(scene);});
        
        
    }
    public TextField getRecup_ref_gam() {
        return recup_ref_gam;
    }

    public TextField getRecup_id_gam() {
        return recup_id_gam;
    }
    
   
}
    
    

    
    
