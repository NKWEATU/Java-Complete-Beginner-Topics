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
public class _03_multiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter daily payment: ");
        double dailyPay = input.nextDouble();

        System.out.print("Enter number of working days: ");
        int days = input.nextInt();

        // Multiply daily payment by working days
        double salary = dailyPay * days;

        System.out.println("Total salary: " + salary);

        input.close();
    } 
}
