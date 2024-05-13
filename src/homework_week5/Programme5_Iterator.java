package homework_week5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Programme5_Iterator {

    // Main method creating an ArrayList and calling static method
    public static void main(String[] args) {

        ArrayList<String> carList = new ArrayList();

        carList.add("Audi");
        carList.add("BMW");
        carList.add("Ford");
        carList.add("Toyota");
        carList.add("Mercedes");

        iterateArrayList(carList);

    }

    // Static method to iterate through the ArrayList using Iterator
    public static void iterateArrayList(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String elements = iterator.next();
            System.out.println(elements);
        }
    }
}
