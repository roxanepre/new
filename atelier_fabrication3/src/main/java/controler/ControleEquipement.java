/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import view.AccueilView;
import view.EquipementView;
import view.PosteView;
import view.MachineView;
import javafx.scene.Scene;
import view.GammeView;
import view.OperationView;
import view.PersonnelView;
import view.ProduitView;



/**
 *
 * @author User
 */
public class ControleEquipement {
    EquipementView view;

    public ControleEquipement(EquipementView view) {
        this.view = view;
    }
    
    public void afficherProduitScene (){
        ProduitView nouvelle_vueA = new ProduitView();
        nouvelle_vueA.actionProd(view.getScene()); 
    }
    
    public void afficherGammeScene () {
        GammeView nouvelle_vueB = new GammeView();
        nouvelle_vueB.afficheGamme(view.getScene()); 
    }
    
    public void afficherOperationScene (){
       OperationView nouvelle_vueC = new OperationView(); 
       nouvelle_vueC.actionOp(view.getScene()); 
    }
       
    public void afficherEquipementScene(){
       EquipementView nouvelle_vueD = new EquipementView(); 
       nouvelle_vueD.afficheequip(view.getScene());
    }
   
    public void afficherPersonnelScene (){
       PersonnelView nouvelle_vueE = new PersonnelView();
       nouvelle_vueE.actionPersonnel(view.getScene());
       
    }
    public void afficherposte (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(view.getScene());
    }
    public void affichermachine (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(view.getScene());
       
    }
}
