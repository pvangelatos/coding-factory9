package gr.aueb.cf.cf9.review_challenges;

public class Palindrome {

    public static boolean isPalindrome(String str){
        if (str == null || str.length() == 0) return false;

        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
