/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class MenuOperateurView {
    
    FlowPane pane_welop_info = new FlowPane();
    BorderPane pane_welop = new BorderPane();
    Scene scene_welop = new Scene(pane_welop);    
    Label welcome_op = new Label("Bonjour "+this.Nom_Operateur+"!");//grosse manip à faire pour le nom op hash map et iteration de verification d'identifiation
    Button produit_b = new Button("Produit");
    Button gamme_b = new Button("Gamme");
    Button operation_b = new Button("Operation");
    Button equipement_b = new Button("Equipement");
    Button personnel_b = new Button("Personnel");

    public MenuOperateurView(/*Scene scene*/) {
        pane_welop_info.setHgap(5);
        pane_welop_info.getChildren().addAll(produit_b, gamme_b, operation_b,equipement_b,personnel_b);
        pane_welop.setCenter(pane_welop_info);
        pane_welop.setTop(welcome_op);
    }
    
    public void afficherMenuOp(Stage stage){
        stage.setScene(scene_welop);
        stage.show();
    }    
    
    
    
}
