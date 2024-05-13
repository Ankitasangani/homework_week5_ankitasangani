package homework_week5;

import java.util.ArrayList;
/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme4_NewArrayList {

    // Creating array list with main method
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList();

        colours.add("White");
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Purple");

        //Print the arraylist
        System.out.println("Colours in the ArrayList: ");
        for (String colourName : colours) {
            System.out.println(colourName);
        }
    }
}
