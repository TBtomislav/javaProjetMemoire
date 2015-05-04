/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Lionel CONTOZ
 */
public class Etudiant extends Personne{
    int numEtudiant;
    
    public Etudiant(String nom,String prenom,String mail,int numE){
        super(nom,prenom,mail);
        this.numEtudiant=numE;
    }
    
    public int getNumE(){
        return this.numEtudiant;
    }
        
        
}
