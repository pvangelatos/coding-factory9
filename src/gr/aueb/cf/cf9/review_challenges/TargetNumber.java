package gr.aueb.cf.cf9.review_challenges;

public class TargetNumber {

    public static int[] targetNumbers(int[] arr, int target){
        if (arr == null || arr.length == 0) return null;


        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
