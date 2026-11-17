/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._06_Boolean;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _01_Even_or_Odd_numberChecker {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare variables
        int number;
        boolean isEven;

        // Collect a number
        System.out.print("Enter a whole number: ");
        number = input.nextInt();

        // Check if number is even
        isEven = number % 2 == 0;

        // Display result
        System.out.println("Is the number even? " + isEven);

        input.close();
    }
}
