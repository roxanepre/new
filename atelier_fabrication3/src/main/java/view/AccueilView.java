/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


/**
 *
 * @author User
 */
public class AccueilView {
    StackPane pane_welcome = new StackPane();
    Scene scene_welcome = new Scene(pane_welcome);
    Label welcome = new Label("Bienvenue dans l'application de votre atelier !");
    Button enter_atelier = new Button("Entrer dans l'atelier");
    pane_welcome.getChildren().addAll(welcome,enter_atelier);  
}
