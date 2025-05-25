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
        equipement_b.getItems().addAll(machine_b,poste_b);
        barre_menu_equipement.getMenus().addAll(produit_b,gamme_b,operation_b,equipement_b,personnel_b);
        pane_equip_tot.setCenter(choix_equip);
        pane_equip_tot.setTop(barre_menu_equipement);
        
    }
    
    public void afficheequip(Scene scene){
        this.scene_equip = scene;
        scene.setRoot(pane_equip_tot);
        ControleEquipement controle_equip = new ControleEquipement(this);
        poste_b.setOnAction(evt -> {controle_equip.afficherposte();});
        machine_b.setOnAction(evt ->{controle_equip.affichermachine();});
        produit_b.setOnAction(e->{controle_equip.afficherProduitScene();});
        gamme_b.setOnAction(e->{controle_equip.afficherGammeScene();});
        operation_b.setOnAction(e->{controle_equip.afficherOperationScene();});
        equipement_b.setOnAction(e->{controle_equip.afficherEquipementScene();});
        personnel_b.setOnAction(e->{controle_equip.afficherPersonnelScene();});
    }
    public Scene getScene(){
        return scene_equip;
    }
}
