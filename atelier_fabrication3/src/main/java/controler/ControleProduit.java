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
// j'importe toutes les classes des autre packages pour bien avoir accès aux autres trucs comme les méthodes
/**
 *
 * @author User
 */
public class ControleProduit {
    
    private final ProduitView vue;
    
    public ControleProduit(ProduitView v) {
        this.vue = v;
    }
    
    public void afficherProduitScene (){
        ProduitView nouvelle_vueA = new ProduitView();
        nouvelle_vueA.actionProd(vue.getScene()); 
    }
    
    public void afficherGammeScene () {
        GammeView nouvelle_vueB = new GammeView();
        nouvelle_vueB.afficheGamme(vue.getScene()); 
    }
    
   public void afficherOperationScene (){
       OperationView nouvelle_vueC = new OperationView(); 
       nouvelle_vueC.actionOp(vue.getScene()); 
   }
       
   public void afficherEquipementScene(){
       EquipementView nouvelle_vueD = new EquipementView(); 
       nouvelle_vueD.afficheequip(vue.getScene());
   }
   
   public void afficherPersonnelScene (){
       PersonnelView nouvelle_vueE = new PersonnelView();
       nouvelle_vueE.actionPersonnel(vue.getScene());
       
   }
   public void afficherposteScene (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(vue.getScene());
    }
    public void affichermachineScene (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(vue.getScene());
    }
    
    public void creerProd() {
        Produit prod1 = new Produit(this.vue.getRecup_code_prod().getText(),
                                    this.vue.getRecup_desc_prod().getText());
    
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("produits.txt",true));
            bw.write(prod1.getCodeProduit()+" : description "+prod1.getDproduit());
            bw.newLine();
            //bw.close()
            System.out.println(prod1.getCodeProduit()+" ajouté au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherProd(Produit prod1) {
// ici je cherche dans le fichier la ligne qui commence par prod1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("produits.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith(prod1.getCodeProduit())){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void supprimerProd(Produit prod1){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par prod1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par prod1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("produits.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith(prod1.getCodeProduit())) {
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
            System.out.println(prod1.getCodeProduit()+" supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void modifierProd(Produit prod1){
// pour modifier, je pars du principe que codeProduit ne peut pas être modifié pour reconnaître la machine et changer les autres attributs si ncéessaire
        File originalFile = new File("produits.txt");
        File tempFile = new File("produits_temporaire.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile, true))){
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(prod1.getCodeProduit())) {
                    line = prod1.getCodeProduit()+" : description "+prod1.getDproduit();
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Remplacement du fichier original
        if (originalFile.delete()) {
            tempFile.renameTo(originalFile);
        }
    }
}
