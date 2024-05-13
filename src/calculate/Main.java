package calculate;

import java.util.Scanner;

/**
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

public class Main extends Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initializes the variable to do more calculation
        char doMoreCalculation = 'Y';

        // while loop using with scanner
        while (doMoreCalculation == 'Y') {
            System.out.println("Enter first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int number2 = scanner.nextInt();
            System.out.println("Please enter one of symbol +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            // Calculating result based on user input
            Calculator calculator = new Calculator();
            calculator.calculateResult(number1, number2, symbol);

            // Asking if user wants to do more calculations
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N' : ");
            doMoreCalculation = scanner.next().charAt(0);
        }
        scanner.close();
    }
}






























