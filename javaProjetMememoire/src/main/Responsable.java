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
public class Responsable extends Personne{
    String entreprise;
    
    public Responsable(String nom,String prenom,String mail,String entrepise){
        super(nom,prenom,mail);
        this.entreprise=entreprise;
    }
    
    public String getEntrprise(){
        return this.entreprise;
    }
}
