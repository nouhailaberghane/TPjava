public class Moteur{
    private String nom ;
    private int puissance;
    private final double dureDEvie = 300000;

    
    public Moteur(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getPuissance() {
        return puissance;
    }
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

}