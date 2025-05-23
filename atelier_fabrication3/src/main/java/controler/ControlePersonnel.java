/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
import javafx.scene.Scene;
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
    
    public void afficherProduitScene (){
        ProduitView nouvelle_vueA2 = new ProduitView();
        nouvelle_vueA2.actionProd(vue.getScene()); 
    }
    
    public void afficherGammeScene () {
        GammeView nouvelle_vueB2 = new GammeView();
        nouvelle_vueB2.afficheGamme(vue.getScene()); 
    }
    
   public void afficherOperationScene (){
       OperationView nouvelle_vueC2 = new OperationView(); 
       nouvelle_vueC2.actionOp(vue.getScene()); 
   }
       
   public void afficherEquipementScene(){
       EquipementView nouvelle_vueD2 = new EquipementView(); 
       nouvelle_vueD2.afficheequip(vue.getScene());
   }
   
   public void afficherPersonnelScene (){
       PersonnelView nouvelle_vueE2 = new PersonnelView();
       nouvelle_vueE2.actionPersonnel(vue.getScene());
       
   }
   public void afficherposteScene (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(vue.getScene());
    }
    public void affichermachineScene (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(vue.getScene());
    }
    public void embaucherPersonnel(){
        Personnel pers1 = new Personnel(this.vue.getRecup_id_pers().getText(),
                                    this.vue.getRecup_nom_pers().getText(),
                                    this.vue.getRecup_pren_pers().getText(),
                                    this.vue.getRecup_mdp_pers().getText());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("personnels.txt",true));
            bw.write(pers1.idPersonne+" : nom "+pers1.getNom()+", prénom "+pers1.getPrenom()+" et mot de passe "+pers1.getPassword());
            bw.newLine();
            //bw.close()
            System.out.println(pers1.idPersonne+" ajouté au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void fichePersonnel(Personnel pers1) {
// ici je cherche dans le fichier la ligne qui commence par personnel1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("personnels.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith(pers1.idPersonne)){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public void virerPersonnel(Personnel pers1){
// ici je vais lire toutes les lignes du fichier sauf celle commençant par personnel1 pour les sauvegarder dans une liste 
// pour ensuite les ajouter dans le même fichier sans la ligne qui commence par personnel1
    
    ArrayList<String> lignesARetenir = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("personnels.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (!ligne.startsWith(pers1.idPersonne)) {
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
            System.out.println(pers1.idPersonne+" supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
