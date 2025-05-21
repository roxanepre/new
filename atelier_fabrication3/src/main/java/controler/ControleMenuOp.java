/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import javafx.scene.Scene;
import view.EquipementView;
import view.GammeView;
import view.MenuChefView;
import view.OperationView;
import view.ProduitView;
import view.MenuOperateurView;



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
        ProduitView nouvelle_vueA = new ProduitView(scene);
        //c'est bizarre que scene ne marche pas, meme pb que pour la classe ControleMenuChef
        nouvelle_vueA.afficheProduit(scene); //il faudra créer la méthode afficheProduit dans la classe ProduitView mais je n'ai pas osé y toucher pour l'instant
        }
    
    public void afficherGamme (Scene scene) {
        GammeView nouvelle_vueB = new GammeView(scene); //bizarre car ca marche ici
        nouvelle_vueB.afficheMachine(scene); // Pareil je ne sais pas si cette méthode existe, j'adapterai le nom en fonction de ce qui a été mis dans GammeView
        }
    
   public void afficherOperation (Scene scene){
       OperationView nouvelle_vueC = new OperationView(scene); //normal que ce ne marche pas, je crois qu'il n'y a pas de constucteur dans la classe OperationView
       nouvelle_VueC.afficheOperation(scene); //pareil il faudra que j'aille faire la méthode
   }
       
   public void afficherEquipement(Scene scene){
       EquipementView nouvelle_vueD = new EquipementView(scene); 
       nouvelle_vueD.afficheEquipement(scene); // de meme 
    

