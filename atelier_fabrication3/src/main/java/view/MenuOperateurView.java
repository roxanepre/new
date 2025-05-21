/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.ControleMenuChef;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import controler.ControleMenuOp;


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

    public MenuOperateurView() {
        this.pane_welop_info.setHgap(5);
        this.pane_welop_info.getChildren().addAll(this.produit_b,this.gamme_b,this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_welop.setCenter(this.pane_welop_info);
        this.pane_welop.setTop(this.welcome_op);
    }
    
     public void afficherMenuOp(Scene scene){
        this.scene_welop = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        
        MenuOperateurView view_menu_op = new MenuOperateurView();
        ControleMenuOp controle_menu_op = new ControleMenuOp(view_menu_op);
        
        this.produit_b.setOnAction(e->{controle_menu_op.afficherProduit(scene);});
        this.gamme_b.setOnAction(e->{controle_menu_op.afficherGamme(scene);});
        this.operation_b.setOnAction(e->{controle_menu_op.afficherOperation(scene);});
        this.equipement_b.setOnAction(e->{controle_menu_op.afficherEquipement(scene);});
        
    }  
    
    
    
}
