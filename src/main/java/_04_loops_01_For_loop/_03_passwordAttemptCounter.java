/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_loops_01_For_loop;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_passwordAttemptCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctPassword = "java123";
        boolean loginSuccessful = false;

        // Allow the user three attempts
        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login successful!");

                loginSuccessful = true;

                // Stop the loop when password is correct
                break;

            } else {
                System.out.println("Incorrect password.");
                System.out.println("Attempts remaining: " + (3 - i));
            }
        }

        if (!loginSuccessful) {
            System.out.println("Account access denied.");
        }

        input.close();
    } 
}
