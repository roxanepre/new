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
        nouvelle_vue.actionProd(view.getScene()); 
        }
    
    public void afficherGamme () {
        GammeView nouvelle_vue = new GammeView(); 
        nouvelle_vue.afficheGamme(view.getScene()); 
        }
    
   public void afficherOperation (){
       OperationView nouvelle_vue = new OperationView(); 
       nouvelle_vue.actionOp(view.getScene()); 
   }
       
   public void afficherEquipement(){
       EquipementView nouvelle_vue = new EquipementView(); 
       nouvelle_vue.afficheequip(view.getScene());  
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

