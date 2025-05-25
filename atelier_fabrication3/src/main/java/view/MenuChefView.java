/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;
import controler.ControleMenuChef;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import modele.Personnel;



/**
 *
 * @author User
 */
public class MenuChefView {
    Scene scene_welchef;
    BorderPane pane_welchef = new BorderPane();
    GridPane pane_chef_menu = new GridPane();
    Label welcome_chef = new Label(); 
    Label pane_welchef_info = new Label("Veuillez choisir le menu dans lequel vous souhaitez aller");
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
    MenuBar barre_menu_chef = new MenuBar(); 
    

    public MenuChefView() {
        welcome_chef.setText("Bonjour !");
        equipement_b.getItems().addAll(machine_b,poste_b);
        produit_b1.getItems().add(produit_b);
        gamme_b1.getItems().add(gamme_b);
        operation_b1.getItems().add(operation_b);
        personnel_b1.getItems().add(personnel_b);
        barre_menu_chef.getMenus().addAll(produit_b1,gamme_b1,operation_b1,equipement_b,personnel_b1);
        pane_chef_menu.add(welcome_chef,0,0,1,1);
        pane_chef_menu.add(pane_welchef_info,0,1,1,1);
        pane_welchef.setCenter(pane_chef_menu);
        pane_welchef.setTop(barre_menu_chef);
    }
    
    public void afficherMenuChef(Scene scene){
        this.scene_welchef = scene;
        scene.setRoot(pane_welchef);
        ControleMenuChef controle_menu_chef = new ControleMenuChef(this);
        produit_b.setOnAction(e->{controle_menu_chef.afficherProduit();System.out.println("bouton produit ok");});
        gamme_b.setOnAction(e->{controle_menu_chef.afficherGamme();});
        operation_b.setOnAction(e->{controle_menu_chef.afficherOperation();});
        equipement_b.setOnAction(e->{controle_menu_chef.afficherEquipement();});
        personnel_b.setOnAction(e->{controle_menu_chef.afficherPersonnel();});
        poste_b.setOnAction(evt -> {controle_menu_chef.afficherposteScene();});
        machine_b.setOnAction(evt ->{controle_menu_chef.affichermachineScene();});
        
    }
    
    public Scene getScene(){
        return scene_welchef;
    }
}
    
    /* Tout ce qu'on a laissé en commentaire sont des choses que l'on a essayées 
    puis choisi de ne pas conserver dans la version définitive : 
    (voir également dans MenuOperateurView)

    public MenuChefView(Personnel p) { // en fait le constructeur prend en parametre le un elt de personnel p et va chercher son nom pour lui dire bonjour
        this.p=p;
        welcome_chef.setText("Bonjour "+ p.getNom() +"!");
        pane_welchef_info.setHgap(5);
        pane_welchef_info.getChildren().addAll(produit_b, gamme_b, operation_b,equipement_b,personnel_b);
        pane_welchef.setCenter(pane_welchef_info);
        pane_welchef.setTop(welcome_chef);
    }
    
    public void afficherMenuChef(Scene scene){
        this.scene = scene;
        scene.setRoot(pane_welchef);
        
        ControleMenuChef controle_menu_chef = new ControleMenuChef(this);
        
        produit_b.setOnAction(e->{controle_menu_chef.afficherProduit(scene);});
        gamme_b.setOnAction(e->{controle_menu_chef.afficherGamme(scene);});
        operation_b.setOnAction(e->{controle_menu_chef.afficherOperation(scene);});
        equipement_b.setOnAction(e->{controle_menu_chef.afficherEquipement(scene);});
        personnel_b.setOnAction(e->{controle_menu_chef.afficherPersonnel(scene);});
    }*/
        
    
    

