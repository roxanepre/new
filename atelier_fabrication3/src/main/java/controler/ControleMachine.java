/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.* ;
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
        // ici je cherche dans le fichier la ligne qui commence par machine1 pour ensuite afficher les informations de cette ligne
        try (BufferedReader reader = new BufferedReader(new FileReader(pw))){
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
        
    }
    
}
