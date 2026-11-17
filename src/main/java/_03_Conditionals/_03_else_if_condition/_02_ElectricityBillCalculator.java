/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_Conditionals._03_else_if_condition;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_ElectricityBillCalculator {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = input.nextInt();

        double bill;

        // Determine the applicable rate
        if (units < 0) {
            System.out.println("Invalid electricity units.");
        } else if (units <= 100) {
            bill = units * 50;
            System.out.println("Electricity bill: N" + bill);
        } else if (units <= 200) {
            bill = units * 75;
            System.out.println("Electricity bill: N" + bill);
        } else {
            bill = units * 100;
            System.out.println("Electricity bill: N" + bill);
        }

        input.close();
    }
}
