
package _07_exception_handling._04_throw;

import java.util.Scanner;

/**
 *
 * @author HP
 */

// The throw keyword is used to manually generate an exception
// when a particular condition is not satisfied.
public class _01_studentAgeValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Ask the user to enter student's age
            System.out.print("Enter student's age: ");
            int age = input.nextInt();

            // Check whether the student meets the age requirement
            if (age < 16) {

                // Manually generate an exception
                throw new IllegalArgumentException(
                    "Student must be at least 16 years old."
                );

            }

            // Display success message if age is valid
            System.out.println("Student registration successful!");

        } catch (IllegalArgumentException e) {

            // Display the exception message
            System.out.println("Registration Error: " + e.getMessage());

        } finally {

            input.close();
        }

    }

}
