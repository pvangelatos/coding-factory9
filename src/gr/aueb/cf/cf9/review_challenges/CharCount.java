package gr.aueb.cf.cf9.review_challenges;

public class CharCount {

    public static char charCount(String s){
        if (s == null || s.length() == 0) return '\0';

        int[] frequency = new int[256];

        for (char c : s.toCharArray()) {
            frequency[c]++;
        }

        int maxCount = Integer.MIN_VALUE;
        char maxChar = '\0';

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) i;
            }
        }
        return maxChar;
    }
}
