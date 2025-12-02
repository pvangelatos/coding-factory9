package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class HoursToMinSec {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINUTES_TO_HOUR = 60;
        final int SECONDS_TO_HOUR = 3600;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Παρακαλώ εισάγετε τις ώρες που θέλετε να μετατραπούν σε λεπτά και δευτερόλεπτα");
        hours = scanner.nextInt();
        minutes = hours * MINUTES_TO_HOUR;
        seconds = hours * SECONDS_TO_HOUR;


        System.out.printf("Ώρες: %d σε λεπτά: %,d, ώρες: %d σε δευτερόλεπτα: %,d%n", hours, minutes, hours, seconds);

    }
}
