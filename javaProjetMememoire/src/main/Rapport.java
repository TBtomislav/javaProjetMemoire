package main;
import java.util.*;

/**
 * @author Thomas BERRIAU & Lionel CONTOZ
 */
public abstract class Rapport extends Document{
    //Variables
    protected String sujet;
    protected Date date;
    
    //Corps
    public Rapport(String nom, String type, double taille, String sujet, Date date){
        super(nom, type, taille);
        this.sujet = sujet;
        this.date = date;
    }
    
    //Accesseurs
    public String getSujet(){ return sujet; }
    public void setSujet(String sujet){ this.sujet = sujet; }
    public Date getDate(){ return date; }
    public void setDate(Date date){ this.date = date; }
    
    @Override
    public String toString(){
        return "Nom: " + nom + "\n" +
                "Date: " + date + "\n";
    }
}
