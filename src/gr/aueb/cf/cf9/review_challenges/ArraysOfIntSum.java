package gr.aueb.cf.cf9.review_challenges;

public class ArraysOfIntSum {

    public static int SumOfAnArray(int[] arr) {
       if (arr == null || arr.length == 0) return -1;
       int count = 0;
        for (int number : arr) {
            count += number;
        }
        return count;
    }
}
