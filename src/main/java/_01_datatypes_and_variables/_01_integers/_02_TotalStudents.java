/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._01_integers;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_TotalStudents {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare integer variables
        int boys;
        int girls;
        int totalStudents;

        // Collect number of boys
        System.out.print("Enter number of boys: ");
        boys = input.nextInt();

        // Collect number of girls
        System.out.print("Enter number of girls: ");
        girls = input.nextInt();

        // Calculate total students
        totalStudents = boys + girls;

        // Display result
        System.out.println("Total students: " + totalStudents);

        input.close();
    }
}
