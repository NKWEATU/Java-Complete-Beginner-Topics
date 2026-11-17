/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_Operators._01ArithmeticOperators;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _05_modulus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int students = input.nextInt();

        System.out.print("Enter students per group: ");
        int groupSize = input.nextInt();

        // Modulus returns the remainder
     
        int remaining = students % groupSize;

        System.out.println("Students remaining: " + remaining);
       

        input.close();
    }
}
