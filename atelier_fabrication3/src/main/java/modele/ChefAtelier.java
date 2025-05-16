/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author mpommier01
 */
public class ChefAtelier extends Personnel {
    private String nom_atelier;
    private int nb_employe;

    public ChefAtelier(String idChef_atelier, String Nom_chef_atelier, String Prenom_chef_atelier, String nom_atelier){
        super(idChef_atelier,Nom_chef_atelier,Prenom_chef_atelier);
        this.nom_atelier=nom_atelier;
    }
    
    public ChefAtelier(String idChef_atelier, String Nom_chef_atelier, String Prenom_chef_atelier){
        super(idChef_atelier,Nom_chef_atelier,Prenom_chef_atelier);
    }
    public String getNom_atelier() {
        return nom_atelier;
    }

    public void setNom_atelier(String nom_atelier) {
        this.nom_atelier = nom_atelier;
    }

    public int getNb_employe() {
        return nb_employe;
    }

    public void setNb_employe(int nb_employe) {
        this.nb_employe = nb_employe;
    }
    
    public void ficheChef(){
        System.out.println("Chef de l'atelier "+this.nom_atelier);
        super.fichePersonnel();
        System.out.println("nombre d'employes : "+this.nb_employe);
    }
}
