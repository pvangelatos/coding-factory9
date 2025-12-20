package gr.aueb.cf.cf9.ch17.sets;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("Apple");
        bag.add("Banana");
        bag.add("Orange");
        bag.add("Apple"); // Duplicate, will not be added
        System.out.println("Bag contents: " + bag);

        if (bag.contains("Apple")) {    // overide equals
            bag.remove("Apple");
        } else {
            System.out.println("Apple not found in the bag.");
        }
        bag.removeIf (item -> item.startsWith("B")); // remove items that start with B
        bag.forEach(System.out::println);
    }
}
