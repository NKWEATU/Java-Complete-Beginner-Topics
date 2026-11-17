/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _05_arrays;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class _04_arraysEquals {
     public static void main(String[] args) {

        // Scores from examination one
        int[] examOne = {70, 80, 90};

        // Scores from examination two
        int[] examTwo = {70, 80, 90};

        // Compare both arrays
        boolean result = Arrays.equals(examOne, examTwo);

        // Display the result
        System.out.println("Are both arrays equal? " + result);

    }
}
