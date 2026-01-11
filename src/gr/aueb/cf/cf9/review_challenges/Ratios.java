package gr.aueb.cf.cf9.review_challenges;

import java.math.BigDecimal;

public class Ratios {

    public static void ratios (int[] arr) {
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;

        for (int num : arr) {
            if (num > 0) {
                countPos++;
            } else if (num < 0) {
                countNeg++;
            } else countZero++;
        }

        double posFreq = (double) countPos / arr.length;
        double negFreq = (double) countNeg / arr.length;
        double zeroFreq = (double) countZero / arr.length;

        System.out.printf("%.6f\n", posFreq);
        System.out.printf("%.6f\n", negFreq);
        System.out.printf("%.6f\n", zeroFreq);
    }
}
