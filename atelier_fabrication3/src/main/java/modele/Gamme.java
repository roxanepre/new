/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;
import java.util.ArrayList;
import java.util.LinkedHashMap;
//import java.util.Scanner;
/**
 *
 * @author mpommier01
 */
public class Gamme {
    public int i;
    private int ask_op;
    private Operation enter_op;
    /*private Equipement enter_equip;
    mis en commentaire pour la raison ci-dessous
    */
    private Machine enter_machine;
    private float c_machine;
    private float cout_gamme;
    private float d_op;
    private float duree_gamme;
    private String idGamme;
    private String refGamme;
   /* private ArrayList<Equipement> listEquipement;
    Je pense qu'il n'est pas nécessaire de faire une liste d'équipement : en effet
    lorsque nous voulons calculer le cout de la gamme nous avons beosin des machines 
    et non pas des poste. Le fait d'utiliser une variable de type Equipement engendre
    de plus pas mal de complication. De plus la durée d'une opération s'applique à une 
    machine et non un poste - on ne peut pas récupérer le coût horaire d'un poste, il
    il n'existe pas - alors nous pouvons garder la liste Equipement à titre informatif
    mais du point de vue des méthodes elle n'est pas nécessaire, donc tout ce qui 
    concerne la lite d'equipements est mis en commentaire*/
    private ArrayList<Machine> listMachine;
    private ArrayList<Operation> listOp;
    /* on part du postulat que nous n'avons ni deux fois la même opération ni deux fois la même liste*/
    private LinkedHashMap<Operation,Machine> gamme_op;
    /*j'utilise une linkedHashMap pour garantir que l'odre de parcours est l'odre d'insertion
    On part aussi du postulat q'un produit ne peut subir q'une seule fois sune opération*/

   // Scanner scanner_op = new Scanner(System.in); tests pour lire une varaible de la classe operation
    //Scanner scanner_equipement = new Scanner(System.in); tests pour lire une varaible de la classe equipement
    public Gamme (String idGamme, String refGamme){
        this.idGamme = idGamme;
        this.refGamme = refGamme;
        /*this.listEquipement= new ArrayList(); en commentaire pour la raison qui précède*/
        this.listOp = new ArrayList();
        this.gamme_op = new LinkedHashMap();
        this.listMachine = new ArrayList();
        this.cout_gamme=0;
        this.duree_gamme=0;
        System.out.println("La nouvelle gamme a été créée avec succès !");
    }
    
    public String getIdGamme() {
        return idGamme;
    }

    public void setIdGamme(String idGamme) {
        this.idGamme = idGamme;
    }

