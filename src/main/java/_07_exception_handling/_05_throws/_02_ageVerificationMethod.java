
package _07_exception_handling._05_throws;

import java.util.Scanner;

/**
 *
 * @author HP
 */

// The throws keyword is used in a method declaration
// to indicate that the method may produce an exception
// that its caller must handle or declare.

public class _02_ageVerificationMethod {

    // Declare that this method may throw an exception
    public static void verifyAge(int age) throws Exception {

        // Check whether the age meets the requirement
        if (age < 18) {

            // Generate an exception
            throw new Exception("You must be 18 years or older!");

        }

        // Display success message
        System.out.println("Age verification successful!");

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Ask the user to enter their age
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            // Call the method and pass the user's age
            verifyAge(age);

        } catch (Exception e) {

            // Handle the exception declared by the method
            System.out.println("Verification Error: " + e.getMessage());

        } finally {

            input.close();
        }

    }
}
