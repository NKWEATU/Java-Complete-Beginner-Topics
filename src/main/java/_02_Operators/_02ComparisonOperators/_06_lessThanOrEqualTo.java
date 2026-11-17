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
public class _06_lessThanOrEqualTo {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int quantity = input.nextInt();

        // Check whether quantity is five or less
        boolean withinLimit = quantity <= 5;

        System.out.println("Is quantity within limit? " + withinLimit);

        input.close();
    }
}
