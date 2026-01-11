package gr.aueb.cf.cf9.review_challenges;

public class ScaleOfHashes {

    public static void scale (int n) {
        for (int i = 1; i <= n  ; i++) {
            for (int j = i; j <= n-1; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < i; k++) {
                System.out.print('#');

            }
            System.out.println();
        }

    }
}
