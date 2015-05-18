package main;

/**
 * @author Thomas BERRIAU & Lionel CONTOZ
 */
public abstract class Memoire extends Document{
    
    //Variables
    protected int annee;
    
    //Corps
    public Memoire(String nom, String type, double taille, int annee){
        super(nom, type, taille);
        this.annee = annee;
    }
    
    //Accesseurs
    public int getAnnee(){ return annee; }
    public void setAnnee(int annee){ this.annee = annee; }
    
    @Override
    public String toString(){
        return "Année: " + annee + "\n";
    }
}
