/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import modele.*;
import view.*; 
/**
 *
 * @author User
 */
public class ControlePoste {
    
    private final PosteView vue ;
   
    public ControlePoste(PosteView v) {
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
    
    public void creerPoste(){
        Poste poste1 = new Poste(this.vue.getRecup_ref_poste().getText(),
                                 this.vue.getRecup_des_poste().getText());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("postes.txt",true));
            String line ;
            line = poste1.getIdEquipement()+" : sa description est "+poste1.getdEquipement()+" et ce poste contient les machines suivantes "+poste1.getListMachine();
            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.close();
            System.out.println(poste1.getIdEquipement()+" ajouté au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherPoste(Poste poste1) {
        System.out.println("méthode lancée");
// ici je cherche dans le fichier la ligne qui commence par prod1 pour ensuite afficher les informations de cette ligne
        File f = new File("postes.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(f))){
            String line ;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                      
                if (line.startsWith(this.vue.getRecup_ref_poste().getText())){
                    //Label affposte = new Label(line);
                    System.out.println(line); 
                    Stage aff_poste = new Stage();
                    GridPane layout_aff = new GridPane();
                    Scene scen_aff = new Scene(layout_aff);
                    Label ref_aff_poste = new Label(this.vue.getRecup_ref_poste().getText());
                    Label desc_aff_poste = new Label(this.vue.getRecup_des_poste().getText());
                    //Label mach_poste = new Label("Liste des machines");
                    layout_aff.add(this.vue.getRef_poste(),0,0,1,1);
                    layout_aff.add(ref_aff_poste,1,0,1,1);
                    layout_aff.add(this.vue.getDes_poste(),0,1,1,1);
                    layout_aff.add(desc_aff_poste,1,1,1,1);
                    //layout_aff.add(poste1.getListMachine(),0,2,1,1); il faut convertir une arraylist en autre chose mais je vois pas trop comment faire
                    //lajout_aff.add(mach_poste,1,2,1,1);
                    aff_poste.setTitle("Affichage du poste");
                    aff_poste.setScene(scen_aff);
                    aff_poste.show();
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
            System.out.println(this.vue.getRecup_ref_poste().getText()+" supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void modifierPoste(Poste poste1){
// pour modifier, je pars du principe que idEquipement ne peut pas être modifié pour reconnaître le poste et changer les autres attributs si ncéessaire
        File originalFile = new File("postes.txt");
        File tempFile = new File("postes_temporaire.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))){
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(this.vue.getRecup_ref_poste().getText())) {
                    line = this.vue.getRecup_ref_poste().getText()+" : sa description est "+this.vue.getRecup_des_poste().getText()+" et ce poste contient les machines suivantes "+poste1.getListMachine();
                    
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
            System.out.println(this.vue.getRecup_ref_poste().getText()+" modifié avec succès");
        }
    }
}
