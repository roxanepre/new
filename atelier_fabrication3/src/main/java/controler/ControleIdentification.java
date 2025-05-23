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
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */




public class ControleIdentification {
    
    IdentificationView view;
        
    public ControleIdentification(IdentificationView view) {// constructeur avec la vue correspondante en parametre
        this.view=view;
        
    }
    //il faut que je fasse la méthode action dont je parle dans la classe View
    
    
   /* public void verification(String id, String pwd, Scene scene){
        //Pane new_pane2 = new Pane();
        //Scene new_scene2 = new Scene(new_pane2);
        int i;
        for (i=0; i<= Personnel.getListe_mdp().size();i++){
            if (Personnel.getListe_personnel().get(i)==id){
                if (Personnel.getListe_mdp().get(Personnel.getListe_personnel().get(i))==pwd){
                    if (id==Personnel.getId_chef()){
                        MenuChefView nouvelle_vuechef = new MenuChefView();
                        nouvelle_vuechef.afficherMenuChef(scene);
                        
                    }
                    else{
                        MenuOperateurView nouvelle_scene_1 = new MenuOperateurView();
                        nouvelle_scene_1.afficherMenuOp(scene);
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
    */ // Roxane j'ai du faire une autre methode car la methode verificationne prenait pas en parametre le personnel
 
    
    //il faut que je fasse la méthode action dont je parle dans la classe View
    // avec mes class Personnels et Personnels, la methode vérification a été écrite dans la classe Personnels,
    //il suffit de voir si elle revoie un utilisateur ou null et si elle renvoie un utilisateur,
    //on recupère ce qu'on veut de celuici
    
     public void verification(){
        System.out.println(view.getRecup_identifiant().getText());
        System.out.println(view.getRecup_pwd().getText());
        Personnel verif=Personnels.verifierConnexion(view.getRecup_identifiant().getText(),view.getRecup_pwd().getText());
        // la on récuper la valeur donnée par la méthode verifier connexion qui s'applique
        // sur la class Users ( on a acces direct à la liste utilisateur)
        // en fonction des parametres récupérer dans les deux champs de la vue
        // si ca matche on recupere l'utilisateur
        // sinon on recupere null
        if( verif!=null)            
            {String role=verif.getRole();// dans le cas ou ça matche on recupere le role
            // de l'utilisateur et on le passe à la vue suivante
            // qui en a besoin pour savoir quel bouton grisé
             System.out.println("ça marche,c'est un "+role);
             if(role.equals("boss")){
                 System.out.println("ca devrait afficher Menuview");
                 MenuChefView nview = new MenuChefView(verif);
                 nview.afficherMenuChef(view.getScene());
             }
             else{
                 MenuOperateurView nview = new MenuOperateurView(verif);
                 nview.afficherMenuOp(view.getScene());
             }
        }               
        else{view.getMessage().setText("identification erronée");}
        //sinon on fourni au label message de la view "identification erronée"      
            }
    
    
}
