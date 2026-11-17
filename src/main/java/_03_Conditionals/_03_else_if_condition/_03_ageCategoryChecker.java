/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_Conditionals._03_else_if_condition;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_ageCategoryChecker {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Determine the user's age category
        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age <= 12) {
            System.out.println("Category: Child");
        } else if (age <= 19) {
            System.out.println("Category: Teenager");
        } else if (age <= 35) {
            System.out.println("Category: Young Adult");
        } else if (age <= 59) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior Citizen");
        }

        input.close();
    }
}
