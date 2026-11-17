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
public class _06_incremenent {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter current number of students: ");
        int students = input.nextInt();

        // Increase student count by one
        students++;

        System.out.println("Updated student count: " + students);

        input.close();
    }
}
