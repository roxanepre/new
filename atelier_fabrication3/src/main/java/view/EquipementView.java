/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import controler.ControleEquipement;
import view.PosteView;

/**
 *
 * @author roxanepierre
 */
public class EquipementView {
    
    FlowPane pane_equip = new FlowPane();
    Scene scene_equip = new Scene(pane_equip,400,300);
    Button poste = new Button("Poste");
    Button machine = new Button("Machine");

    public EquipementView(Scene scene) {
        this.pane_equip.setHgap(5);
        this.pane_equip.getChildren().addAll(this.poste,this.machine);
        this.scene_equip=scene;
    }
    
    public void afficheequip(Scene scene){
        this.scene_equip = scene;
        AccueilView.getFenetre_principale().setScene(scene);
        AccueilView.getFenetre_principale().show();
        EquipementView view_equip = new EquipementView(scene);
        ControleEquipement controle_equip = new ControleEquipement(view_equip);
        this.poste.setOnAction(evt -> {controle_equip.afficherposte(scene);});
        this.machine.setOnAction(evt ->{controle_equip.affichermachine(scene);});

        
    }
}
