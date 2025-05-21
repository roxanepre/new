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
import controler.ControleMenuChef;



/**
 *
 * @author User
 */
public class MenuChefView {
    
    FlowPane pane_welchef_info = new FlowPane();
    BorderPane pane_welchef = new BorderPane();
    Scene scene_welchef = new Scene(pane_welchef);
    Label welcome_chef = new Label("Bonjour "+ this.Nom_Chef_atelier +"!"); //grosse manip à faire pour le nom chef hash map et iteration de verification d'identifiation
    Button produit_b = new Button("Produit");
    Button gamme_b = new Button("Gamme");
    Button operation_b = new Button("Operation");
    Button equipement_b = new Button("Equipement");
    Button personnel_b = new Button("Personnel");

    public MenuChefView() {
        pane_welchef_info.setHgap(5);
        pane_welchef_info.getChildren().addAll(produit_b, gamme_b, operation_b,equipement_b,personnel_b);
        pane_welchef.setCenter(pane_welchef_info);
        pane_welchef.setTop(welcome_chef);

    }
    
    public void afficherMenuChef(Stage stage){
        stage.setScene(scene_welchef);
        stage.show();
        MenuChefView view_menu_chef = new MenuChefView(scene);
        ControleMenuChef controle_menu_chef = new ControleMenuChef(view_menu_chef);
        this.produit.setOnAction(e->{controle_menu_chef.afficherProduit(scene);});
        this.gamme.setOnAction(e->{controle_menu_chef.afficherGamme(scene);});
        this.operation.setOnAction(e->{controle_menu_chef.afficherOperation(scene);});
        this.equipement.setOnAction(e->{controle_menu_chef.afficherEquipement(scene);});
        this.personnel.setOnAction(e->{controle_menu_chef.afficherPersonnel(scene);});
        
    }
        
       // ControleMenuChef controle_menu_chef = new
    }
    

