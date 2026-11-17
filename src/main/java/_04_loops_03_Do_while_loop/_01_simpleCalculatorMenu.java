
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
public class _01_simpleCalculatorMenu {

    public static void main(String[] args) {

        // Create Scanner object to collect user input
        Scanner input = new Scanner(System.in);

        // Variable to store the user's menu selection
        int choice;

        // The do-while loop displays the calculator menu at least once
        do {

            // Display calculator menu options
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");

            // Collect the user's menu selection
            System.out.print("Select an option: ");
            choice = input.nextInt();

            // Check if the user selected an arithmetic operation
            if (choice >= 1 && choice <= 3) {

                // Collect the first number
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();

                // Collect the second number
                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();

                // Check if the user selected addition
                if (choice == 1) {
                    System.out.println("Result: " + (num1 + num2));

                // Check if the user selected subtraction
                } else if (choice == 2) {
                    System.out.println("Result: " + (num1 - num2));

                // If neither addition nor subtraction was selected,
                // perform multiplication
                } else {
                    System.out.println("Result: " + (num1 * num2));
                }

            // Check if the user selected the exit option
            } else if (choice == 4) {
                System.out.println("Calculator closed.");

            // Handle any menu selection outside the available options
            } else {
                System.out.println("Invalid option.");
            }

        // Repeat the menu until the user selects option 4
        } while (choice != 4);

        // Close the Scanner object
        input.close();
    }
}
