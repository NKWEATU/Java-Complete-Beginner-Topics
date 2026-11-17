/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._03_Float;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _01_averageOfThreeScores {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare float variables
        float score1;
        float score2;
        float score3;
        float average;

        // Collect scores
        System.out.print("Enter first score: ");
        score1 = input.nextFloat();

        System.out.print("Enter second score: ");
        score2 = input.nextFloat();

        System.out.print("Enter third score: ");
        score3 = input.nextFloat();

        // Calculate average
        average = (score1 + score2 + score3) / 3.0f;

        // Display average
        System.out.println("Average score: " + average);

        input.close();
    }
}
