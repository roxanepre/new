/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.io.* ;
import java.util.ArrayList;
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
