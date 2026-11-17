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
public class _10_arraysDeepEquals {
     public static void main(String[] args) {

        // Examination records for department one
        int[][] departmentOne = {
            {70, 80, 90},
            {60, 75, 85}
        };

        // Examination records for department two
        int[][] departmentTwo = {
            {70, 80, 90},
            {60, 75, 85}
        };

        // Compare both multidimensional arrays
        boolean result = Arrays.deepEquals(departmentOne, departmentTwo);

        // Display the comparison result
        System.out.println("Are both department records equal? " + result);

    }
}
