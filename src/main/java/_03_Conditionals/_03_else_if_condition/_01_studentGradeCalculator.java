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
public class _01_studentGradeCalculator {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your examination score: ");
        int score = input.nextInt();

        // Check score range from highest to lowest
        if (score < 0 || score > 100) {
            System.out.println("Invalid score.");
        } else if (score >= 70) {
            System.out.println("Grade: A");
        } else if (score >= 60) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else if (score >= 45) {
            System.out.println("Grade: D");
        } else if (score >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}
