/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import view.EquipementView;
import view.PosteView;
import view.MachineView;
import javafx.scene.Scene;



/**
 *
 * @author User
 */
public class ControleEquipement {
    EquipementView view;

    public ControleEquipement(EquipementView view) {
        this.view = view;
    }
    public void afficherposte (Scene scene){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(scene);
    }
    public void affichermachine (Scene scene){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(scene);
        
        /*    public void affichemachine (Scene scene){
*/
        //à mettre dans machineView
        
    }
}
