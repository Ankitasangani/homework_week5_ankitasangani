package homework_week5;

import java.util.ArrayList;
/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme7_TestArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Kiwi");
        arrayList.add("Pineapple");

        System.out.println("Is the ArrayList empty? " + (arrayList.isEmpty() ? "Yes" : "No"));

    }
}
