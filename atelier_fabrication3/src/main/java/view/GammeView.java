/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author roxanepierre
 */
public class GammeView {
    BorderPane pane_gamme = new BorderPane();
    Scene scene_gamme = new Scene(pane_gamme);
    Label ref_gam = new Label("reference");
    TextField recup_ref_gam = new TextField();
    Label id_gam = new Label("identifiant");
    TextField recup_id_gam = new TextField();
    pane_gamme.getChildren().addAll(ref_gam,recup_ref_gam,id_gam,recup_id_gam);
