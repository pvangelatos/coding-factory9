package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class KiloToGrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int GRAMS_TO_KILOS = 1000;
        int kilos = 0;
        int grams = 0;

        System.out.println("Παρακαλώ εισάγετε τα κιλά που θέλερε να μετατραπούν σε γραμμάρια");
        kilos = scanner.nextInt();
        grams = kilos * GRAMS_TO_KILOS;

        System.out.printf("Βάρος σε κιλά: %d, Βάρος σε γραμμάρια: %,d%n", kilos, grams);
    }
}
