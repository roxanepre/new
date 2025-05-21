
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/**
 *
 * @author mpommier01
 */
public class Personnel {
    public String idPersonne;
    private String Nom;
    private String Prenom;
    public String password;
    public String id_chef = "r0x64i5d";
    public String pwd_chef = "atelier67";
    public ArrayList liste_personnel;
    public LinkedHashMap<String,String> liste_mdp;

    public Personnel(String idPersonne, String Nom, String Prenom, String pwd){
        this.idPersonne =idPersonne;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.password = pwd;
        this.liste_mdp = new LinkedHashMap();
        this.liste_personnel = new ArrayList();
        this.liste_mdp.put(this.id_chef,this.pwd_chef);
        this.liste_mdp.put(idPersonne, pwd);
        this.liste_personnel.add(this.id_chef);
        this.liste_personnel.add(idPersonne);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId_chef() {
        return id_chef;
    }

    public void setId_chef(String id_chef) {
        this.id_chef = id_chef;
    }

    public String getPwd_chef() {
        return pwd_chef;
    }

    public void setPwd_chef(String pwd_chef) {
        this.pwd_chef = pwd_chef;
    }

    public ArrayList getListe_personnel() {
        return liste_personnel;
    }

    public void setListe_personnel(ArrayList liste_personnel) {
        this.liste_personnel = liste_personnel;
    }

    public LinkedHashMap<String, String> getListe_mdp() {
        return liste_mdp;
    }

    public void setListe_mdp(LinkedHashMap<String, String> liste_mdp) {
        this.liste_mdp = liste_mdp;
    }
    
    
    public void fichePersonnel(){
        System.out.println("Identifiant : "+this.idPersonne);
        System.out.println("Nom : "+this.Nom);
        System.out.println("Prenom : "+this.Prenom);
    }
}
