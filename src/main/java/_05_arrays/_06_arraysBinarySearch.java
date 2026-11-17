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
public class _06_arraysBinarySearch {
    
     public static void main(String[] args) {

        // Store student scores in ascending order
        int[] scores = {40, 50, 60, 70, 80, 90};

        // Search for score 70
        int result = Arrays.binarySearch(scores, 70);

        // Check whether the score was found
        if (result >= 0) {

            // Display the index where the score was found
            System.out.println("Score found at index: " + result);

        } else {

            System.out.println("Score not found");

        }

    }
}
