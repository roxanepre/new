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
       MenuOperateurView view3;

    public ControleMenuOp(MenuOperateurView view) {
        this.view3 = view;
    }
    public void afficherProduit (){  
        ProduitView nouvelle_vueA = new ProduitView();
        nouvelle_vueA.actionProd(view3.getScene()); 
        }
    
    public void afficherGamme () {
        GammeView nouvelle_vueB = new GammeView(); 
        nouvelle_vueB.afficheGamme(view3.getScene()); 
        }
    
   public void afficherOperation (){
       OperationView nouvelle_vueC = new OperationView(); 
       nouvelle_vueC.actionOp(view3.getScene()); 
   }
       
   public void afficherEquipement(){
       EquipementView nouvelle_vueD = new EquipementView(); 
       nouvelle_vueD.afficheequip(view3.getScene());
   }
    public void afficherposteScene (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(view3.getScene());
    }
    public void affichermachineScene (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(view3.getScene());
    }
}

