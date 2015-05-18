package main;

/**
 * @author Thomas BERRIAU & Lionel CONTOZ
 */
public abstract class Document implements Comparable<Document>{
    //Variables
    protected String nom;
    protected String type;
    protected double taille;
    
    //Corps
    public Document(String nom, String type, double taille){
        this.nom = nom;
        this.type = type;
        this.taille = taille;
    }
    
    //Accesseurs
    public String getNom(){return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getType(){return type;}
    public void setType(String type) {this.type = type;}
    public double getTaille(){return taille;}
    public void setTaille(double taille) {this.taille = taille;}
    
    @Override
    public String toString(){
        return "Nom: " + nom + "\n" +
                "Type: " + type + "\n" + 
                "Taille: " + taille + "\n";
    }
}
