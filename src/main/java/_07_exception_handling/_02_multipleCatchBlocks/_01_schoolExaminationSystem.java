
package _07_exception_handling._02_multipleCatchBlocks;

import java.util.Scanner;

// Multiple catch blocks allow a program to
// handle different types of exceptions separately.
public class _01_schoolExaminationSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an array to store 3 student scores
        int[] scores = new int[3];

        // Collect student scores
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        try {

            // Ask the user which student record to access
            System.out.print("Enter student position to view (0 - 2): ");
            int position = input.nextInt();

            // Attempt to access the selected student score
            System.out.println("Student score: " + scores[position]);

            // Collect numbers for division
            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();

            // Attempt division
            int result = firstNumber / secondNumber;

            System.out.println("Division result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handle invalid array position
            System.out.println("Error: Invalid student record!");

        } catch (ArithmeticException e) {

            // Handle division by zero
            System.out.println("Error: Division by zero!");

        }

        input.close();
    }
}
