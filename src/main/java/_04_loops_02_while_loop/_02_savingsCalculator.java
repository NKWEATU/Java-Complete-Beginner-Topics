/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_loops_02_while_loop;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_savingsCalculator {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double savings = 0;

        // Continue collecting savings until target is reached
        while (savings < 100000) {

            System.out.print("Enter monthly savings: ");
            double amount = input.nextDouble();

            // Add the amount to total savings
            savings = savings + amount;

            System.out.println("Current savings: N" + savings);
        }

        System.out.println("Congratulations! Savings target reached.");

        input.close();
    } 
}
