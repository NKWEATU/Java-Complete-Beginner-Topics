/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_Conditionals._01_if_condition;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_accountBalanceAlert {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your account balance: ");
        double balance = input.nextDouble();

        // Check if balance is below 5000
        if (balance < 5000) {
            System.out.println("Warning: Your account balance is low!");
        }

        input.close();
    }
}
