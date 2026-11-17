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
public class _04_division {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mathematics score: ");
        double math = input.nextDouble();

        System.out.print("Enter English score: ");
        double english = input.nextDouble();

        System.out.print("Enter Physics score: ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry score: ");
        double chemistry = input.nextDouble();

        // Add all scores and divide by four
        double average = (math + english + physics + chemistry) / 4;

        System.out.println("Average score: " + average);

        input.close();
    }
}
