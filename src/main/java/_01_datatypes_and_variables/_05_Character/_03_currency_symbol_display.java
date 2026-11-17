/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._05_Character;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_currency_symbol_display {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare char variable
        char symbol;

        // Collect currency symbol
        System.out.print("Enter a currency symbol: ");
        symbol = input.next().charAt(0);

        // Collect amount
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        // Display amount with currency symbol
        System.out.println("Your amount is: " + symbol + amount);

        input.close();
    }
}
