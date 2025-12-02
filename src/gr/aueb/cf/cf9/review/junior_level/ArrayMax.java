package gr.aueb.cf.cf9.review.junior_level;

public class ArrayMax {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int m = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println(m);


    }

}
