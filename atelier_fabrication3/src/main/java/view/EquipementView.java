/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import controler.ControleEquipement;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import view.PosteView;

/**
 *
 * @author roxanepierre
 */
public class EquipementView {
    Scene scene_equip;
    BorderPane pane_equip_tot = new BorderPane();
    //Scene scene_equip = new Scene(pane_equip_tot,400,300);
    Label choix_equip = new Label("Veuillez choisir le menu dans lequel vous osuhaitez aller");
    Menu produit_b = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_equipement = new MenuBar();

    public EquipementView() {
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_equipement.getMenus().addAll(this.produit_b, this.gamme_b, this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_equip_tot.setCenter(this.choix_equip);
        this.pane_equip_tot.setTop(this.barre_menu_equipement);
        
    }
    
    public void afficheequip(Scene scene){
        this.scene_equip = scene;
        scene.setRoot(pane_equip_tot);
        //AccueilView.getFenetre_principale().setScene(scene);
        //AccueilView.getFenetre_principale().show();
        //EquipementView view_equip = new EquipementView();
        ControleEquipement controle_equip = new ControleEquipement(this);
        
        this.poste_b.setOnAction(evt -> {controle_equip.afficherposte();});
        this.machine_b.setOnAction(evt ->{controle_equip.affichermachine();});
        this.produit_b.setOnAction(e->{controle_equip.afficherProduitScene();});
        this.gamme_b.setOnAction(e->{controle_equip.afficherGammeScene();});
        this.operation_b.setOnAction(e->{controle_equip.afficherOperationScene();});
        this.equipement_b.setOnAction(e->{controle_equip.afficherEquipementScene();});
        this.personnel_b.setOnAction(e->{controle_equip.afficherPersonnelScene();});
    }
    public Scene getScene(){
        return scene_equip;
    }
}
