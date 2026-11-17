/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _06_Methods._04_withParameters.WithReturnValue;

/**
 *
 * @author HP
 */

//These methods receive information, perform an operation,
//and return the result to the place where they were called.
public class _02_simpleInterest {
     // Method accepts principal, rate and time
    public static double calculateInterest(double principal, double rate, double time) {

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Return the calculated interest
        return interest;

    }

    public static void main(String[] args) {

        // Pass principal, rate and time to the method
        double result = calculateInterest(100000, 10, 2);

        // Display the calculated interest
        System.out.println("Simple Interest: " + result);

    }
}
