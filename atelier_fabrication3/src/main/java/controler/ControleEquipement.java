/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
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
    
    public void afficherProduitScene (Scene scene){
        ProduitView nouvelle_vueA5 = new ProduitView();
        nouvelle_vueA5.actionProd(scene); 
    }
    
    public void afficherGammeScene (Scene scene) {
        GammeView nouvelle_vueB5 = new GammeView();
        nouvelle_vueB5.afficheGamme(scene); 
    }
    
    public void afficherOperationScene (Scene scene){
       OperationView nouvelle_vueC5 = new OperationView(); 
       nouvelle_vueC5.actionOp(scene); 
    }
       
    public void afficherEquipementScene(Scene scene){
       EquipementView nouvelle_vueD5 = new EquipementView(); 
       nouvelle_vueD5.afficheequip(scene);
    }
   
    public void afficherPersonnelScene (Scene scene){
       PersonnelView nouvelle_vueE5 = new PersonnelView();
       nouvelle_vueE5.actionPersonnel(scene);
       
    }
    public void afficherposte (Scene scene){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(scene);
    }
    public void affichermachine (Scene scene){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(scene);
       
    }
}
