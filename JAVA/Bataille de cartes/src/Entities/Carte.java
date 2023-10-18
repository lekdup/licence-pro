package Entities;

public class Carte {
    protected String couleur;
    protected String valeur;

    public static final String[] COULEUR = {"Carreau", "Cœur", "Pique", "Trèfle"};
    public static final String[] VALEUR = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "V", "D", "R", "A"};

    public Carte(String valeur, String couleur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }

    //create getters for suits and ranks
    public String getCouleur() {return couleur;}
    public String getValeur() {return valeur;}

    //setters
    public void setCouleur(String couleur) {this.couleur = couleur;}
    public void setValeur(String valeur) {this.valeur = valeur;}

    //comparator
    public int compare(Carte c) {
        int valeur1 = 0;
        int valeur2 = 0;
        for (int i=0; i<VALEUR.length; i++) {
            if (this.valeur.equals(VALEUR[i])) {
                valeur1 = i;
            }
            if (c.valeur.equals(VALEUR[i])) {
                valeur2 = i;
            }
        }
        if (valeur1 > valeur2) {
            return 1;
        } else if (valeur1 < valeur2) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String s = valeur + " de " + couleur;
        return s;
    }
}
