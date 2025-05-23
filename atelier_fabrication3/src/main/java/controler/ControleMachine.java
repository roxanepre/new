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

/**
 *
 * @author User
 */
public class ControleMachine {
    
    private MachineView vue;
    
    public ControleMachine(MachineView v) {
        this.vue = v;
    }
    public void afficherProduitScene (Scene scene){
        ProduitView nouvelle_vueA7 = new ProduitView();
        nouvelle_vueA7.actionProd(scene); 
    }
    
    public void afficherGammeScene (Scene scene) {
        GammeView nouvelle_vueB7 = new GammeView();
        nouvelle_vueB7.afficheGamme(scene); 
    }
    
   public void afficherOperationScene (Scene scene){
       OperationView nouvelle_vueC7 = new OperationView(); 
       nouvelle_vueC7.actionOp(scene);
   }
       
   public void afficherEquipementScene(Scene scene){
       EquipementView nouvelle_vueD7 = new EquipementView(); 
       nouvelle_vueD7.afficheequip(scene);
   }
   
   public void afficherPersonnelScene (Scene scene){
       PersonnelView nouvelle_vueE7 = new PersonnelView();
       nouvelle_vueE7.actionPersonnel(scene);
       
   }
   public void afficherposteScene (Scene scene){
        PosteView nouvelle_vue7 = new PosteView();
        nouvelle_vue7.afficheposte(scene);
    }
    public void affichermachineScene (Scene scene){
        MachineView nouvelle_vue7 = new MachineView();
        nouvelle_vue7.actionMach(scene);
    }
    public void creerMac() {
// ici je ne sais pas comment faire pour que on crée au fur et à mesure des machines avec le numéro qui augmente et qu'elles s'appellent pas toutes machine1
        Machine mach1 = new Machine(this.vue.getRecup_ref_mac().getText(),
                                    this.vue.getRecup_desc_mac().getText(),
                                    Integer.parseInt(this.vue.getRecup_dispo_mac().getText()),
                                    Integer.parseInt(this.vue.getRecup_abs_mac().getText()),
                                    Integer.parseInt(this.vue.getRecup_ord_mac().getText()),
                                    Integer.parseInt(this.vue.getRecup_etat_mac().getText()),
                                    Float.parseFloat(this.vue.getRecup_cout_mac().getText()));
        
        try {
            BufferedWriter pw = new BufferedWriter(new FileWriter("machines.txt",true)); // j'utilise true pour ne pas effacer l'ancien contenu à chaque fois que j'appelle machine.txt
            pw.write(mach1.getRefMachine()+" : état "+mach1.getEtat()+", disponibilité "+mach1.getDisponibilite()+", position "+mach1.getX_pos()+";"+mach1.getY_pos()+" et cout "+mach1.getC());
            pw.newLine();
            //pw.close()
            System.out.println(mach1.getRefMachine()+" ajoutée au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherMach(Machine mach1){
// ici je cherche dans le fichier la ligne qui commence par machine1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("machines.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith(mach1.getRefMachine())){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void modifierMach(){
        
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
