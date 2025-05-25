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
   // Scene scene_machine = new Scene(pane_machine);
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
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_machine = new MenuBar();

    public MachineView() {
        this.pane_machine_info.add(this.ref_mac,0,0,1,1);
        this.pane_machine_info.add(this.recup_ref_mac,1,0,1,1);
        this.pane_machine_info.add(this.desc_mac,0,1,1,1);
        this.pane_machine_info.add(this.recup_desc_mac,1,1,1,1);
        this.pane_machine_info.add(this.dispo_mac,0,2,1,1);
        this.pane_machine_info.add(this.recup_dispo_mac,1,2,1,1);
        this.pane_machine_info.add(this.abs_mac,0,3,1,1);
        this.pane_machine_info.add(this.recup_abs_mac,1,3,1,1);
        this.pane_machine_info.add(this.ord_mac,0,4,1,1);
        this.pane_machine_info.add(this.recup_ord_mac,1,4,1,1);
        this.pane_machine_info.add(this.etat_mac,0,5,1,1);
        this.pane_machine_info.add(recup_etat_mac,1,5,1,1);
        this.hb_machine.getChildren().addAll(this.creer_mac,this.mod_mac,this.aff_mac,this.supp_mac);
        this.pane_mach_next.getChildren().add(hb_machine);
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_machine.getMenus().addAll(this.produit_b, this.gamme_b, this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_machine.setCenter(this.pane_machine_info);
        this.pane_machine.setBottom(this.pane_mach_next);
        this.pane_machine.setTop(this.barre_menu_machine);
    }
    
    public void actionMach(Scene scene){
        this.scene_machine = scene;
        scene.setRoot(pane_machine);
        //AccueilView.getFenetre_principale().setScene(scene);
        //AccueilView.getFenetre_principale().show();
        //MachineView view_mach = new MachineView();
        ControleMachine controler_mach = new ControleMachine(this);
        Machine mach_12 = new Machine();
        this.creer_mac.setOnAction(evt -> {controler_mach.creerMac();});
        this.aff_mac.setOnAction(evt -> {controler_mach.afficherMach(mach_12);});
        this.mod_mac.setOnAction(evt -> {controler_mach.modifierMach(mach_12);});
        this.supp_mac.setOnAction(evt -> {controler_mach.supprimerMach(mach_12);});
        this.produit_b.setOnAction(e->{controler_mach.afficherProduitScene();});
        this.gamme_b.setOnAction(e->{controler_mach.afficherGammeScene();});
        this.operation_b.setOnAction(e->{controler_mach.afficherOperationScene();});
        this.equipement_b.setOnAction(e->{controler_mach.afficherEquipementScene();});
        this.personnel_b.setOnAction(e->{controler_mach.afficherPersonnelScene();});
        this.poste_b.setOnAction(evt -> {controler_mach.afficherposteScene();});
        this.machine_b.setOnAction(evt ->{controler_mach.affichermachineScene();});
    
        
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
    
}
