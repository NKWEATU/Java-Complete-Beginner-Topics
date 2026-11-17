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
public class _07_decrement {
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter available seats: ");
        int seats = input.nextInt();

        // Reduce available seats by one
        seats--;

        System.out.println("Remaining seats: " + seats);

        input.close();
    }   
}
