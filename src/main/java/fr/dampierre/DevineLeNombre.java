package fr.dampierre;

import java.util.Random;
import java.util.Scanner;


public class DevineLeNombre{
    public static void main(String[] args) {
        Random random= new Random();
        int nombreAdeviner= random.nextInt(100) +1;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel");
        System.out.println("Entrer un nombre:");
        int proposition= scanner.nextInt();
        // modification bidon
        System.out.println("Vous proposez:" + proposition);
        System.out.println("Le nombre auquel je pensais était:"+ nombreAdeviner);
        int ecart= Math.abs(nombreAdeviner-proposition);
        System.out.println("Vous étiez à" + ecart+ "de la bonne réponse");
        scanner.close();
    }
}