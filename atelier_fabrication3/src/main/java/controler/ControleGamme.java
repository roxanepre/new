/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.Scene;
import modele.*;
import view.*;
/**
 *
 * @author User
 */
public class ControleGamme {
    private GammeView vue;

    public ControleGamme(GammeView vue) {
        this.vue = vue;
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
    
    public void creerGamme(Produit prod1) {

        Gamme gamme1 = new Gamme(this.vue.getRecup_id_gam().getText(),
                                 this.vue.getRecup_ref_gam().getText());
        gamme1.creerGamme(prod1, gamme1.getIdGamme(), gamme1.getRefGamme());
        try {
            BufferedWriter pw = new BufferedWriter(new FileWriter("gammes.txt",true)); // j'utilise true pour ne pas effacer l'ancien contenu à chaque fois que j'appelle machine.txt
            pw.write(gamme1.getIdGamme()+" : référence "+gamme1.getRefGamme()+", liste de machines "+gamme1.getListMachine()+", durée "+gamme1.dureeGamme(gamme1.getListOp(), 0)+" et coût "+gamme1.cout_gamme());
            pw.newLine();
            //pw.close()
            System.out.println(gamme1.getIdGamme()+" ajoutée au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherGamme(Gamme gamme1){

        try (BufferedReader reader = new BufferedReader(new FileReader("gammes.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith(this.vue.getRecup_id_gam().getText())){
                    System.out.println(line); 
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void modifierGamme(Gamme gamme1){
        
    }
    
    public void supprimerGamme(Gamme gamme1){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par machine1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par machine1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("gammes.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith(this.vue.getRecup_id_gam().getText())) {
                    lignesARetenir.add(ligne);
                }
            }
    } catch (IOException e) { 
        e.printStackTrace();
        return;
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("gammes.txt", true))) {
            for (String ligne : lignesARetenir) {
                writer.write(ligne);
                writer.newLine();
            }
            System.out.println(this.vue.getRecup_id_gam().getText()+" supprmée avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void ajouterOp(Gamme gamme1, Operation op1){
        gamme1.ajouterOp(op1);
    }
    
    public void ajouterMach(Gamme gamme1, Machine mach1){
        gamme1.ajouterMachine(mach1);
    }
    
}
