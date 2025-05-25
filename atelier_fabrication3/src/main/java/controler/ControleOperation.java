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
    
    private final OperationView vue3;
    
    public ControleOperation(OperationView v) {
        this.vue3 = v;
    }
    
    public void afficherProduitScene (){
        ProduitView nouvelle_vueA = new ProduitView();
        nouvelle_vueA.actionProd(vue3.getScene()); 
    }
    
    public void afficherGammeScene () {
        GammeView nouvelle_vueB = new GammeView();
        nouvelle_vueB.afficheGamme(vue3.getScene()); 
    }
    
   public void afficherOperationScene (){
       OperationView nouvelle_vueC = new OperationView(); 
       nouvelle_vueC.actionOp(vue3.getScene()); 
   }
       
   public void afficherEquipementScene(){
       EquipementView nouvelle_vueD = new EquipementView(); 
       nouvelle_vueD.afficheequip(vue3.getScene());
   }
   
   public void afficherPersonnelScene (){
       PersonnelView nouvelle_vueE = new PersonnelView();
       nouvelle_vueE.actionPersonnel(vue3.getScene());
       
   }
   public void afficherposteScene (){
        PosteView nouvelle_vue2 = new PosteView();
        nouvelle_vue2.afficheposte(vue3.getScene());
    }
    public void affichermachineScene (){
        MachineView nouvelle_vue3 = new MachineView();
        nouvelle_vue3.actionMach(vue3.getScene());
    }
    public void creerOperation(){
        Operation op1 = new Operation(this.vue3.getRecup_id_op().getText(),
                                      this.vue3.getRecup_desc_op().getText(),
                                      Float.parseFloat(this.vue3.getRecup_dur_op().getText()));
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
                if (line.startsWith(this.vue3.getRecup_id_op().getText())){
                    System.out.println(line); 
                    Stage aff_op = new Stage();
                    aff_op.setMaxHeight(400);
                    aff_op.setMaxWidth(600);
                    aff_op.setMinHeight(300);
                    aff_op.setMinWidth(500);
                    GridPane layout_aff = new GridPane();
                    Scene scen_aff = new Scene(layout_aff);
                    Label id_aff_op = new Label(this.vue3.getRecup_id_op().getText());
                    Label desc_aff_op = new Label(this.vue3.getRecup_desc_op().getText());
                    Label dur_aff_op = new Label(this.vue3.getRecup_dur_op().getText());
                    layout_aff.add(this.vue3.getId_op(),0,0,1,1);
                    layout_aff.add(id_aff_op,1,0,1,1);
                    layout_aff.add(this.vue3.getDesc_op(),0,1,1,1);
                    layout_aff.add(desc_aff_op,1,1,1,1);
                    layout_aff.add(this.vue3.getDur_op(),0,2,1,1);
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
