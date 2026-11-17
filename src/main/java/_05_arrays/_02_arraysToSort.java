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
public class _02_arraysToSort {
    
      public static void main(String[] args) {

        // Store product prices
        int[] prices = {500, 200, 900, 100, 700};

        // Arrange prices from lowest to highest
        Arrays.sort(prices);

        // Display sorted prices
        System.out.println("Sorted Prices: " + Arrays.toString(prices));

    }
}
