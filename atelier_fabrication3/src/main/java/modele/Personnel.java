
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
    public static String id_chef = "r0x64i5d";
    public String pwd_chef = "atelier67";
    public static ArrayList liste_personnel;
    public static LinkedHashMap<String,String> liste_mdp;

    public Personnel(String idPersonne, String Nom, String Prenom, String pwd){
        this.idPersonne =idPersonne;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.password = pwd;
        Personnel.liste_mdp = new LinkedHashMap();
        Personnel.liste_personnel = new ArrayList();
        Personnel.liste_mdp.put(Personnel.id_chef,pwd_chef);
        Personnel.liste_mdp.put(idPersonne, pwd);
        Personnel.liste_personnel.add(Personnel.id_chef);
        Personnel.liste_personnel.add(idPersonne);
    }
    
    public Personnel (){
        this.idPersonne="";
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

    public static String getId_chef() {
        return id_chef;
    }

    public void setId_chef(String id_chef) {
        Personnel.id_chef = id_chef;
    }

    public String getPwd_chef() {
        return pwd_chef;
    }

    public void setPwd_chef(String pwd_chef) {
        this.pwd_chef = pwd_chef;
    }

    public static ArrayList getListe_personnel() {
        return liste_personnel;
    }

    public void setListe_personnel(ArrayList liste_personnel) {
        Personnel.liste_personnel = liste_personnel;
    }

    public static LinkedHashMap<String, String> getListe_mdp() {
        return liste_mdp;
    }

    public void setListe_mdp(LinkedHashMap<String, String> liste_mdp) {
        Personnel.liste_mdp = liste_mdp;
    }
    
    
    public void fichePersonnel(){
        System.out.println("Identifiant : "+this.idPersonne);
        System.out.println("Nom : "+this.Nom);
        System.out.println("Prenom : "+this.Prenom);
    }
}
