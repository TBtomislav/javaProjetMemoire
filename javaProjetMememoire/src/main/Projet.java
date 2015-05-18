package main;

/**
 * @author Thomas BERRIAU & Lionel CONTOZ
 */
public class Projet {
    //Variables
    protected String sujet;
    protected float note;
    
    //Corps
    public Projet(String sujet, float note){
        this.sujet = sujet;
        this.note = note;
    }
    
    //Accesseurs
    public String getSujet(){ return sujet; }
    public void setSujet(String sujet){ this.sujet = sujet; }
    public float getNote(){ return note; }
    public void setNote(float note){ this.note = note;}
    
    @Override
    public String toString(){
        return "Sujet: " + sujet + "\n" +
                "Note du projet: " + note + "\n";
    }
}
