package Entities;

import java.util.ArrayList;

public class Joueur {
    private String nom;
    private ArrayList<Carte> paquet = new ArrayList<>();
    double score;

    public Joueur(String nom) {
        this.nom = nom;
        this.paquet = new ArrayList<>();
        this.score = 0;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Carte> getPaquet() {
        return paquet;
    }

    public double getScore() {
        return score;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPaquet(ArrayList<Carte> paquet) {
        this.paquet = paquet;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Carte tirerCarte() {
        Carte carte = paquet.get(0);
        paquet.remove(0);
        return carte;
    }

    /*public int getNombreCartes() {
        return paquet.size();
    }*/
    public void ajouterCarte(Carte c) {
        paquet.add(c);
    }

    @Override
    public String toString() {
        return nom + " a " + score + " points";
    }
}
