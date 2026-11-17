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
public class _02_studentScoreCalculator {
    
     public static void main(String[] args) {

        // Create an array containing student scores
        int[] scores = {70, 80, 90, 65, 85};

        try {

            // Attempt to access the sixth student's score
            System.out.println("Student Score: " + scores[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handle an invalid array position
            System.out.println("Error: Student score does not exist!");

        }

        // Display a message after handling the exception
        System.out.println("Thank you for using the program.");

    }
}
