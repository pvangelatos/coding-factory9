package gr.aueb.cf.cf9.review_challenges;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicates {

    public static String removeDublicates(String s){
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()){
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}
