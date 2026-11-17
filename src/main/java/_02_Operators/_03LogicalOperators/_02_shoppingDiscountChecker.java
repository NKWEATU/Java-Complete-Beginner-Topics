/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_Operators._03LogicalOperators;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_shoppingDiscountChecker {
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Are you a registered student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        // At least one condition must be true
        boolean discount = age >= 60 || isStudent;

        System.out.println("Eligible for discount: " + discount);

        input.close();
    }
}
