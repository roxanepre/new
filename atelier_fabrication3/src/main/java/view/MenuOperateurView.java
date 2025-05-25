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
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import modele.Personnel;


/**
 *
 * @author User
 */
public class MenuOperateurView {
    
    Scene scene_welop;
    GridPane pane_op_menu = new GridPane();
    BorderPane pane_welop = new BorderPane();
    Label welcome_op = new Label(); 
    Label indic_wel_op = new Label("Veuillez choisir le menu sur lequel vous souhaitez aller !");
    MenuBar barre_menu_op = new MenuBar();
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

    public MenuOperateurView() {
        welcome_op.setText("Bonjour "+"!");
        equipement_b.getItems().addAll(machine_b,poste_b);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        barre_menu_op.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_op_menu.add(welcome_op,0,0,1,1);
        pane_op_menu.add(indic_wel_op,0,1,1,1);
        pane_welop.setCenter(pane_op_menu);
        pane_welop.setTop(barre_menu_op);
    }
    
     public void afficherMenuOp(Scene scene){
        this.scene_welop = scene;
        scene.setRoot(pane_welop);
        ControleMenuOp controle_menu_op = new ControleMenuOp(this);
        produit_b.setOnAction(e->{controle_menu_op.afficherProduit();});
        gamme_b.setOnAction(e->{controle_menu_op.afficherGamme();});
        operation_b.setOnAction(e->{controle_menu_op.afficherOperation();});
        equipement_b.setOnAction(e->{controle_menu_op.afficherEquipement();});
        poste_b.setOnAction(evt -> {controle_menu_op.afficherposteScene();});
        machine_b.setOnAction(evt ->{controle_menu_op.affichermachineScene();});
    } 
     
    public Scene getScene(){
        return scene_welop;
    }
     /* il s'agissait de notre première version (nous l'avons laissée en commentaire) : 
    
    cette première version prenait en paramètre un personnel dans le constructeur, 
    cela dans le but de pouvoir dire "bonjour" + identifiant associé au personnel
    finalement nous n'avons pas réussi donc il ne dit pas bonjour :/
    
    Personnel p;
    FlowPane pane_welop_info = new FlowPane();
    BorderPane pane_welop = new BorderPane();
    Scene scene = new Scene(pane_welop);    
    Label welcome_op = new Label();
    Button produit_b = new Button("Produit");
    Button gamme_b = new Button("Gamme");
    Button operation_b = new Button("Operation");
    Button equipement_b = new Button("Equipement");
    Button personnel_b = new Button("Personnel");

    public MenuOperateurView(Personnel p) {
        pane_welop_info.setHgap(5);
        pane_welop_info.getChildren().addAll(this.produit_b,this.gamme_b,this.operation_b,this.equipement_b,this.personnel_b);
        pane_welop.setCenter(pane_welop_info);
        pane_welop.setTop(welcome_op);
        welcome_op.setText("Bonjour "+p.getNom()+"!");
    }
    
     public void afficherMenuOp(Scene scene){
        this.scene= scene;
   
        ControleMenuOp controle_menu_op = new ControleMenuOp(this);
        
        this.produit_b.setOnAction(e->{controle_menu_op.afficherProduit(scene);});
        this.gamme_b.setOnAction(e->{controle_menu_op.afficherGamme(scene);});
        this.operation_b.setOnAction(e->{controle_menu_op.afficherOperation(scene);});
        this.equipement_b.setOnAction(e->{controle_menu_op.afficherEquipement(scene);});
        
    }  */
     
    
    
    
}
