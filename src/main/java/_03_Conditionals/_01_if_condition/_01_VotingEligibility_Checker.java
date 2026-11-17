/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_Conditionals._01_if_condition;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _01_VotingEligibility_Checker {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Execute only when age is 18 or above
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        input.close();
    }
}
