package gr.aueb.cf.cf9.review_challenges;

public class SumsOfAnArray {

    public static void sums(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int n : arr) {
            sum += n;
            if (n > max) max = n;
            if (n < min) min = n;
            }

        int minSum = sum - max;
        int maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
        }

}
