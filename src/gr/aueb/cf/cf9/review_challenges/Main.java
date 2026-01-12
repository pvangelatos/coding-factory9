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

        int n = 40;

        int[] numbers = {4, 5, -8, -15, 0, 0};

        int[] numbers2 = {1, 3, 5, 7, 9};

        int[] points = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        int[] numbers3 = {12, 4, 33, 7, 18};

        testExercise("Exercise 1", AddTwoIntegers.sum(4, 9) );

        testExercise("Exercise 2", ArraysOfIntSum.SumOfAnArray(candles));

        testExercise("Exercise 3", Arrays.toString(compareTriplets(alice, bob)));
        testExercise("Exercise 4", DiagonalDiff.diagonalDiff(squareArr));
        System.out.println("Exercise 5 Test result:");
        ScaleOfHashes.scale(n);
        System.out.println();
        System.out.println("Exercise 6 Test result:");
        Ratios.ratios(numbers);
        System.out.println();
        System.out.println("Exercise 7 Test result:");
        SumsOfAnArray.sums(numbers2);
        System.out.println();
        testExercise("Exercise 8", Candles.candlesCount(candles));
        testExercise("Exercise 9", Arrays.toString(PlayerRecords.records(points)));
        System.out.println("Exercise 10 Test result:");
        System.out.println(MaxOfAnArray.maxPosition(numbers3));
        System.out.println(MaxOfAnArray.maxNumber(numbers3));
        System.out.println();
        testExercise("Exercise 11", IsPrime.isPrime(17));
        testExercise("Exersice 12", ReverseStr.reverse("Athens!"));
        testExercise("Exersice 13", Fibonacci.fibonacci(8));
        testExercise("Exercise 14", AnagramStr.isAnagram("listen", "silent"));
        testExercise("Exercise 15", RemoveDublicates.removeDublicates("Hello World!"));
        testExercise("Exercise 16", CharCount.charCount("abracadabra"));
        testExercise("Exercise 17", Palindrome.isPalindrome("radar"));
        testExercise("Exercise 18", UrlString.urlStringFormat("Hello World !"));
        testExercise("Exercise 19", Arrays.toString(TargetNumber.targetNumbers(numbers2, 16)));
        testExercise("Exercise 20", Arrays.toString(LeftRotateBy.leftRotate(points, 3)));

    }

    private static void testExercise(String name, Object result) {
        System.out.println(name + " Test result:");
        System.out.println(result);
        System.out.println();
    }

}
