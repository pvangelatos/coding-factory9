package gr.aueb.cf.cf9.review_challenges;

public class Fibonacci {

    public static void main(String[] args) {


        System.out.println(fibonacci(5));
    }

    public static int fibonacci (int n){
        int a = 0;
        int b = 1;
        int fibo = 0;

        for (int i = 2; i <= n ; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }

        return fibo;
    }
}
