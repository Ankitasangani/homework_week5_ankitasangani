package homework_week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme10_StationName {

    public static void main(String[] args) {

        Map<String, String> stationLines = new HashMap<>();

        stationLines.put("King's Cross St Pancras", "Victoria Line, Northern Line, Piccadilly Line");
        stationLines.put("Oxford Circus", "Victoria Line, Bakerloo Line, Central Line");
        stationLines.put("Waterloo", "Bakerloo Line, Jubilee Line, Northern Line");


        //Scanner user to enter a station
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a station name (e.g., Oxford Circus): ");
        String station = scanner.nextLine();

        // Find lines passing through the entered station
        if (stationLines.containsKey(station)) {
            System.out.print("Lines passing through " + station + ": ");
            String[] lines = stationLines.get(station).split(", ");
            for (String line : lines) {
                System.out.print(line + ", ");
            }
            System.out.println();
        } else {
            System.out.println("Station " + station + " not found.");
        }

        // Close the scanner
        scanner.close();
    }
}



