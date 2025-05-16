/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author mpommier01
 */
public class Equipement {
    private String idEquipement;
    private String dEquipement;
    
    public Equipement (String idEquipement, String dEquipement){
        this.idEquipement = idEquipement ;
        this.dEquipement = dEquipement ;
    }
    
    public String getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(String idEquipement) {
        this.idEquipement = idEquipement;
    }

    public String getdEquipement() {
        return dEquipement;
    }

    public void setdEquipement(String dEquipement) {
        this.dEquipement = dEquipement;
    }
    
    public void afficherEquipement(){
        System.out.println("l'identifiant de l'équipement est "+idEquipement);
        System.out.println("l'équipement se nomme "+dEquipement);
    }
}
