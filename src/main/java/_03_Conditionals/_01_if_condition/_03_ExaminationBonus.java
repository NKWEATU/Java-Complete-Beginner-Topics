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
public class _03_ExaminationBonus {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your examination score: ");
        int score = input.nextInt();

        // Check whether student qualifies for bonus
        if (score >= 80) {
            System.out.println("Congratulations! You qualify for a bonus.");
        }

        input.close();
    }
}
