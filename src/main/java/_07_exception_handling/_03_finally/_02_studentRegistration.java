
package _07_exception_handling._03_finally;

import java.util.Scanner;

/**
 *
 * @author HP
 */

// The finally block executes after try and catch processing,
// whether an exception occurs or not.
public class _02_studentRegistration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Collect student information
            System.out.print("Enter student name: ");
            String studentName = input.nextLine();

            System.out.print("Enter student age: ");
            int age = input.nextInt();

            // Display student information
            System.out.println("\n--- Student Registration Details ---");
            System.out.println("Student Name: " + studentName);
            System.out.println("Student Age: " + age);

        } catch (Exception e) {

            // Handle any exception that occurs
            System.out.println("An error occurred!");
            System.out.println("Please enter a valid student age.");

        } finally {

            // This block executes whether an exception occurs or not
            System.out.println("Registration process completed.");

            input.close();
        }

    }
}
