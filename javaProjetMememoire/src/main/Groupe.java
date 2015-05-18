package main;

/*
 * @author Thomas BERRIAU & Lionel CONTOZ
 */
public class Groupe {
    //Variables
    protected int identifiant;
    
    //Corps
    public Groupe(int identifiant){
        this.identifiant = identifiant;
    }
    
    //Accesseurs
    public int getIdentifiant(){ return identifiant;}
    public void setIdentifiant(int identifiant){ this.identifiant = identifiant; }
    
    @Override
    public String toString(){
        return "Groupe numéro: " + identifiant + "\n";
    }
}
