package gr.aueb.cf.cf9.review_challenges;

public class UrlString {

    public static String urlStringFormat(String str){

        if (str == null) return null;

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else sb.append(c);
        }
        return sb.toString();
    }
}
