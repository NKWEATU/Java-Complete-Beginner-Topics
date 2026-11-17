/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _06_Methods._03_withoutParameters.WithReturnValue;

/**
 *
 * @author HP
 */
public class _02_calculateTotalStudentScores {
    
     // Method calculates and returns total scores
    public static int calculateTotal() {

        // Store scores for three subjects
        int mathematics = 80;
        int english = 75;
        int computer = 90;

        // Calculate total scores
        int total = mathematics + english + computer;

        // Return the total score
        return total;

    }

    public static void main(String[] args) {

        // Store the returned value
        int studentTotal = calculateTotal();

        // Display total student scores
        System.out.println("Total Student Score: " + studentTotal);

    }
}
