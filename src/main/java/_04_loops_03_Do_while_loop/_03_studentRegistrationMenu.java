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
public class _03_studentRegistrationMenu {
    public static void main(String[] args) {

        // Create a Scanner object to receive input from the user
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the user's menu selection
        int choice;

        // Initialize the total number of registered students to zero
        int totalStudents = 0;

        // The do-while loop displays the registration menu at least once
        do {

            // Display the student registration menu
            System.out.println("\n===== STUDENT REGISTRATION =====");
            System.out.println("1. Register Student");
            System.out.println("2. Exit");

            // Ask the user to select an option
            System.out.print("Select an option: ");
            choice = input.nextInt();

            // Check if the user selected the Register Student option
            if (choice == 1) {

                // Clear the input buffer before accepting a String
                input.nextLine();

                // Ask the user to enter the student's name
                System.out.print("Enter student name: ");
                String name = input.nextLine();

                // Increase the total student count by one
                totalStudents++;

                // Display a successful registration message
                System.out.println(name + " registered successfully.");

            // Check if the user selected the Exit option
            } else if (choice == 2) {

                // Display a message when registration is closed
                System.out.println("Registration closed.");

            // Handle any menu option that is not 1 or 2
            } else {

                // Inform the user that the selected option is invalid
                System.out.println("Invalid option.");
            }

        // Repeat the menu until the user selects option 2
        } while (choice != 2);

        // Display the total number of students registered
        System.out.println("Total students registered: " + totalStudents);

        // Close the Scanner object
        input.close();
    }
}