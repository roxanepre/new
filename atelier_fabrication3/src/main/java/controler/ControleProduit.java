/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import modele.*;
import view.*; 
/**
 *
 * @author User
 */
public class ControleProduit {
    
    private final ProduitView vue7;
    
    public ControleProduit(ProduitView v) {
        this.vue7 = v;
    }
    
    public void afficherProduitScene (){
        ProduitView nouvelle_vueA = new ProduitView();
        nouvelle_vueA.actionProd(vue7.getScene()); 
    }
    
    public void afficherGammeScene () {
        GammeView nouvelle_vueB = new GammeView();
        nouvelle_vueB.afficheGamme(vue7.getScene()); 
    }
    
   public void afficherOperationScene (){
       OperationView nouvelle_vueC = new OperationView(); 
       nouvelle_vueC.actionOp(vue7.getScene()); 
   }
       
   public void afficherEquipementScene(){
       EquipementView nouvelle_vueD = new EquipementView(); 
       nouvelle_vueD.afficheequip(vue7.getScene());
   }
   
   public void afficherPersonnelScene (){
       PersonnelView nouvelle_vueE = new PersonnelView();
       nouvelle_vueE.actionPersonnel(vue7.getScene());
       
   }
   public void afficherposteScene (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(vue7.getScene());
    }
    public void affichermachineScene (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(vue7.getScene());
    }
    
    public void creerProd() {
        Produit prod1 = new Produit(this.vue7.getRecup_code_prod().getText(),
                                    this.vue7.getRecup_desc_prod().getText());
    
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("produits.txt",true));
            bw.write(prod1.getCodeProduit()+" : description "+prod1.getDproduit());
            bw.newLine();
            bw.close();
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
                System.out.println(line);
                if (line.startsWith(this.vue7.getRecup_code_prod().getText())){
                    System.out.println(line); 
                    Stage aff_prod = new Stage();
                    aff_prod.setMaxHeight(400);
                    aff_prod.setMaxWidth(600);
                    aff_prod.setMinHeight(300);
                    aff_prod.setMinWidth(500);
                    GridPane layout_aff = new GridPane();
                    Scene scen_aff = new Scene(layout_aff);
                    Label code_aff_prod = new Label(this.vue7.getRecup_code_prod().getText());
                    Label desc_aff_prod = new Label(this.vue7.getRecup_desc_prod().getText());
                    layout_aff.add(this.vue7.getCode_prod(),0,0,1,1);
                    layout_aff.add(code_aff_prod,1,0,1,1);
                    layout_aff.add(this.vue7.getDesc_prod(),0,1,1,1);
                    layout_aff.add(desc_aff_prod,1,1,1,1);
                    aff_prod.setTitle("Affichage du produit");
                    aff_prod.setScene(scen_aff);
                    aff_prod.show();
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
                if (!ligne.startsWith(this.vue7.getRecup_code_prod().getText())) {
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
            System.out.println(this.vue7.getRecup_code_prod().getText()+" supprmé avec succès");
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
                if (line.startsWith(this.vue7.getRecup_code_prod().getText())) {
                    line = this.vue7.getRecup_code_prod().getText()+" : description "+this.vue7.getRecup_desc_prod().getText();
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
            System.out.println(this.vue7.getRecup_code_prod().getText()+" modifié avec succès");
        }
    }
}
