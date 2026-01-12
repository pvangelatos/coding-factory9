package gr.aueb.cf.cf9.review_challenges;

public class IsPrime {

    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        if (a == 2) return true;
        if (a % 2 ==0) return false;

        for (int i = 3; i <= Math.sqrt(a) ; i += 2) {
            if (a % i == 0) return false;

        }
        return true;
    }
}
