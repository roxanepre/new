/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author roxanepierre
 */
public class OperationView {
    BorderPane pane_operation = new BorderPane();
    Scene scene_operation = new Scene(pane_operation);
    
    Label id_op = new Label("identifiant");
    TextField recup_id_op = new TextField();
    Label desc_op = new Label("description");
    TextField recup_desc_op = new TextField();
    Label dur_op = new Label("durée");
    TextField recup_dur_op = new TextField();

    public TextField getRecup_id_op() {
        return recup_id_op;
    }

    public TextField getRecup_desc_op() {
        return recup_desc_op;
    }

    public TextField getRecup_dur_op() {
        return recup_dur_op;
    }
    
    ControleOperation controler_op = new ControleOperation();
    
    Button creer_op = new Button("creer");
    
    creer_op.setOnAction(evt -> {
        controler_op.creerOperation();});
        
    Button aff_op = new Button("afficher");
    
    aff_op.setOnAction(evt -> {
        controler_op.afficherOperation();});
        
    pane_operation.getChildren().addAll(id_op,recup_id_op,desc_op,recup_desc_op,dur_op,recup_dur_op,creer_op,aff_op);
        
}
