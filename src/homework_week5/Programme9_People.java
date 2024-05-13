package homework_week5;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme9_People {

    public static void main(String[] args) {
        // Creating a HashMap to store String keys and Integer values
        Map<String, Integer> people = new HashMap();

        people.put("Ankita", 25);
        people.put("Dhwani", 26);
        people.put("Nishit", 27);
        people.put("Savan", 28);
        people.put("Subham", 29);

        for (Map.Entry<String, Integer> object : people.entrySet()) {
            System.out.println(object.getKey() + " " + object.getValue());
        }
    }
}
