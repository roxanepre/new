/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
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
        Machine mach1 = new Machine(String.parseString(this.vue.getRefMachine().getText()),
                                    Int.parseInt(this.vue.getEtat().getText()),
                                    Int.parseInt(this.vue.getDisponibilite().getText()),
                                    Int.parseInt(this.vue.getX_pos().getText()),
                                    Int.parseInt(this.vue.getY_pos().getText()),
                                    Float.parseFloat(this.vue.getC().getText()),
                                    Int.parseInt(this.vue.getType().getText()));
        this.vue.getModele().add(mach1);
        
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileOutputStream("machines.txt"));
            for (Machine mach1 : this.vue.getModele()){
                pw.println("Machine1;"+mach1.getRefMachine()+";"+mach1.getEtat()+";"+mach1.getDisponibilite()+";"+mach1.getX_pos()+";"+mach1.getY_pos()+";"+mach1.getC()+";"+mach1.getType());
            }
            pw.close();
            System.out.println("Machine1 ajoutée au fichier");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void afficherMach(){
        
    }
    
    public void modifierMach(){
        
    }
    
    public void supprimerMach(){
        
    }
    
}
