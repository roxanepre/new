/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import view.MenuChefView;
import view.IdentificationView;
import view.ProduitView;
import view.GammeView;
import view.OperationView;
import view.EquipementView;
import view.MachineView;
import view.PersonnelView;
import view.PosteView;



public class ControleMenuChef {
    MenuChefView view;

    public ControleMenuChef(MenuChefView view) {
        this.view = view;
    }
    public void afficherProduit (){
        ProduitView nouvelle_vue = new ProduitView();
        //c'est bizarre que scene ne marche pas, je crois que l'erreur vient de "scene", mais pour le scene est bien définit dans le constructeur de la classe ProduitView
        nouvelle_vue.actionProd(view.getScene()); //il faudra créer la méthode afficheProduit dans la classe ProduitView mais je n'ai pas osé y toucher pour l'instant
        }
    
    public void afficherGamme () {
        GammeView nouvelle_vue = new GammeView(); //bizarre car ca marche ici
        nouvelle_vue.afficheGamme(view.getScene()); // Pareil je ne sais pas si cette méthode existe, j'adapterai le nom en fonction de ce qui a été mis dans GammeView
        }
    
   public void afficherOperation (){
       OperationView nouvelle_vue = new OperationView(); //normal que ce ne marche pas, je crois qu'il n'y a pas de constucteur dans la classe OperationView
       nouvelle_vue.actionOp(view.getScene()); //pareil il faudra que j'aille faire la méthode
   }
       
   public void afficherEquipement(){
       EquipementView nouvelle_vue = new EquipementView(); // pas compris : car il y a bien un scene dasn le controleur de EuipementView???
       nouvelle_vue.afficheequip(view.getScene()); // de meme 
   }
   
   public void afficherPersonnel (){
       PersonnelView nouvelle_vue = new PersonnelView();
       nouvelle_vue.actionPersonnel(view.getScene());
       
   }
   public void afficherposteScene (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(view.getScene());
   }
   public void affichermachineScene (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(view.getScene());
   }
       
       
   
   }

