/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_loops_03_Do_while_loop;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_positiveNumberCollector {
    public static void main(String[] args) {

        // Create a Scanner object to receive input from the user
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the number entered by the user
        int number;

        // Initialize total to 0 to keep track of positive numbers
        int total = 0;

        // The do-while loop runs at least once before checking the condition
        do {

            // Ask the user to enter a number
            // A negative number will stop the loop
            System.out.print("Enter a number (negative to stop): ");
            number = input.nextInt();

            // Check if the entered number is positive
            if (number > 0) {

                // Add the positive number to the running total
                total = total + number;
            }

        // Repeat the loop as long as the user enters zero or a positive number
        } while (number >= 0);

        // Display the sum of all positive numbers entered
        System.out.println("Total of positive numbers: " + total);

        // Close the Scanner object
        input.close();
    }
}