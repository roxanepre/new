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

/**
 *
 * @author roxanepierre
 */
public class MachineView {
    BorderPane pane_machine = new BorderPane();
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
    Button creer_mac = new Button("ajouter une machine à l'atelier");
    
    ControleMachine controler_mach = new ControleMachine();
    creer_mac.setOnAction(evt -> {controler_mach.creerMac();});
        
    Button aff_mac = new Button("afficher");
        
    aff_mac.setOnAction(evt -> {
        controler_mach.afficherMach();
    });
    
    Button mod_mac = new Button("modifier");
        
    mod_mac.setOnAction(evt -> {
        controler_mach.modifierMach();
    });
    
    Button supp_mac = new Button("supprimer");
        
    sup_mac.setOnAction(evt -> {
        controler_mach.supprimerMach();
    });
        
    pane_machine.getChildren().addAll(ref_mac,recup_ref_mac,desc_mac,recup_desc_mac,dispo_mac,recup_dispo_mac,abs_mac,recup_abs_mac,ord_mac,recup_ord_mac,cout_mac,recup_cout_mac,creer_mac,mod_mac,aff_mac,supp_mac);

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
