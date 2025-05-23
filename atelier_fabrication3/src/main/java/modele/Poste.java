/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;
import java.util.ArrayList;
/**
 *
 * @author mpommier01
 */
public class Poste extends Equipement {
    //private String refPoste;
    //private String dPoste;
    private ArrayList<Machine> listMachine;
    
    public Poste (String refposte, String dposte){
        super(refposte,dposte);
        this.listMachine = new ArrayList();
        //this.refPoste = refposte;
        //this.dPoste = dposte;
    }
    
    public Poste(){
        super();
        this.listMachine = new ArrayList();
    }

    /*public String getRefPoste() {
        return refPoste;
    }

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }*/

    public ArrayList<Machine> getListMachine() {
        return listMachine;
    }

    public void setListMachine(ArrayList<Machine> listMachine) {
        this.listMachine = listMachine;
    }
    
    public void affichePoste(){
        System.out.println("Identifiant du poste : "+super.getIdEquipement());
        System.out.println("Description : "+super.getdEquipement());
        System.out.println("Ce poste contient les machines suivantes : "+this.listMachine);
    }
    
    public void modifierPoste(Machine machine, boolean ajouter) {
        if (ajouter==true) {
            this.ajouterMachine(machine);
        } else {
            this.supprimerMachine(machine);
        }
    }
    
    public void ajouterMachine(Machine machine) {
        if (machine != null && listMachine.contains(machine)!=true) {
            listMachine.add(machine);
            System.out.println("Machine ajoutée avec succès.");
        } else {
            System.out.println("La machine est déjà présente ou invalide.");
        }
    }
    
    public void supprimerMachine(Machine machine) {
        if (listMachine.contains(machine)) {
            listMachine.remove(machine);
            System.out.println("Machine supprimée avec succès.");
        } else {
            System.out.println("La machine n'est pas présente dans la liste.");
        }
    }
    
}
