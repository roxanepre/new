/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
import view.* ;
import modele.* ;
/**
 *
 * @author User
 */
public class ControlePersonnel {
    
    private PersonnelView vue;
    
    public ControlePersonnel(PersonnelView v) {
        this.vue = v;
    }
    
    public void embaucherPersonnel(){
        Personnel pers1 = new Personnel(this.vue.getRecup_id_pers().getText(),
                                    this.vue.getRecup_nom_pers().getText(),
                                    this.vue.getRecup_pren_pers().getText(),
                                    this.vue.getRecup_mdp_pers().getText());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("personnels.txt",true));
            bw.write("Personnel1 : identifiant "+pers1.idPersonne+", nom "+pers1.getNom()+", prénom "+pers1.getPrenom());
            bw.newLine();
            //bw.close()
            System.out.println("Personnel1 ajouté au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void fichePersonnel() {
// ici je cherche dans le fichier la ligne qui commence par personnel1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("personnels.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith("Personnel1")){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void virerPersonnel(){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par personnel1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par personnel1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("personnels.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith("Personnel1")) {
                    lignesARetenir.add(ligne);
                }
            }
    } catch (IOException e) { 
        e.printStackTrace();
        return;
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("personnels.txt", true))) {
            for (String ligne : lignesARetenir) {
                writer.write(ligne);
                writer.newLine();
            }
            System.out.println("Personnel1 supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
