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
    
    public void afficher() {
        IdentificationView nouvelle_vue = new IdentificationView(); // créer une ouvelle instance de la classe identification pour y accéder
        nouvelle_vue.affich(view.getScene());
        
                }
    
}
