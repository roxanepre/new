/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controler.ControleAccueil;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author User
 */
public class AccueilView {
    public static Stage fenetre_principale = new Stage();
    StackPane pane_welcome = new StackPane();
    Scene scene_welcome = new Scene(pane_welcome,400,300);
    Label welcome = new Label("Bienvenue dans l'application de votre atelier !");
    Button enter_atelier = new Button("Entrer dans l'atelier");
    
    public AccueilView(Stage stage) {
        AccueilView.fenetre_principale = stage;
        stage.setTitle("Atelier de fabrication");
        //stage.setMaxHeight(2362);
        //stage.setMaxWidth(2573);
        //stage.setMinHeight(1772);
        //stage.setMinWidth(2362);
        //stage.isResizable();
        //stage.isMaximized();
        pane_welcome.getChildren().addAll(welcome,enter_atelier);
        stage.setScene(scene_welcome);
        ControleAccueil controleur = new ControleAccueil(this);
        enter_atelier.setOnAction(evt -> {controleur.afficher(/*AccueilView.fenetre_principale*/);});
    }
    
    //public void actionAccueil(){
       // AccueilView acc_view = new AccueilView(AccueilView.fenetre_principale);
       // ControleAccueil controleur = new ControleAccueil(acc_view);        
       // this.enter_atelier.setOnAction(evt -> {controleur.afficher(/*AccueilView.fenetre_principale*/);});
    //}
        
    public Scene getScene() {
        return scene_welcome;
    }
    public static Stage getFenetre_principale() {
        return fenetre_principale;
    }

    public void setFenetre_principale(Stage fenetre_principale) {
        AccueilView.fenetre_principale = fenetre_principale;
    }
    
}
    

