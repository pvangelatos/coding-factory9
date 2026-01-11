package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;
import static gr.aueb.cf.cf9.review_challenges.CompareTriplets.compareTriplets;

public class Main {
    public static void main(String[] args) {
        int[] candles = new int[] {4, 5, 5, 7, 2};

        int[] alice = {10, 9, 15};
        int[] bob = {17, 10, 5};

        int[][] squareArr = new int[][] { {1, 2, 3},
                                          {4, 5, 6},
                                          {9, 8, 9}};

        int n = 4;

        int[] numbers = {4, 5, -8, -15, 0, 0};

        int[] numbers2 = {1, 3, 5, 7, 9};

        int[] points = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        int[] numbers3 = {12, 4, 33, 7, 18};

        System.out.println("Exercise 1 Test result:");
        System.out.println(AddTwoIntegers.Sum(4, 9));
        System.out.println();
        System.out.println("Exercise 2 Test result:");
        System.out.println(ArraysOfIntSum.SumOfAnArray(candles));
        System.out.println();
        System.out.println("Exercise 3 Test result:");
        System.out.println(Arrays.toString(compareTriplets(alice, bob)));
        System.out.println();
        System.out.println("Exercise 4 Test result:");
        System.out.println(DiagonalDiff.diagonalDiff(squareArr));
        System.out.println();
        System.out.println("Exercise 5 Test result:");
        ScaleOfHashes.scale(n);
        System.out.println();
        System.out.println("Exercise 6 Test result:");
        Ratios.ratios(numbers);
        System.out.println();
        System.out.println("Exercise 7 Test result:");
        SumsOfAnArray.sums(numbers2);
        System.out.println();
        System.out.println("Exercise 8 Test result:");
        System.out.println(Candles.candlesCount(candles));
        System.out.println();
        System.out.println("Exercise 9 Test result:");
        System.out.println(Arrays.toString(PlayerRecords.records(points)));
        System.out.println();
        System.out.println("Exercise 10 Test result:");
        System.out.println(MaxOfAnArray.maxPosition(numbers3));
        System.out.println(MaxOfAnArray.maxNumber(numbers3));
        System.out.println();

    }

}
