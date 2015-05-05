/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;


/**
 *
 * @author Lionel CONTOZ
 */
public class Rapport {
  
    protected String nom;
    protected Date date;
    
    public Rapport(String nom, Date date){
        this.nom = nom;
        this.date = date;
    }
    
    public String getNom(){ return nom; }
    public void setNom(String nom){ this.nom = nom; }
    public Date getDate(){ return date; }
    public void setDate(Date date){ this.date = date; }
    
    @Override
    public String toString(){
        return "Nom: " + nom + "\n" +
                "Date: " + date + "\n";
    }
}
