/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import view.* ;
import modele.* ;
/**
 *
 * @author User
 */
public class ControlePersonnel {
    
    private final PersonnelView vue;
    
    public ControlePersonnel(PersonnelView v) {
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
    public void embaucherPersonnel(){
        Personnel pers1 = new Personnel(this.vue.getRecup_id_pers().getText(),
                                    this.vue.getRecup_nom_pers().getText(),
                                    this.vue.getRecup_pren_pers().getText(),
                                    this.vue.getRecup_mdp_pers().getText());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("personnels.txt",true));
            bw.write(pers1.idPersonne+" : nom "+pers1.getNom()+", prénom "+pers1.getPrenom()+" et mot de passe "+pers1.getPassword());
            bw.newLine();
            bw.close();
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
                if (line.startsWith(this.vue.getRecup_id_pers().getText())){
                    System.out.println(line); 
                    Stage aff_pers = new Stage();
                    GridPane layout_aff = new GridPane();
                    Scene scen_aff = new Scene(layout_aff);
                    Label id_aff_pers = new Label(this.vue.getRecup_id_pers().getText());
                    Label nom_aff_pers = new Label(this.vue.getRecup_nom_pers().getText());
                    Label prenom_aff_pers = new Label(this.vue.getRecup_pren_pers().getText());
                    Label mdp_pers_aff = new Label(this.vue.getRecup_mdp_pers().getText());
                    layout_aff.add(this.vue.getId_pers(),0,0,1,1);
                    layout_aff.add(id_aff_pers,1,0,1,1);
                    layout_aff.add(this.vue.getNom_pers(),0,1,1,1);
                    layout_aff.add(nom_aff_pers,1,1,1,1);
                    layout_aff.add(this.vue.getPren_pers(),0,2,1,1);
                    layout_aff.add(prenom_aff_pers,1,2,1,1);
                    layout_aff.add(this.vue.getMdp_pers(),0,3,1,1);
                    layout_aff.add(mdp_pers_aff,1,3,1,1);
                    aff_pers.setTitle("Affichage du personnel");
                    aff_pers.setScene(scen_aff);
                    aff_pers.show();
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
                if (!ligne.startsWith(this.vue.getRecup_id_pers().getText())) {
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
                writer.close();
            }
            System.out.println(this.vue.getRecup_id_pers().getText()+" supprmé avec succès");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
