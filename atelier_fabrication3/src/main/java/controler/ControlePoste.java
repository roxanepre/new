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
/**
 *
 * @author User
 */
public class ControlePoste {
    
    private PosteView vue ;
   
    public ControlePoste(PosteView v) {
        this.vue = v;
    }
    
    public void creerPoste(){
        Poste poste1 = new Poste(this.vue.getRecup_ref_poste().getText(),
                                 this.vue.getRecup_des_poste().getText());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("postes.txt",true));
            bw.write("Poste1 : l'identifiant du compte est "+poste1.getIdEquipement()+", sa description est "+poste1.getdEquipement()+" et ce poste contient les machines suivantes "+poste1.getListMachine());
            bw.newLine();
            //bw.close()
            System.out.println("Poste1 ajouté au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherPoste() {
// ici je cherche dans le fichier la ligne qui commence par prod1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("postes.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith("Poste1")){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void supprimerPoste(){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par poste1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par poste1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("postes.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith("Poste1")) {
                    lignesARetenir.add(ligne);
                }
            }
    } catch (IOException e) { 
        e.printStackTrace();
        return;
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("postes.txt", true))) {
            for (String ligne : lignesARetenir) {
                writer.write(ligne);
                writer.newLine();
            }
            System.out.println("Poste1 supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void modifierPoste(){
        
    }
}
