/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_Operators._02ComparisonOperators;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _05_greaterThanOrEqualTo {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter examination score: ");
        int score = input.nextInt();

        // Check whether score is 50 or above
        boolean passed = score >= 50;

        System.out.println("Did the student pass? " + passed);

        input.close();
    }
}
