package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει αν ένας πίνακας ακεραίων
 * είναι συμμετρικός ή όχι. Συμμετρικός
 * είναι ένας πίνακας αν διαβάζεται το ίδιο
 * από την αρχή και το τέλος.
 * Για παράδειγμα, [1, 2, 3, 3, 2, 1]
 * [1, 2, 3, 2, 1]
 *
 */
public class ArraySymmetric {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 5, 3, 1};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 0};

        System.out.println(isArraySymmetric(arr));
        System.out.println(isArraySymmetric(arr1));
    }

    public static boolean isArraySymmetric(int[] arr) {
        // boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
//                isSymmetric = false;
//                break;
                return false;
            }
        }
        // return isSymmetric;
        return true;
    }

}
