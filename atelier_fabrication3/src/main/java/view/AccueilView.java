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
    // pane_welcome.getChildren().addAll(welcome,enter_atelier); //cette ligne ne marche pas car il n'y a pas de constructeur
    
    public AccueilView(Stage stage) {
        AccueilView.fenetre_principale = stage;
        AccueilView.fenetre_principale.setTitle("Atelier de fabrication");
        AccueilView.fenetre_principale.setMaxHeight(2362);
        AccueilView.fenetre_principale.setMaxWidth(2573);
        AccueilView.fenetre_principale.setMinHeight(1772);
        AccueilView.fenetre_principale.setMinWidth(2362);
        AccueilView.fenetre_principale.isResizable();
        AccueilView.fenetre_principale.isMaximized();
        this.pane_welcome.getChildren().addAll(this.welcome,this.enter_atelier);
        stage.setScene(this.scene_welcome);
        
        AccueilView acc_view = new AccueilView(AccueilView.fenetre_principale);
        ControleAccueil controleur = new ControleAccueil(acc_view);        
        this.enter_atelier.setOnAction(evt -> {controleur.afficher(/*AccueilView.fenetre_principale*/);});
        stage.show();
    }
        

    public static Stage getFenetre_principale() {
        return fenetre_principale;
    }

    public void setFenetre_principale(Stage fenetre_principale) {
        AccueilView.fenetre_principale = fenetre_principale;
    }
    
}
    

