/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.* ;
import java.util.ArrayList;
import view.MachineView ;
import modele.Machine ;

/**
 *
 * @author User
 */
public class ControleMachine {
    
    private MachineView vue;
    
    public ControleMachine(MachineView v) {
        this.vue = v;
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
            pw.write("Machine1;"+mach1.getRefMachine()+";"+mach1.getEtat()+";"+mach1.getDisponibilite()+";"+mach1.getX_pos()+";"+mach1.getY_pos()+";"+mach1.getC());
            pw.newLine();
            //pw.close()
            System.out.println("Machine1 ajoutée au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherMach(){
// ici je cherche dans le fichier la ligne qui commence par machine1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("machines.txt", true))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith("Machine1")){
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
    
    public void supprimerMach(){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par machine1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par machine1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("machines.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith("Machine1")) {
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
            System.out.println("Machine1 supprmée avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
