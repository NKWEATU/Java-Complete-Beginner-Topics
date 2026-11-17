/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _07_exception_handling._01_tryAndCatch;

/**
 *
 * @author HP
 */

//The try block contains code that might produce an exception, 
//while the catch block handles the exception if it occurs.
public class _01_DivisionCalculator {
    
     public static void main(String[] args) {

        // Declare two numbers
        int num1 = 50;
        int num2 = 0;

        // Try block contains code that may cause an exception
        try {

            // Divide the two numbers
            int result = num1 / num2;

            // Display the result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handle division by zero
            System.out.println("Error: You cannot divide by zero!");

        }

        // This statement executes after exception handling
        System.out.println("Program continues running.");

    }
}
