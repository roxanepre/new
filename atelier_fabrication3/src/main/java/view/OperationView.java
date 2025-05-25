/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import modele.Operation;

/**
 *
 * @author roxanepierre
 */
public class OperationView {
    Scene scene_operation;
    
    GridPane pane_op_info = new GridPane();
    AnchorPane pane_op_next = new AnchorPane();
    BorderPane pane_operation = new BorderPane();
    HBox hb_op = new HBox(15);
    Label id_op = new Label("Identifiant :  ");
    TextField recup_id_op = new TextField();
    Label desc_op = new Label("Description :  ");
    TextField recup_desc_op = new TextField();
    Label dur_op = new Label("Durée :  ");
    TextField recup_dur_op = new TextField();
    Button creer_op = new Button("Créer");
    Button aff_op = new Button("Afficher");
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
    MenuBar barre_menu_operation = new MenuBar();

    public OperationView() {
        pane_op_info.add(id_op,0,0,1,1);
        pane_op_info.add(recup_id_op,1,0,1,1);
        pane_op_info.add(desc_op,0,1,1,1);
        pane_op_info.add(recup_desc_op,1,1,1,1);
        pane_op_info.add(dur_op,0,2,1,1);
        pane_op_info.add(recup_dur_op,1,2,1,1);
        hb_op.getChildren().addAll(creer_op,aff_op);
        pane_op_next.getChildren().add(hb_op);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        equipement_b.getItems().addAll(machine_b,poste_b);
        barre_menu_operation.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_operation.setCenter(pane_op_info);
        pane_operation.setBottom(pane_op_next);
        pane_operation.setTop(barre_menu_operation);
    }
    
    public void actionOp(Scene scene){
        this.scene_operation = scene;
        scene.setRoot(pane_operation);
        ControleOperation controler_operation = new ControleOperation(this);
        Operation op_12 = new Operation();
        
        creer_op.setOnAction(evt -> {controler_operation.creerOperation();});
        aff_op.setOnAction(evt -> {controler_operation.afficherOperation(op_12);});
        produit_b.setOnAction(e->{controler_operation.afficherProduitScene();});
        gamme_b.setOnAction(e->{controler_operation.afficherGammeScene();});
        operation_b.setOnAction(e->{controler_operation.afficherOperationScene();});
        equipement_b.setOnAction(e->{controler_operation.afficherEquipementScene();});
        personnel_b.setOnAction(e->{controler_operation.afficherPersonnelScene();});
        poste_b.setOnAction(evt -> {controler_operation.afficherposteScene();});
        machine_b.setOnAction(evt ->{controler_operation.affichermachineScene();});
        
        
        
    }
    
    public Scene getScene(){
        return scene_operation;
    }

    public TextField getRecup_id_op() {
        return recup_id_op;
    }

    public TextField getRecup_desc_op() {
        return recup_desc_op;
    }

    public TextField getRecup_dur_op() {
        return recup_dur_op;
    }   

    public Label getDesc_op() {
        return desc_op;
    }

    public Label getDur_op() {
        return dur_op;
    }

    public Label getId_op() {
        return id_op;
    }
    
}
