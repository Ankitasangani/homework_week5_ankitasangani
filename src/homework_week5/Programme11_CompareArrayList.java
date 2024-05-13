package homework_week5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme11_CompareArrayList {

    public static void main(String[] args) {

        // Declare arraylist
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");


        Collections.sort(c1);
        Collections.sort(c2);

        if (c1.equals(c2)) {
            System.out.println("List are the same.");
        } else {
            System.out.println("List are not the same.");
        }
    }
}
