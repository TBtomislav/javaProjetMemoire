/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.io.Serializable;
import java.util.regex.*;

/**
 *
 * @author Lionel CONTOZ
 */
public abstract class Personne implements Comparable<Personne>, Serializable {
    
    // variables
    protected String nom;
    protected String prenom;
    protected String mail; 
    //retour chariot
    String Newligne=System.getProperty("line.separator"); 
    
    // corps 
    public Personne(String nom,String prenom,String mail){
                
        if(isEmailAdress(mail)) {
            
           
            System.out.println("Email valide");
            this.mail=mail;

        }else{
            System.out.println("Email éronné");
        }
    
        if(isNameSurname(nom)) {
            System.out.println("Nom valide");
            this.nom=nom;

        }else{
            System.out.println("Nom éronné");
        }
        
        if(isNameSurname(prenom)) {
            System.out.println("Prenom valide");
            this.prenom=prenom;

        }else{
            System.out.println("Prenom éronné");
        }
        
    }
    
    //gets
    
    public String getNom(){
        return this.nom;      
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    @Override
    public String toString(){
        return "Prénom: " + prenom + "\n" +
                "Nom: " + nom + "\n" + 
                "Mail: " + mail + "\n";
    }
    
    public boolean isEmailAdress(String email){
        Pattern p=Pattern.compile("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
        
        Matcher m=p.matcher(email);
        
        
        return m.matches();
    }

    public static boolean isNameSurname(String name){
        Pattern p = Pattern.compile("^[A-Z]*");
        Matcher m = p.matcher(name.toUpperCase());
        return m.matches();
    }
    
    
    //tri
    
    @Override
    public boolean equals(Object e){
        return (nom.equals(((Personne)e).getNom()));
    }
    
    @Override
    public int compareTo(Personne p){
		return (nom.compareTo(p.getNom()));
	}
    
}

