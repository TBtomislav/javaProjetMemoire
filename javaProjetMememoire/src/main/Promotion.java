package main;

/**
 * @author Thomas BERRIAU & Lionel CONTOZ
 */
public class Promotion {
    //Variables 
    protected String nom;
    protected String secteur;
    protected int annee;
    
    //Corps
    public Promotion(String nom, String secteur, int annee){
        this.nom = nom;
        this.secteur = secteur;
        this.annee = annee;
    }
    
    //Accesseurs
    public String getNom(){ return nom; }
    public void setNom(String nom){ this.nom = nom; }
    public String getSecteur(){ return secteur; }
    public void setSecteur(String secteur){ this.secteur = secteur; }
    public int getAnnee(){ return annee; }
    public void setAnnee(int annee){ this.annee = annee; }
    
    @Override
    public String toString(){
        return "Nom: " + nom + "\n" +
                "Secteur: " + secteur + "\n" + 
                "Année: " + annee + "\n";
    }
}
