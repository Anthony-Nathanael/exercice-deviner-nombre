package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class Devine {

    public static void main(String[] args) {
        Random rand = new Random();
        int nombreSecret = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int essaiJoueur = 0;
        boolean trouve = false;
        System.out.println("Devinez le nombre entre 1 et 100");
        System.out.println("Entrer votre essai");
        essaiJoueur = scanner.nextInt();

        if (essaiJoueur == nombreSecret) {
            System.out.println("Bravo! Vous avez trouvé!");
        } else if (essaiJoueur < nombreSecret) {
            System.out.println("Perdu! C'était " + nombreSecret + ". Il vous manquait:" + (nombreSecret - essaiJoueur));
        } else {
            System.out.println("Perdu! C'était " + nombreSecret + ". Vous avez dépassé de:" + (essaiJoueur - nombreSecret));
            scanner.close();
        }

    }

}
