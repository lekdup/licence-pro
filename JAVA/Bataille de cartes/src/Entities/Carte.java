package Entities;

public class Carte {
    private int valeur;
    private String couleur;

    //int nombreCarte = valeur.length * couleur.length;
    // constructor that will buil a full deck of cards
    public Carte(String couleur, int valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
    //create getters for suits and ranks
    public String getCouleur() {
        return couleur;
    }

    public int getValeur() {
        return valeur;
    }

    //create setters for suits and ranks
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    //create comparator
}
