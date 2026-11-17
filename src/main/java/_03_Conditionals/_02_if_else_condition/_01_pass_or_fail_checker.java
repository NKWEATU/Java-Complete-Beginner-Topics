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
public class _01_pass_or_fail_checker {
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter examination score: ");
        int score = input.nextInt();

        // Check if score is at least 50
        if (score >= 50) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("Sorry, you failed.");
        }

        input.close();
    } 
}
