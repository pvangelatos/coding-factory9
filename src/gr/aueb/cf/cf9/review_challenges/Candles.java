package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

public class Candles {

    /**
     * Δίνεται ένας πίνακας με τα ύψη κεριών (π.χ., [3, 2, 3, 1]).
     * Μετρήστε πόσα κεριά έχουν το μέγιστο ύψος.
     *
     * Παράδειγμα:
     *
     * Είσοδος: [4, 4, 1, 3]
     * Έξοδος: 2 (το μέγιστο ύψος είναι 4 και υπάρχουν 2 κεριά με αυτό το ύψος).
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, };
        System.out.println(candlesCount(arr));
        System.out.println();
        System.out.println(candlesCount2(arr));
        System.out.println();


    }

    public static int candlesCount(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int height : arr) {
            if (height > max) {
                max = height;
                count = 1;
            } else if (height == max) {
                count ++;
            }
        }
        return count;
    }

    public static long candlesCount2(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        return Arrays.stream(arr).filter(c -> c == max).count();
    }

}
