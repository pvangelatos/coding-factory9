package gr.aueb.cf.cf9.ch16.equals_hashcode;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(5, 10);
        Point p2 = new Point(5, 10);

        System.out.println(p1.equals(p2));
    }
}
