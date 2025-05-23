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
    //Scene scene_operation = new Scene(pane_operation);
    Label id_op = new Label("identifiant");
    TextField recup_id_op = new TextField();
    Label desc_op = new Label("description");
    TextField recup_desc_op = new TextField();
    Label dur_op = new Label("durée");
    TextField recup_dur_op = new TextField();
    Button creer_op = new Button("creer");
    Button aff_op = new Button("afficher");
    Menu produit_b = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");
    MenuBar barre_menu_operation = new MenuBar();

    public OperationView() {
        this.pane_op_info.add(this.id_op,0,0,1,1);
        this.pane_op_info.add(this.recup_id_op,0,1,1,1);
        this.pane_op_info.add(this.recup_desc_op,1,0,1,1);
        this.pane_op_info.add(this.recup_desc_op,1,1,1,1);
        this.pane_op_info.add(this.dur_op,2,0,1,1);
        this.pane_op_info.add(this.recup_dur_op,2,1,1,1);
        this.hb_op.getChildren().addAll(this.creer_op,this.aff_op);
        this.pane_op_next.setRightAnchor(this.hb_op,10.0);
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_operation.getMenus().addAll(this.produit_b, this.gamme_b, this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_operation.setCenter(this.pane_op_info);
        this.pane_operation.setBottom(this.pane_op_next);
        this.pane_operation.setTop(this.barre_menu_operation);
    }
    
    public void actionOp(Scene scene){
        this.scene_operation = scene;
        //AccueilView.getFenetre_principale().setScene(scene);
        //AccueilView.getFenetre_principale().show();
        
        //OperationView view_operation = new OperationView();
        ControleOperation controler_operation = new ControleOperation(this);
        Operation op_12 = new Operation();
        
        this.creer_op.setOnAction(evt -> {controler_operation.creerOperation();});
        this.aff_op.setOnAction(evt -> {controler_operation.afficherOperation(op_12);});
        this.produit_b.setOnAction(e->{controler_operation.afficherProduitScene();});
        this.gamme_b.setOnAction(e->{controler_operation.afficherGammeScene();});
        this.operation_b.setOnAction(e->{controler_operation.afficherOperationScene();});
        this.equipement_b.setOnAction(e->{controler_operation.afficherEquipementScene();});
        this.personnel_b.setOnAction(e->{controler_operation.afficherPersonnelScene();});
        this.poste_b.setOnAction(evt -> {controler_operation.afficherposteScene();});
        this.machine_b.setOnAction(evt ->{controler_operation.affichermachineScene();});
        
        
        
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
}
