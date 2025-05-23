/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import view.AccueilView;
import view.IdentificationView;

/**
 *
 * @author User
 */
public class ControleAccueil {
    AccueilView view;
    
    public ControleAccueil(AccueilView view){
       this.view = view;
    }
    
    public void afficher(/*Stage stage*/) {
        //Pane new_pane1 = new Pane();
        //Scene new_scene1 = new Scene(new_pane1);
        IdentificationView nouvelle_vue = new IdentificationView(); // créer une ouvelle instance de la classe identification pour y accéder
        nouvelle_vue.affich(view.getScene());
        
        // controleAccueil permet d'afficher un truc de la classe identification
                }
    
}
