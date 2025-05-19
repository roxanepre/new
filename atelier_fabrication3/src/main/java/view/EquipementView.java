/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author roxanepierre
 */
public class EquipementView {
    
    FlowPane pane_equip = new FlowPane();
    Scene scene_equip = new Scene(pane_equip);
    Button poste = new Button("Poste");
    Button machine = new Button("Machine");
    //pane_equip.getChildren().addAll(poste,machine); // même erreur : je fais le constructeur sinon ca ne marche pas 

    public EquipementView() {
        pane_equip.setHgap(5);
        pane_equip.getChildren().addAll(poste,machine);
    }
}
