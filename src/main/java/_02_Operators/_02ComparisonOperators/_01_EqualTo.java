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
public class _01_EqualTo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Check whether both numbers are equal
        boolean result = num1 == num2;

        System.out.println("Are the numbers equal? " + result);

        input.close();
    } 
}
