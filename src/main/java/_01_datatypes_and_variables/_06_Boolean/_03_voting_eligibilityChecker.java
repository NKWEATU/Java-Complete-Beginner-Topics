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
public class _03_voting_eligibilityChecker {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare variables
        int age;
        boolean eligible;

        // Collect age
        System.out.print("Enter your age: ");
        age = input.nextInt();

        // Check voting eligibility
        eligible = age >= 18;

        // Display result
        System.out.println("Are you eligible to vote? " + eligible);

        input.close();
    }
}
