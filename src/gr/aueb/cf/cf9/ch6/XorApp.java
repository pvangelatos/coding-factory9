package gr.aueb.cf.cf9.ch6;

public class XorApp {

    public static void main(String[] args) {
        System.out.println(xor(true, false));
    }

    public static boolean xor(boolean b1, boolean b2){
        // return (b1 && !b2) || (!b1 && b2);
            return (b1 ^ b2);   // ^ είναι το xor
    }
}
