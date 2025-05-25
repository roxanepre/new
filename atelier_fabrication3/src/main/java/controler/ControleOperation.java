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
import view.OperationView;
import modele.*;
import view.*; 
/**
 *
 * @author User
 */
public class ControleOperation {
    
    private final OperationView vue;
    
    public ControleOperation(OperationView v) {
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
    public void creerOperation(){
        Operation op1 = new Operation(this.vue.getRecup_id_op().getText(),
                                      this.vue.getRecup_desc_op().getText(),
                                      Float.parseFloat(this.vue.getRecup_dur_op().getText()));
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("operations.txt",true));
            bw.write(op1.getIdOperation()+" : description "+op1.getdOperation()+" et durée de "+op1.getDureeOperation());
            bw.newLine();
            bw.close();
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
                System.out.println(line);
                if (line.startsWith(this.vue.getRecup_id_op().getText())){
                    System.out.println(line); 
                    Stage aff_op = new Stage();
                    GridPane layout_aff = new GridPane();
                    Scene scen_aff = new Scene(layout_aff);
                    Label id_aff_op = new Label(this.vue.getRecup_id_op().getText());
                    Label desc_aff_op = new Label(this.vue.getRecup_desc_op().getText());
                    Label dur_aff_op = new Label(this.vue.getRecup_dur_op().getText());
                    layout_aff.add(this.vue.getId_op(),0,0,1,1);
                    layout_aff.add(id_aff_op,1,0,1,1);
                    layout_aff.add(this.vue.getDesc_op(),0,1,1,1);
                    layout_aff.add(desc_aff_op,1,1,1,1);
                    layout_aff.add(this.vue.getDur_op(),0,2,1,1);
                    layout_aff.add(dur_aff_op,1,2,1,1);
                    aff_op.setTitle("Affichage de l'opération");
                    aff_op.setScene(scen_aff);
                    aff_op.show();
                    break ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
