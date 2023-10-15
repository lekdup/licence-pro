package Entities;

public class Carte {
    String[] couleur = {"COEUR", "CARREAUX", "TRÈFLE", "PIQUE"};
    String[] valeur = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "V", "D", "R", "A"};
    String[] paquet = new String[52];

    // create the deck of cards


    //int nombreCarte = valeur.length * couleur.length;
    // constructor that will buil a full deck of cards

    public Carte() {
        for (int i = 0; i < paquet.length; i++) {
            paquet[i] = valeur[i%13] + " " + couleur[i/13];
            System.out.println(paquet[i]);
        }
    }
    //create getters for suits and ranks
    /*
    public String getCouleur() {
        return couleur;
    }

    //public int getValeur() {
        return valeur;
    }

    //create setters for suits and ranks
    //public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    //public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    //create comparator
                */
}
