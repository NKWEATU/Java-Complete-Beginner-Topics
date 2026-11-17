/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._01_integers;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _01_ageInformationSystem {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare integer variables
        int age;
        int months;

        // Collect user's age
        System.out.print("Enter your age in years: ");
        age = input.nextInt();

        // Calculate age in months
        months = age * 12;

        // Display the result
        System.out.println("Your age in months is: " + months);

        input.close();
    }
}
