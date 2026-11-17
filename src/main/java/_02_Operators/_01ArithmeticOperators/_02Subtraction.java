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
public class _02Subtraction {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your available money: ");
        double money = input.nextDouble();

        System.out.print("Enter amount spent: ");
        double spent = input.nextDouble();

        // Subtract amount spent from available money
        double balance = money - spent;

        System.out.println("Remaining balance: " + balance);

        input.close();
    }
}
