package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerCaseAssert {

    public static void main(String[] args) {
        String s = "XAGDGmmm";   // τουλάχιστον 8 χαρακτήρες τουλαχιστον 1 lowercase

        Pattern pattern = Pattern.compile("(?=.*?[a-z])^.{8,}$");  // Zero-length assertion
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println( matcher.group());

        }
    }

}
