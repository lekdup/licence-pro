package Run;

import Entities.Carte;
import Entities.Joueur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bataille {
    public static void main(String[] args) {
        ArrayList<Carte> jeuDeCarte = new ArrayList<>();

        // étape 1 : je créé le paquet de carte
        for (String couleur : Carte.COULEUR) {
            for (String valeur : Carte.VALEUR) {
                Carte carte = new Carte(valeur, couleur);
                jeuDeCarte.add(carte);
            }
        }

        // étape 2 : je mélange la carte avec Collections
        Collections.shuffle(jeuDeCarte);

        // étape 3 : je crée les 2 joueurs
        Joueur joueur1 = new Joueur("Messi");
        Joueur joueur2 = new Joueur("Ronaldo");

        // étape 4 : je distribus le jeu carte mélangé
        for (int i=0; i<jeuDeCarte.size(); i++) {
            // les paire distribuées à joueur1
            if (i % 2 == 0) {
                joueur1.ajouterCarte(jeuDeCarte.get(i));
            // les impairs distribuées à joueur2
            } else {
                joueur2.ajouterCarte(jeuDeCarte.get(i));
            }
        }

        // ETAPE 5 : la partie commence, tant qu'il reste des cartes à au moins un joueur (boucle), on a :
        ArrayList<Carte> cartesRemporteesJoueur1 = new ArrayList<Carte>();
        ArrayList<Carte> cartesRemporteesJoueur2 = new ArrayList<Carte>();

        //  1. chaque joueur tire et joue une carte
        while (!joueur1.getPaquet().isEmpty() || !joueur2.getPaquet().isEmpty()) {
            Carte carteJoueur1 = joueur1.tirerCarte();
            Carte carteJoueur2 = joueur2.tirerCarte();

            System.out.println(joueur1.getNom() + " joue " + carteJoueur1.getValeur() + " de " + carteJoueur1.getCouleur());
            System.out.println(joueur2.getNom() + " joue " + carteJoueur2.getValeur() + " de " + carteJoueur2.getCouleur());
            //  2. on compare les 2 cartes c1 et c2 (on doit avoir une méthode public compare(Carte c) dans la classe Carte
            int resultatComparaison = carteJoueur1.compare(carteJoueur2);
            System.out.println("Le résultat de la comparaison est : " + resultatComparaison);
            //  3. le joueur avec la carte la plus forte remporte le pli donc on met à jour l'attribut compteur de points
            //  du joueur qui récupère les cartes
            if (resultatComparaison > 0) {
                cartesRemporteesJoueur1.add(carteJoueur1);
                cartesRemporteesJoueur1.add(carteJoueur2);
                System.out.println(joueur1.getNom() + " remporte le pli et gagne 2 cartes.");

                joueur1.setScore(joueur1.getScore() + 1);
            } else if (resultatComparaison < 0) {
                cartesRemporteesJoueur2.add(carteJoueur1);
                cartesRemporteesJoueur2.add(carteJoueur2);
                System.out.println(joueur2.getNom() + " remporte le pli et gagne 2 cartes.");

                joueur2.setScore(joueur2.getScore() + 1);
            } else {
                System.out.println("Egalité !");
            }
        }
        joueur1.getPaquet().addAll(cartesRemporteesJoueur1);
        joueur2.getPaquet().addAll(cartesRemporteesJoueur2);

        //cartesRemporteesJoueur1.clear();
        //cartesRemporteesJoueur2.clear();

        System.out.println("Nombre de cartes restantes pour " + joueur1.getNom() + " : " + joueur1.getPaquet().size());
        System.out.println("Nombre de cartes restantes pour " + joueur2.getNom() + " : " + joueur2.getPaquet().size());


        // ETAPE 6 : la boucle s'est terminée car on est arrivé à la condition d'arrêt et on affiche
        // le vainqueur de la partie avec son nombre de point
        // indice : il faut réimplémenter la méthode toString() dans la classe Joueur
    }

}
