package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

public class CompareTriplets {

    public static int[] compareTriplets(int[] a, int[] b){
        int[] points = new int[2];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) points[0]++;
            else if (a[i] < b[i]) points[1]++;

        }
        return points;
    }
}
