
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author mpommier01
 */
public class Personnel {
    private String idPersonne;
    private String Nom;
    private String Prenom;

    public Personnel(String idPersonne, String Nom, String Prenom){
        this.idPersonne =idPersonne;
        this.Nom = Nom;
        this.Prenom = Prenom;
    }
    
    public Personnel (String idPersonne){
        this.idPersonne=idPersonne;
        this.Nom="";
        this.Prenom="";
    }
    public String getIdPersonne() {
        return idPersonne;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setIdPersonne(String idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    
    public void fichePersonnel(){
        System.out.println("Identifiant : "+this.idPersonne);
        System.out.println("Nom : "+this.Nom);
        System.out.println("Prenom : "+this.Prenom);
    }
}
