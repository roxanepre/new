/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import view.IdentificationView;

/**
 *
 * @author User
 */
public class ControleAccueil {
    //Stage base_stage = new Stage();
    
    public ControleAccueil(/*Stage stage*/){
       //this.base_stage = stage;
    }
    
    public void afficher(Stage stage) {
        //Pane new_pane1 = new Pane();
        //Scene new_scene1 = new Scene(new_pane1);
        IdentificationView nouvelle_vue = new IdentificationView(/*new_scene1*/); // créer une ouvelle instance de la classe identification pour y accéder
        nouvelle_vue.affich(stage);
        
        // controleAccueil permet d'afficher un truc de la classe identification
                }
    
}
