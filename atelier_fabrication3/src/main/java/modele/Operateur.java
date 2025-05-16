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
public class Operateur extends Personnel {
    private int dispo;
    private ArrayList<Machine> competences_machine;

    public Operateur(String idOperateur, String Nom_operateur, String Prenom_operateur, int dispo) {
        super(idOperateur,Nom_operateur,Prenom_operateur);
        this.dispo = dispo;
        this.competences_machine = new ArrayList();
    }

    public Operateur (String idOperateur, String Nom_operateur, String prenomOperateur){
        super(idOperateur,Nom_operateur,prenomOperateur);
        this.dispo=0;
        this.competences_machine = new ArrayList();
    }
    
    public int getDispo() {
        return dispo;
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public ArrayList<Machine> getCompetences_machine() {
        return competences_machine;
    }

    public void setCompetences_machine(ArrayList<Machine> competences_machine) {
        this.competences_machine = competences_machine;
    }
    
    public void ficheOp(){
        super.fichePersonnel();
        System.out.println("Cet opérateur est capable de gerer les machines suivantes : "+this.competences_machine);
    }
}
