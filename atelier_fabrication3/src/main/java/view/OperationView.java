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
public class OperationView {
    BorderPane pane_operation = new BorderPane();
    Scene scene_operation = new Scene(pane_operation);
    Label id_op = new Label("identifiant");
    TextField recup_id_op = new TextField();
    Label desc_op = new Label("description");
    TextField recup_desc_op = new TextField();
    Label dur_op = new Label("durée");
    TextField recup_dur_op = new TextField();
    Button creer_op = new Button("creer");
    Button aff_op = new Button("afficher");
    pane_operation.getChildren().addAll(id_op,recup_id_op,desc_op,recup_desc_op,dur_op,recup_dur_op,creer_op,aff_op);
        
}
