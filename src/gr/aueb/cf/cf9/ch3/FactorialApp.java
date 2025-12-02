package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates factorial of a number.
 * For instance n! = 1 * 2 * 3 * ... * n
 * For instance 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class FactorialApp {
    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 1;
        int i = 1;

        //Είσοδος Δεδομένων
        System.out.println("Παρακαλούμε εισάγετε έναν αριθμό: ");
        num = scanner.nextInt();

        //Επεξεργασία
        while ( i <= num){
            factorial *= i;
            i++;
        }

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d! = %d\n", num, factorial);

    }
}
