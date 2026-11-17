
package _07_exception_handling._02_multipleCatchBlocks;

import java.util.Scanner;

/**
 *
 * @author HP
 */

// Multiple catch blocks allow a program to
// handle different types of exceptions separately.
public class _02_numberConversionSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number as text
        System.out.print("Enter a number: ");
        String number = input.nextLine();

        try {

            // Convert the user's text into an integer
            int value = Integer.parseInt(number);

            // Divide 100 by the converted number
            int result = 100 / value;

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {

            // Handle invalid text conversion
            System.out.println("Error: This text is not a valid number!");

        } catch (ArithmeticException e) {

            // Handle division by zero
            System.out.println("Error: Cannot divide by zero!");

        }

        input.close();
    }
}
