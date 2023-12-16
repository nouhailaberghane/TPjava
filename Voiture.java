public class Voiture {
    private String modele;
    private String marque ;
    private Double vetesse;
    private boolean estdémarre;
    public Moteur moteur;

    public Voiture(String modele, String marque, Double vetesse, boolean estdémarre, Moteur moteur) {
        this.modele = modele;
        this.marque = marque;
        this.vetesse = vetesse;
        this.estdémarre = estdémarre;
        this.moteur = moteur;
    }
    public double deQuellePuissance() {
        return moteur.getPuissance();
    }

    public void changerLeMoteur(Moteur nvMoteur) {
        moteur = nvMoteur;
    }

    public int dequellepuissance(){
        return moteur.getPuissance();
    }
    public void démarre(){
        this.estdémarre=true;

    }
    public void accélère(float x){
        this.vetesse += x;

    }

    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public Double getVetesse() {
        return vetesse;
    }
    public void setVetesse(Double vetesse) {
        this.vetesse = vetesse;
    }

    public void setEstdémarre(boolean estdémarre) {
        this.estdémarre = estdémarre;
    }
      
    public boolean isEstdémarre() {
        return estdémarre;
    }
}