    public String getRefGamme() {
        return refGamme;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    /*public ArrayList<Equipement> getListEquipement() {
        return listEquipement;
    }

    public void setListEquipement(ArrayList<Equipement> listEquipement) {
        this.listEquipement = listEquipement;
    }
    J'ai mis cette partie de code en commentaire pour la raison qui précède*/

    public ArrayList<Operation> getListOp() {
        return listOp;
    }

    public void setListOp(ArrayList<Operation> listOp) {
        this.listOp = listOp;
    }

    public LinkedHashMap<Operation, Machine> getGamme_op() {
        return gamme_op;
    }

    public void setGamme_op(LinkedHashMap<Operation, Machine> gamme_op) {
        this.gamme_op = gamme_op;
    }

    public float getCout_gamme() {
        return cout_gamme;
    }

    public void setCout_gamme(float cout_gamme) {
        this.cout_gamme = cout_gamme;
    }

    public float getDuree_gamme() {
        return duree_gamme;
    }

    public void setDuree_gamme(float duree_gamme) {
        this.duree_gamme = duree_gamme;
    }

    public ArrayList<Machine> getListMachine() {
        return listMachine;
    }

    public void setListMachine(ArrayList<Machine> listMachine) {
        this.listMachine = listMachine;
    }
    
    
    public void creerGamme(Produit prod){
        String idOperation;
        String dOperation;
        float dureeOp;
        String refEquipement;
        System.out.println("Vous allez pouvoir créer une nouvelle gamme pour la fabrication de :"+prod);
        while (ask_op!=0){
            System.out.println("Entrez 1 ou entrez 0 si vous n'avez plus d'opération à ajouter :");
            ask_op = Lire.i();
            if (ask_op !=0){
                System.out.println("Entrez l'identifiant de l'opération que vous souhaitez ajouter à votre gamme :");
                idOperation = Lire.S();// en gros je sépare les trois attributs d'un élmt de opération
                System.out.println("Entrez la désignation de l'opération que vous souhaitez ajouter à votre gamme :");
                dOperation = Lire.S();
                System.out.println("Entrez la durée de l'opération que vous souhaitez ajouter à votre gamme :");
                dureeOp = Lire.f();
                this.listOp.add(enter_op);
                System.out.println("Entrez la machine dont vous avez besoin pour réaliser cette opération : ");
               // enter_machine= Lire.Machine();// problème : lire une variable de type Machine
                this.listMachine.add(enter_machine);
                this.gamme_op.put(enter_op,enter_machine);
           
                /*System.out.println("Entrez l'équipement que vous utiliserez pour cette opération :");
                enter_equip = Lire.Equipement();//probleme lire une variable de type Equipement 
                this.listEquipement.add(enter_equip);
                J'ai mis en commentaire cette partie là en raison de l'explication précédente*/
            }
        }   
    }
    
    public void afficheGamme(){
        System.out.println("La référence de la gamme est : "+this.refGamme);
        System.out.println("Le code d'identification de cette gamme est : "+this.idGamme);
        System.out.println("Pour réaliser cette gamme les machines suivantes sont utilisées : "+this.listMachine);
        /*System.out.println("Pour réaliser cette gamme les équipements suivant sont utilisés : "+this.getListEquipement());
        en commentaire pour lees raisons précédentes*/
    }
    
    public void ajouterOp (Operation op){
        if (op!=null && this.listOp.contains(op)!=true){
            this.listOp.add(op);
        }
    }
    public void ajouterMachine(Machine machine){
        if (machine!=null && this.listMachine.contains(machine)!=true){
            this.listMachine.add(machine);
        }
    }
            
    public void modifierGamme(Machine machine, Operation op,boolean operation, boolean machine1){
        if (operation==true){
            ajouterOp(op);
        }
        if (machine1==true){
            ajouterMachine(machine);
        }
    }  
    public void supprimerGamme(){
       // même problème que pour supprimerMachine() dans la classe machine et que supprimerPoste() dans la classe poste
    }
    
    public float dureeGamme(){ //  c'est la somme de toutes les durées d'opération
        this.duree_gamme=0;
        d_op=0;
        for (i=0; i<=this.listOp.size();i++){
            d_op = this.listOp.get(i).getDureeOperation();
            this.duree_gamme=d_op+this.duree_gamme;   
        }
        return this.duree_gamme;
    }
    
    public float cout_gamme(){
        d_op=0;
        c_machine=0;
        for(i=0;i<=this.gamme_op.size();i++){
            d_op = this.listOp.get(i).getDureeOperation();
            c_machine=this.gamme_op.get(this.listOp.get(i)).getC();
            cout_gamme = cout_gamme+c_machine*d_op;
        }
        return this.cout_gamme;
    }
}
    
/*Classe Gamme de fabrication définie par: - une référence refGamme, (String) - une liste d’opérations nécessaires listeOperations - une liste d’équipements nécessaires listeEquipements, (machines ou 
postes).  - les méthodes de gestion de gammes suivantes : 
o creerGamme () ; 
o modifierGamme() ; 
o supprimerGamme() ; 
o afficheGamme() : permet d’afficher la liste des équipements de 
travail utilisés pour réaliser une gamme de fabrication; - Les méthodes de calcul suivantes : 
o coutGamme(), (retourne le coût d’une gamme donnée (float)  
o dureeGamme (), (calcule la durée d’exécution d’une gamme (float).*/
    
 /* gamme = agrégation d'operation : d'une liste d'opértions, arraylist (chaque opération a un nom)
    et liste de machine m1, m2 ect... chacune associée à une durée, et uun coup horaire
    chaque opération est produite sur une machine
    Manière dont le produit est fabriqué
    */
