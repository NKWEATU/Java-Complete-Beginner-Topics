/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_Operators._01ArithmeticOperators;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _01Addition {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of product 1: ");
        double price1 = input.nextDouble();

        System.out.print("Enter price of product 2: ");
        double price2 = input.nextDouble();

        System.out.print("Enter price of product 3: ");
        double price3 = input.nextDouble();

        // Add the three product prices
        double total = price1 + price2 + price3;

        System.out.println("Total cost: " + total);

        input.close();
    }
}
