package gr.aueb.cf.cf9.ch2;


import java.util.Scanner;

/**
 *Λαμβάνει από τον χρήστη ένα ποσό (ακέραιος)
 * σε ευρώ και το μετατρέπει σε δολάρια ΗΠΑ
 * με βάση μία ισοτιμία. Για παράδειγμα αν ο
 * χρήστησ δώσει 100 ευρώ και η ισοτιμία είναι
 * 1 euro = 99 USA cents, τότε τα συνολικά USA
 * cents είναι 9900 και αυτό αντιστοιχέι σε 99
 * USA dollars και 0 cents.
 */
public class EuroToUsdConverter {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών

        Scanner scanner = new Scanner(System.in);
        final int CONVERSION_RATE = 99;
        int euros = 0;
        int dollars = 0;
        int cents = 0;
        int usaCents = 0;

        //Data input

        System.out.println("Δώσε το ποσό σε ευρώ που θέλεις να μετατρέψεις σε δολλάρια ΗΠΑ");
        euros = scanner.nextInt();

        //Data processing - Expressions

        cents = euros * CONVERSION_RATE;
        dollars = cents / 100;
        usaCents = cents % 100;

        //Data output

        System.out.printf("Τα %d ευρώ είναι %d δολλάρια και %d cents αμερικής%n", euros, dollars, usaCents);
    }


}
