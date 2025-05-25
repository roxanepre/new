/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import modele.Machine;
import controler.* ;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

/**
 *
 * @author roxanepierre
 */
public class MachineView {
    Scene scene_machine;
    GridPane pane_machine_info = new GridPane();
    AnchorPane pane_mach_next = new AnchorPane();
    BorderPane pane_machine = new BorderPane();
    HBox hb_machine = new HBox(15);
    Label ref_mac = new Label("Référence :  ");
    TextField recup_ref_mac = new TextField();
    Label desc_mac = new Label("Description :  ");
    TextField recup_desc_mac = new TextField();
    Label dispo_mac = new Label("Disponibilité :  ");
    TextField recup_dispo_mac = new TextField();
    Label abs_mac = new Label("Abscisse :  ");
    TextField recup_abs_mac = new TextField();
    Label ord_mac = new Label("Ordonnée :  ");
    TextField recup_ord_mac = new TextField();
    Label cout_mac = new Label("Coût :  ");
    TextField recup_cout_mac = new TextField();
    Label etat_mac = new Label("État :  ");
    TextField recup_etat_mac = new TextField();
    Button creer_mac = new Button("Ajouter");
    Button mod_mac = new Button("Modifier");
    Button aff_mac = new Button("Afficher");
    Button supp_mac = new Button("Supprimer");
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
    MenuBar barre_menu_machine = new MenuBar();

    public MachineView() {
        pane_machine_info.add(ref_mac,0,0,1,1);
        pane_machine_info.add(recup_ref_mac,1,0,1,1);
        pane_machine_info.add(desc_mac,0,1,1,1);
        pane_machine_info.add(recup_desc_mac,1,1,1,1);
        pane_machine_info.add(dispo_mac,0,2,1,1);
        pane_machine_info.add(recup_dispo_mac,1,2,1,1);
        pane_machine_info.add(abs_mac,0,3,1,1);
        pane_machine_info.add(recup_abs_mac,1,3,1,1);
        pane_machine_info.add(ord_mac,0,4,1,1);
        pane_machine_info.add(recup_ord_mac,1,4,1,1);
        pane_machine_info.add(etat_mac,0,5,1,1);
        pane_machine_info.add(recup_etat_mac,1,5,1,1);
        pane_machine_info.add(cout_mac,0,6,1,1);
        pane_machine_info.add(recup_cout_mac,1,6,1,1);
        hb_machine.getChildren().addAll(creer_mac,mod_mac,aff_mac,supp_mac);
        pane_mach_next.getChildren().add(hb_machine);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        equipement_b.getItems().addAll(machine_b,poste_b);
        barre_menu_machine.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_machine.setCenter(pane_machine_info);
        pane_machine.setBottom(pane_mach_next);
        pane_machine.setTop(barre_menu_machine);
    }
    
    public void actionMach(Scene scene){
        this.scene_machine = scene;
        scene.setRoot(pane_machine);
        ControleMachine controler_mach = new ControleMachine(this);
        Machine mach_12 = new Machine();
        creer_mac.setOnAction(evt -> {controler_mach.creerMac();});
        aff_mac.setOnAction(evt -> {controler_mach.afficherMach(mach_12);});
        mod_mac.setOnAction(evt -> {controler_mach.modifierMach(mach_12);});
        supp_mac.setOnAction(evt -> {controler_mach.supprimerMach(mach_12);});
        produit_b.setOnAction(e->{controler_mach.afficherProduitScene();});
        gamme_b.setOnAction(e->{controler_mach.afficherGammeScene();});
        operation_b.setOnAction(e->{controler_mach.afficherOperationScene();});
        equipement_b.setOnAction(e->{controler_mach.afficherEquipementScene();});
        personnel_b.setOnAction(e->{controler_mach.afficherPersonnelScene();});
        poste_b.setOnAction(evt -> {controler_mach.afficherposteScene();});
        machine_b.setOnAction(evt ->{controler_mach.affichermachineScene();});
            
    }
    public Scene getScene(){
        return scene_machine;
    }
     public TextField getRecup_ref_mac() {
        return recup_ref_mac;
    }

    public TextField getRecup_desc_mac() {
        return recup_desc_mac;
    }

    public TextField getRecup_dispo_mac() {
        return recup_dispo_mac;
    }

    public TextField getRecup_abs_mac() {
        return recup_abs_mac;
    }

    public TextField getRecup_ord_mac() {
        return recup_ord_mac;
    }

    public TextField getRecup_cout_mac() {
        return recup_cout_mac;
    }

    public TextField getRecup_etat_mac() {
        return recup_etat_mac;
    }

    public Label getRef_mac() {
        return ref_mac;
    }

    public Label getDesc_mac() {
        return desc_mac;
    }

    public Label getDispo_mac() {
        return dispo_mac;
    }

    public Label getAbs_mac() {
        return abs_mac;
    }

    public Label getOrd_mac() {
        return ord_mac;
    }

    public Label getEtat_mac() {
        return etat_mac;
    }

    public Label getCout_mac() {
        return cout_mac;
    }
    
}
