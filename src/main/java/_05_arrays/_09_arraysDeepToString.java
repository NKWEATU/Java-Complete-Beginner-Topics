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
public class _09_arraysDeepToString {
    
     public static void main(String[] args) {

        // Create a two-dimensional array for three students
        int[][] scores = {
            {70, 80, 90},
            {60, 75, 85},
            {80, 90, 95}
        };

        // Display all rows and columns
        System.out.println("Student Examination Records: ");

        System.out.println(Arrays.deepToString(scores));

    }
}
