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
public class _07_arraysCompare {
    
    public static void main(String[] args) {

        // Product prices from store one
        int[] storeOne = {100, 200, 300};

        // Product prices from store two
        int[] storeTwo = {100, 250, 300};

        // Compare both arrays element by element
        int result = Arrays.compare(storeOne, storeTwo);

        // Interpret the comparison result
        if (result == 0) {

            System.out.println("Both arrays are equal");

        } else if (result < 0) {

            System.out.println("Store One has a smaller value at the first difference");

        } else {

            System.out.println("Store One has a greater value at the first difference");

        }

    }
}
