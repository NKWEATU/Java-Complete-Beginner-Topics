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
public class _02_pass_or_fail_checker {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare variables
        double score;
        boolean passed;

        // Collect examination score
        System.out.print("Enter examination score: ");
        score = input.nextDouble();

        // Check if student passed
        passed = score >= 50;

        // Display result
        System.out.println("Did the student pass? " + passed);

        input.close();
    }
}
