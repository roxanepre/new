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
/**
 *
 * @author User
 */
public class ControleOperation {
    
    private OperationView vue;
    
    public ControleOperation(OperationView v) {
        this.vue = v;
    }
    
    public void afficherProduitScene (Scene scene){
        ProduitView nouvelle_vueA1 = new ProduitView();
        nouvelle_vueA1.actionProd(scene); 
    }
    
    public void afficherGammeScene (Scene scene) {
        GammeView nouvelle_vueB1 = new GammeView();
        nouvelle_vueB1.afficheGamme(scene); 
    }
    
   public void afficherOperationScene (Scene scene){
       OperationView nouvelle_vueC1 = new OperationView(); 
       nouvelle_vueC1.actionOp(scene); 
   }
       
   public void afficherEquipementScene(Scene scene){
       EquipementView nouvelle_vueD1 = new EquipementView(); 
       nouvelle_vueD1.afficheequip(scene);
   }
   
   public void afficherPersonnelScene (Scene scene){
       PersonnelView nouvelle_vueE1 = new PersonnelView();
       nouvelle_vueE1.actionPersonnel(scene);
       
   }
   public void afficherposteScene (Scene scene){
        PosteView nouvelle_vueF1 = new PosteView();
        nouvelle_vueF1.afficheposte(scene);
    }
    public void affichermachineScene (Scene scene){
        MachineView nouvelle_vueG1 = new MachineView();
        nouvelle_vueG1.actionMach(scene);
    }
    public void creerOperation(){
        Operation op1 = new Operation(this.vue.getRecup_id_op().getText(),
                                      this.vue.getRecup_desc_op().getText(),
                                      Float.parseFloat(this.vue.getRecup_dur_op().getText()));
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("operations.txt",true));
            bw.write(op1.getIdOperation()+" : description "+op1.getdOperation()+" et durée de "+op1.getDureeOperation());
            bw.newLine();
            //bw.close()
            System.out.println(op1.getIdOperation()+" ajoutée au fichier");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherOperation(Operation op1) {
// ici je cherche dans le fichier la ligne qui commence par operation1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader("operations.txt"))){
            String line ;
            while ((line = reader.readLine()) != null){
                if (line.startsWith(op1.getIdOperation())){
                    System.out.println(line); // je pense qu'il faudra modifier ça pour que ça apparaissent sur l'interface mais c'est l'idée
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
