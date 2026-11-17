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
public class _08_arraysCopyOfRange {
    
     public static void main(String[] args) {

        // Store scores for ten students
        int[] scores = {40, 50, 60, 70, 80, 90, 65, 75, 85, 95};

        // Copy elements starting from index 2 up to index 6 (excluding 6)
        int[] selectedScores = Arrays.copyOfRange(scores, 2, 6);

        // Display original array
        System.out.println("Original Scores: " + Arrays.toString(scores));

        // Display extracted scores
        System.out.println("Selected Scores: " + Arrays.toString(selectedScores));

    }
}
