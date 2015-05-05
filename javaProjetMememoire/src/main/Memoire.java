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
public class Memoire {
    
    protected Integer annee;
    
    public Memoire(Integer annee){
        this.annee = annee;
    }
    
    public Integer getAnnee(){ return annee; }
    public void setAnnee(Integer annee){ this.annee = annee; }
    
    
    @Override
    public String toString(){
        return "Année: " + annee + "\n";
    }
}
