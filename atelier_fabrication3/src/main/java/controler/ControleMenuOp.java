/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import javafx.scene.Scene;
import view.EquipementView;
import view.GammeView;
import view.MachineView;
import view.MenuChefView;
import view.OperationView;
import view.ProduitView;
import view.MenuOperateurView;
import view.PosteView;



/**
 *
 * @author User
 */
public class ControleMenuOp {
       MenuOperateurView view;

    public ControleMenuOp(MenuOperateurView view) {
        this.view = view;
    }
    public void afficherProduit (Scene scene){ //je ne sais pas si les méthodes je peux les nommer pareil que dans MenuChef, pour l'instant je laisse comme ca 
        ProduitView nouvelle_vueA = new ProduitView();
        //c'est bizarre que scene ne marche pas, meme pb que pour la classe ControleMenuChef
        nouvelle_vueA.actionProd(scene); //il faudra créer la méthode afficheProduit dans la classe ProduitView mais je n'ai pas osé y toucher pour l'instant
        }
    
    public void afficherGamme (Scene scene) {
        GammeView nouvelle_vueB = new GammeView(); //bizarre car ca marche ici
        nouvelle_vueB.afficheGamme(scene); // Pareil je ne sais pas si cette méthode existe, j'adapterai le nom en fonction de ce qui a été mis dans GammeView
        }
    
   public void afficherOperation (Scene scene){
       OperationView nouvelle_vueC = new OperationView(); //normal que ce ne marche pas, je crois qu'il n'y a pas de constucteur dans la classe OperationView
       nouvelle_vueC.actionOp(scene); //pareil il faudra que j'aille faire la méthode
   }
       
   public void afficherEquipement(Scene scene){
       EquipementView nouvelle_vueD = new EquipementView(); 
       nouvelle_vueD.afficheequip(scene);
   }
    public void afficherposteScene (Scene scene){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(scene);
    }
    public void affichermachineScene (Scene scene){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(scene);
    }
}

