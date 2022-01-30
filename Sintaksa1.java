//Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
// tako sto se ivice prostorije ucitavaju preko konzole.
// (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).

package Domaci3011;

import java.util.Scanner;

public class Sintaksa1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite duzinu prostorije u metrima ");
        double duzinaProstorije = s.nextDouble();
        System.out.print("Unesite sirinu prstorije u metrima ");
        double sirinaProstorije = s.nextDouble();
        System.out.print("Unesite visinu prostorije u metrima ");
        double visinaProstorije = s.nextDouble();
        double povrsinaProstorije = 2 * (duzinaProstorije * visinaProstorije) + 2 * (sirinaProstorije * visinaProstorije) + (duzinaProstorije * visinaProstorije);

        System.out.print("Povrsina okrecenog dela prostorije je " + povrsinaProstorije + " m2");




    }

}

