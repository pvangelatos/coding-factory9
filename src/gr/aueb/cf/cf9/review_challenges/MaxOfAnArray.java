package gr.aueb.cf.cf9.review_challenges;

public class MaxOfAnArray {

    public static int maxPosition(int[] arr) {
        int maxPos = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxPos = i;
            }
        }
        return maxPos;
    }


    public static int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) max = n;

        }
        return max;
    }
}
