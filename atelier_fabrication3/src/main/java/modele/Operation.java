/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author mpommier01
 */
public class Operation {
    private String idOperation;
    private String dOperation;
    /*private String refMachine; je pense que ce n'est pas utile pusiqu'une operation peut être réalisée sur 
    plusieurs machines différentes d'après le diagramme UML*/
    private float dureeOperation;

    public Operation (String idOperation, String dOperation, float dureeOp){
        this.idOperation = idOperation;
        this.dOperation = dOperation;
        //this.refMachine = refMachine; pour les raisons précédentes
        this.dureeOperation = dureeOp;
    }
    
    public Operation(){
        this.idOperation = "";
        this.dOperation = "";
        //this.refMachine = refMachine; pour les raisons précédentes
        this.dureeOperation = 0;
    }
    
    public String getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(String idOperation) {
        this.idOperation = idOperation;
    }

    /*public String getRefMachine() {
        return refMachine;
    }

    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }
    pour les raisons précédentes : mis en commentaire*/

    public float getDureeOperation() {
        return dureeOperation;
    }

    public void setDureeOperation(float dureeOperation) {
        this.dureeOperation = dureeOperation;
    }

    public String getdOperation() {
        return dOperation;
    }

    public void setdOperation(String dOperation) {
        this.dOperation = dOperation;
    }
    
    public void afficheOperation(){
        System.out.println("Identifiant de l'opération : "+this.idOperation);
        System.out.println("Description : "+this.dOperation);
        System.out.println("Cette opération a une duree de : "+this.dureeOperation);
    }
}