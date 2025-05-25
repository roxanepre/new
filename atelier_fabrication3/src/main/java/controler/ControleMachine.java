/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.* ;
import java.util.ArrayList;
import javafx.scene.Scene;
import view.MachineView ;
import modele.Machine ;
import view.EquipementView;
import view.GammeView;
import view.OperationView;
import view.PersonnelView;
import view.PosteView;
import view.ProduitView;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class ControleMachine {
    
    private final MachineView vue2;
    
    public ControleMachine(MachineView v) {
        this.vue2 = v;
    }
    public void afficherProduitScene (){
        ProduitView nouvelle_vueA = new ProduitView();
        nouvelle_vueA.actionProd(vue2.getScene()); 
    }
    
    public void afficherGammeScene () {
        GammeView nouvelle_vueB = new GammeView();
        nouvelle_vueB.afficheGamme(vue2.getScene()); 
    }
    
   public void afficherOperationScene (){
       OperationView nouvelle_vueC = new OperationView(); 
       nouvelle_vueC.actionOp(vue2.getScene());
   }
       
   public void afficherEquipementScene(){
       EquipementView nouvelle_vueD = new EquipementView(); 
       nouvelle_vueD.afficheequip(vue2.getScene());
   }
   
   public void afficherPersonnelScene (){
       PersonnelView nouvelle_vueE = new PersonnelView();
       nouvelle_vueE.actionPersonnel(vue2.getScene());
       
   }
   public void afficherposteScene (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(vue2.getScene());
    }
    public void affichermachineScene (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(vue2.getScene());
    }
    public void creerMac() {

        Machine mach1 = new Machine(this.vue2.getRecup_ref_mac().getText(),
                                    this.vue2.getRecup_desc_mac().getText(),
                                    Integer.parseInt(this.vue2.getRecup_dispo_mac().getText()),
                                    Integer.parseInt(this.vue2.getRecup_abs_mac().getText()),
                                    Integer.parseInt(this.vue2.getRecup_ord_mac().getText()),
                                    Integer.parseInt(this.vue2.getRecup_etat_mac().getText()),
                                    Float.parseFloat(this.vue2.getRecup_cout_mac().getText()));
        
        try {
            BufferedWriter pw = new BufferedWriter(new FileWriter("machines.txt",true)); // j'utilise true pour ne pas effacer l'ancien contenu à chaque fois que j'appelle machine.txt
            pw.write(mach1.getRefMachine()+" : état "+mach1.getEtat()+", disponibilité "+mach1.getDisponibilite()+", position "+mach1.getX_pos()+";"+mach1.getY_pos()+" et cout "+mach1.getC());
            pw.newLine();
            pw.close();
            System.out.println(mach1.getRefMachine()+" ajoutée au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherMach(Machine mach1){
// ici je cherche dans le fichier la ligne qui commence par machine1 pour ensuite afficher les informations de cette ligne
        System.out.println("méthode lancée");
        try (BufferedReader reader = new BufferedReader(new FileReader("machines.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                if (line.startsWith(this.vue2.getRecup_ref_mac().getText())){
                    System.out.println(line);
                    Stage aff_machine = new Stage();
                    GridPane layout_aff = new GridPane();
                    Scene scen_aff = new Scene(layout_aff);
                    Label ref_aff_mac = new Label(this.vue2.getRecup_ref_mac().getText());
                    Label desc_aff_mac = new Label(this.vue2.getRecup_desc_mac().getText());
                    Label dispo_aff_mach = new Label(this.vue2.getRecup_dispo_mac().getText());
                    Label abs_mac_aff = new Label(this.vue2.getRecup_abs_mac().getText());
                    Label ord_mac_aff = new Label(this.vue2.getRecup_ord_mac().getText());
                    Label etat_mac_aff = new Label(this.vue2.getRecup_etat_mac().getText());
                    //Label cout_mac_aff = new Label(this.vue.getRecup_cout_mac().getText());
                    layout_aff.add(this.vue2.getRef_mac(),0,0,1,1);
                    layout_aff.add(ref_aff_mac,1,0,1,1);
                    layout_aff.add(this.vue2.getDesc_mac(),0,1,1,1);
                    layout_aff.add(desc_aff_mac,1,1,1,1);
                    layout_aff.add(this.vue2.getDispo_mac(),0,2,1,1);
                    layout_aff.add(dispo_aff_mach,1,2,1,1);
                    layout_aff.add(this.vue2.getAbs_mac(),0,3,1,1);
                    layout_aff.add(abs_mac_aff,1,3,1,1);
                    layout_aff.add(this.vue2.getOrd_mac(),0,4,1,1);
                    layout_aff.add(ord_mac_aff ,1,4,1,1);
                    layout_aff.add(this.vue2.getEtat_mac(),0,5,1,1);
                    layout_aff.add(etat_mac_aff,1,5,1,1);
                    aff_machine.setTitle("Affichage de la machine");
                    aff_machine.setScene(scen_aff);
                    aff_machine.show();
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void modifierMach(Machine mach1){
// pour modifier, je pars du principe que refmachine ne peut pas être modifié pour reconnaître la machine et changer les autres attributs si ncéessaire
        File originalFile = new File("machines.txt");
        File tempFile = new File("machines_temporaire.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile, true))){
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(mach1.getRefMachine())) {
                    line = mach1.getRefMachine()+" : état "+mach1.getEtat()+", disponibilité "+mach1.getDisponibilite()+", position "+mach1.getX_pos()+";"+mach1.getY_pos()+" et cout "+mach1.getC();
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
    
    public void supprimerMach(Machine mach1){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par machine1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par machine1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("machines.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith(mach1.getRefMachine())) {
                    lignesARetenir.add(ligne);
                }
            }
    } catch (IOException e) { 
        e.printStackTrace();
        return;
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("machines.txt", true))) {
            for (String ligne : lignesARetenir) {
                writer.write(ligne);
                writer.newLine();
            }
            System.out.println(mach1.getRefMachine()+" supprmée avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
