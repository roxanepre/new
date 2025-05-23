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

/**
 *
 * @author roxanepierre
 */
public class MachineView {
    GridPane pane_machine_info = new GridPane();
    AnchorPane pane_mach_next = new AnchorPane();
    BorderPane pane_machine = new BorderPane();
    HBox hb_machine = new HBox(15);
    Scene scene_machine = new Scene(pane_machine);
    Label ref_mac = new Label("reference");
    TextField recup_ref_mac = new TextField();
    Label desc_mac = new Label("description");
    TextField recup_desc_mac = new TextField();
    Label dispo_mac = new Label("disponibilité");
    TextField recup_dispo_mac = new TextField();
    Label abs_mac = new Label("abscisse");
    TextField recup_abs_mac = new TextField();
    Label ord_mac = new Label("ordonnée");
    TextField recup_ord_mac = new TextField();
    Label cout_mac = new Label("coût");
    TextField recup_cout_mac = new TextField();
    Label etat_mac = new Label("état");
    TextField recup_etat_mac = new TextField();
    Button creer_mac = new Button("Ajouter");
    Button mod_mac = new Button("Modifier");
    Button aff_mac = new Button("Afficher");
    Button supp_mac = new Button("Supprimer");

    public MachineView() {
        this.pane_machine_info.add(this.ref_mac,0,0,1,1);
        this.pane_machine_info.add(this.recup_ref_mac,0,1,1,1);
        this.pane_machine_info.add(this.desc_mac,1,0,1,1);
        this.pane_machine_info.add(this.recup_desc_mac,1,1,1,1);
        this.pane_machine_info.add(this.dispo_mac,2,0,1,1);
        this.pane_machine_info.add(this.recup_dispo_mac,2,1,1,1);
        this.pane_machine_info.add(this.abs_mac,3,0,1,1);
        this.pane_machine_info.add(this.recup_abs_mac,3,1,1,1);
        this.pane_machine_info.add(this.ord_mac,4,0,1,1);
        this.pane_machine_info.add(this.recup_ord_mac,4,1,1,1);
        this.pane_machine_info.add(this.etat_mac,5,0,1,1);
        this.hb_machine.getChildren().addAll(this.creer_mac,this.mod_mac,this.aff_mac,this.supp_mac);
        this.pane_mach_next.setRightAnchor(hb_machine,10.0);
        this.pane_machine.setCenter(this.pane_machine_info);
        this.pane_machine.setBottom(this.pane_mach_next);
    }
    
    public void actionMach(Scene scene){
        this.scene_machine = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        MachineView view_mach = new MachineView();
        ControleMachine controler_mach = new ControleMachine(view_mach);
        Machine mach_12 = new Machine();
        this.creer_mac.setOnAction(evt -> {controler_mach.creerMac();});
        this.aff_mac.setOnAction(evt -> {controler_mach.afficherMach(mach_12);});
        this.mod_mac.setOnAction(evt -> {controler_mach.modifierMach();});
        this.supp_mac.setOnAction(evt -> {controler_mach.supprimerMach(mach_12);});
        
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
    
}
