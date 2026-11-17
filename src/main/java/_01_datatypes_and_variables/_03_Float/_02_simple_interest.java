/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._03_Float;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_simple_interest {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare float variables
        float principal;
        float rate;
        float time;
        float interest;

        // Collect principal
        System.out.print("Enter principal amount: ");
        principal = input.nextFloat();

        // Collect interest rate
        System.out.print("Enter interest rate: ");
        rate = input.nextFloat();

        // Collect time
        System.out.print("Enter time in years: ");
        time = input.nextFloat();

        // Calculate simple interest
        interest = (principal * rate * time) / 100.0f;

        // Display result
        System.out.println("Simple interest: " + interest);

        input.close();
    }  
}
