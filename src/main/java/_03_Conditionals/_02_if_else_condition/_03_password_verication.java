/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_Conditionals._02_if_else_condition;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_password_verication {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctPassword = "java123";

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        // Compare the entered password with the correct password
        if (password.equals(correctPassword)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Incorrect password. Access denied.");
        }

        input.close();
    }
}
