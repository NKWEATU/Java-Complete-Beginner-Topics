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
public class _05_arraysFill {
      public static void main(String[] args) {

        // Create an array for five customer accounts
        int[] balances = new int[5];

        // Assign 1000 to every position
        Arrays.fill(balances, 1000);

        // Display all account balances
        System.out.println("Account Balances: " + Arrays.toString(balances));

    }
}
