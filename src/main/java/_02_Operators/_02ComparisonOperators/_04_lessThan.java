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
public class _04_lessThan {
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        // Check whether temperature is below 20
        boolean result = temperature < 20;

        System.out.println("Is temperature below 20? " + result);

        input.close();
    }
}
