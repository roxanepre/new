/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;
import java.util.List;
import view.IdentificationView;


/**
 *
 * @author User
 */
public class Personnels {
    // dans cette class tout est déclré en static, ça veut dire on a accès
    //directement aux élément de le nom de la class sans créer d'objet ( d'instance)
    //par exemple pour avoir acccès à la variable users, n écrira depuis n'importe quelle class
    //Users.getUsers() et cela nous renverra la liste des utilisateurs
    private static List<Personnel> personnels= new ArrayList<>();//création de la liste de User
    public static List<Personnel> getPersonnels(){//getter 
        return personnels;
    }
    
     public static void addPersonnel(Personnel personnel) {//ajout d'un User qui est définie dans la class User
         personnels.add(personnel);
    }
     
     static{//dans une methode déclarée en static, normalement pas de constructeur
         //puisqu'on ne veut pas d'object
         // si on veut initialiser ou faire qqc à l'criture on utilise cette etchnique avec static
         //ici on met direct deux User dans la liste pour qu'elle ne soitpas vide
         // et qu'on puisse faire des tests
         // on utilise la méthode addUsers définie avant et on leui pas un utilisateur
         // créer avec new User , on oublie pas de fournir tous ses paramètres
        //Personnels.addPersonnel(new Personnel("mathilde","fofo","boss","Pommier","Mathilde","etudiante"));
        //Personnels.addPersonnel(new Personnel("clara","fofo","op","Pommier","Clara","etudiante"));
    }
     
     public static void supprimer(String nom, String prenom, String identifiant){
         //supprimer prend en paramtre deux String qui correspond au nom et prenom
         //de la personne qu'on veut supprimer, puis parcours la liste d'utilisateur
         //si le nom et le prenom matche avec un utilisateur
         //on le retire de la liste avec remove qui est une methode commune aux listes
         for (Personnel p : personnels) {
            if (p.getNom().equals(nom) &&
                p.getPrenom().equals(prenom) && p.getIdentifiant().equals(identifiant)) {
                personnels.remove(p);
            }
         }
     }
     
     public static Personnel verifierConnexion(String identifiant, String motDePasse) {
         // ici c'est une methode pour vérifier qu'un identifiant et un mot depasse correspondent
         //si ca matche, on rnvoie l'utilisateur concerné
         // on en a besoin au moment de la connexion
        for (Personnel p : personnels) {
            if (p.getRecup_identifiant().equals(identifiant) &&
                p.getRecup_pwd().equals(motDePasse)) {
                return p; //  connexion réussie
            }
        }
        return null; // si ca ne matche pas on renvoie null
    }
     

     
     public static Personnel verifierNomPrenom(String nom, String prenom) {
         // une methode pour verifier qu'un nom et un  prenom font bien partis de la liste
        for (Personnel p : personnels) {
            if (p.getNom().equals(nom) &&
                p.getPrenom().equals(prenom)) {
                return p; // ✅ connexion réussie
            }
        }
        return null; // ❌ identifiants incorrects
     }
}
     
    
