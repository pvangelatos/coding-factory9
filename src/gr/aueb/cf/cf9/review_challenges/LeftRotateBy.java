package gr.aueb.cf.cf9.review_challenges;

public class LeftRotateBy {

    public static int[] leftRotate(int[] arr, int offset){
        if (arr == null || arr.length == 0 || offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }
}
