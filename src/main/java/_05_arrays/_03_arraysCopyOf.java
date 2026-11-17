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
public class _03_arraysCopyOf {
       public static void main(String[] args) {

        // Original registration numbers
        int[] registrationNumbers = {101, 102, 103, 104, 105};

        // Copy all elements into a new array
        int[] copiedNumbers = Arrays.copyOf(registrationNumbers, registrationNumbers.length);

        // Display original array
        System.out.println("Original: " + Arrays.toString(registrationNumbers));

        // Display copied array
        System.out.println("Copied: " + Arrays.toString(copiedNumbers));

    }
}
