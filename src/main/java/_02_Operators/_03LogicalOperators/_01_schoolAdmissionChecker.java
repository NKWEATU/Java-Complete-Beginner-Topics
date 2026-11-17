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
public class _01_schoolAdmissionChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter examination score: ");
        int score = input.nextInt();

        // Both conditions must be true
        boolean eligible = age >= 16 && score >= 50;

        System.out.println("Eligible for admission: " + eligible);

        input.close();
    } 
}
