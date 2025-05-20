/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import view.AccueilView;
import view.IdentificationView;
import view.MenuChefView;
import view.MenuOperateurView;
import javafx.scene.control.Label;
import modele.Personnel;

/**
 *
 * @author User
 */




public class ControleIdentification {
    
    IdentificationView view;
    
    //Pane base_pane = new Pane();
    //Scene base_scene = new Scene(base_pane);
    
    public ControleIdentification(IdentificationView view) {// constructeur avec la vue correspondante en parametre
        //this.base_scene = scene;
        this.view=view;
        
    }
    //il faut que je fasse la méthode action dont je parle dans la classe View
    
    
    public void verification(String id, String pwd){
        //Pane new_pane2 = new Pane();
        //Scene new_scene2 = new Scene(new_pane2);
        int i;
        for (i==0; i<=liste_mdp.size();i++){
            if (liste_personnel.get(i)==id){
                if (liste_mdp.get(liste_personnel.get(i))==pwd){
                    if (id==id_chef){
                        MenuChefView nouvelle_scene1 = new MenuChefView(/*new_scene2*/);
                        nouvelle_scene1.afficherMenuChef(fenetre_principale);
                        
                    }
                    else{
                        MenuOperateurView nouvelle_scene_1 = new MenuOperateurView(/*new_scene2*/);
                        nouvelle_scene1.afficherMenuOp(fenetre_principale);
                    }
                }
                else {
                    Stage error_mdp = new Stage();
                    BorderPane error_mdp_pane = new BorderPane();
                    Scene error_mdp_scene = new Scene(error_mdp_pane,709,354);
                    Label error_mdp_text = new Label("Votre identifiant ou votre mot de passe est incorrect !");
                    error_mdp_pane.setCenter(error_mdp_text);
                    error_mdp.setScene(error_mdp_scene);
                    error_mdp.show();
                }   
            }
            else {
                Stage error_mdp = new Stage();
                BorderPane error_mdp_pane = new BorderPane();
                Scene error_mdp_scene = new Scene(error_mdp_pane,709,354);
                Label error_mdp_text = new Label("Votre identifiant ou votre mot de passe est incorrect !");
                error_mdp_pane.setCenter(error_mdp_text);
                error_mdp.setScene(error_mdp_scene);
                error_mdp.show();
            }
        }
    }
    
    
}
