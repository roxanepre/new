/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.ControleMenuChef;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import controler.ControleMenuOp;
import javafx.scene.layout.GridPane;


/**
 *
 * @author User
 */
public class MenuOperateurView {
    
    GridPane pane_op_menu = new GridPane();
    BorderPane pane_welop = new BorderPane();
    Scene scene_welop = new Scene(pane_welop);    
    Label welcome_op = new Label("Bonjour "+this.Nom_Operateur+"!");//grosse manip à faire pour le nom op hash map et iteration de verification d'identifiation
    Label indic_wel_op = new Label("Veuillez choisir le menu sur lequel vous souhaitez aller !");
    MenuBar barre_menu_op = new MenuBar();
    Menu produit_b = new Menu("Produit");
    Menu gamme_b = new Menu("Gamme");
    Menu operation_b = new Menu("Operation");
    Menu equipement_b = new Menu("Equipement");
    Menu personnel_b = new Menu("Personnel");
    Menu machine_b = new Menu("Machine");
    Menu poste_b = new Menu("Poste");

    public MenuOperateurView() {
        this.equipement_b.getItems().addAll(this.machine_b,this.poste_b);
        this.barre_menu_op.getMenus().addAll(this.produit_b,this.gamme_b,this.operation_b,this.equipement_b,this.personnel_b);
        this.pane_op_menu.add(this.welcome_op,0,0,1,1);
        this.pane_op_menu.add(this.indic_wel_op,1,0,1,1);
        this.pane_welop.setCenter(this.pane_op_menu);
        this.pane_welop.setTop(this.barre_menu_op);
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
        this.poste_b.setOnAction(evt -> {controle_menu_op.afficherposteScene(scene);});
        this.machine_b.setOnAction(evt ->{controle_menu_op.affichermachineScene(scene);});
        
        
    }  
    
    
    
}
