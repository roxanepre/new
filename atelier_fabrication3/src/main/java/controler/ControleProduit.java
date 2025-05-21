/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
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
    
    private ProduitView vue;
    
    public ControleProduit(ProduitView v) {
        this.vue = v;
    }
    
    public void creerProd() {
        Produit prod1 = new Produit(Integer.parseInt(this.vue.getRecup_code_prod().getText()),
                                    this.vue.getRecup_desc_prod().getText());
    
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("produits.txt",true));
            bw.write("Produit1 :"+prod1.getCodeProduit()+" ; "+prod1.getDproduit());
            bw.newLine();
            //bw.close()
            System.out.println("Produit1 ajouté au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherProd() {
// ici je cherche dans le fichier la ligne qui commence par prod1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("produits.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith("Produit1")){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void supprimerProd(){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par prod1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par prod1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("produits.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith("Produit1")) {
                    lignesARetenir.add(ligne);
                }
            }
    } catch (IOException e) { 
        e.printStackTrace();
        return;
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("produits.txt", true))) {
            for (String ligne : lignesARetenir) {
                writer.write(ligne);
                writer.newLine();
            }
            System.out.println("Produit1 supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void modifierProd(){
        
    }
}
