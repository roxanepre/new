/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modele.*;
import view.*; 
// j'importe toutes les classes des autre packages pour bien avoir accès aux autres trucs comme les méthodes
/**
 *
 * @author User
 */
public class ControleProduit {
    
    private TextField recup_code_produit;
    private TextField recup_d_produit;
    
    public ControleProduit (Button creer, Button afficher, Button modifier, Button supprimer,
                      TextField recup_code_produit, TextField recup_d_produit) {
        this.recup_code_produit = recup_code_produit;
        this.recup_d_produit = recup_d_produit;
        
   
        afficher.setOnAction(e -> afficheProduit()); // je ne sais pas pq ils ne reconnait pas la méthode alors qu'elle est dans le package modele que j'ai importé
        modifier.setOnAction(e -> modifierProduit());
        supprimer.setOnAction(e -> supprimerProduit());
        
        // j'utilise les setOn avec "lambda" comme le diapo bleu du moodle
        
    }
    
    
}
