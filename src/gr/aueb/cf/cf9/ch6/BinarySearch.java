package gr.aueb.cf.cf9.ch6;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 5, 3, 1};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 0};

        System.out.println(binarySearch(arr, 4, 1, 7));
        System.out.println(binarySearch(arr1, 4, 1, 4));
    }

    public static int binarySearch(int[] arr, int value, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (value > arr[mid]) return binarySearch(arr, value, mid + 1, high);
        else return binarySearch(arr, value, low, mid - 1); // else if (value < arr[mid])
    }
}
