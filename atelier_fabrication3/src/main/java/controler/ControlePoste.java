/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
import javafx.scene.Scene;
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
    
    public void afficherProduitScene (Scene scene){
        ProduitView nouvelle_vueA3 = new ProduitView();
        nouvelle_vueA3.actionProd(scene); 
    }
    
    public void afficherGammeScene (Scene scene) {
        GammeView nouvelle_vueB3 = new GammeView();
        nouvelle_vueB3.afficheGamme(scene); 
    }
    
   public void afficherOperationScene (Scene scene){
       OperationView nouvelle_vueC3 = new OperationView(); 
       nouvelle_vueC3.actionOp(scene); 
   }
       
   public void afficherEquipementScene(Scene scene){
       EquipementView nouvelle_vueD3 = new EquipementView(); 
       nouvelle_vueD3.afficheequip(scene);
   }
   
   public void afficherPersonnelScene (Scene scene){
       PersonnelView nouvelle_vueE3 = new PersonnelView();
       nouvelle_vueE3.actionPersonnel(scene);
       
   }
   public void afficherposteScene (Scene scene){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(scene);
    }
    public void affichermachineScene (Scene scene){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(scene);
    }
    
    public void creerPoste(){
        Poste poste1 = new Poste(this.vue.getRecup_ref_poste().getText(),
                                 this.vue.getRecup_des_poste().getText());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("postes.txt",true));
            bw.write(poste1.getIdEquipement()+" : sa description est "+poste1.getdEquipement()+" et ce poste contient les machines suivantes "+poste1.getListMachine());
            bw.newLine();
            //bw.close()
            System.out.println(poste1.getIdEquipement()+" ajouté au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherPoste(Poste poste1) {
// ici je cherche dans le fichier la ligne qui commence par prod1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("postes.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith(poste1.getIdEquipement())){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void supprimerPoste(Poste poste1){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par poste1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par poste1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("postes.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith(poste1.getIdEquipement())) {
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
            System.out.println(poste1.getIdEquipement()+" supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void modifierPoste(){
        
    }
}
