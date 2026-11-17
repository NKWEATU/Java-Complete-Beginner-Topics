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
public class _02_mathematical_operator_display {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare char variable
        char operator;

        // Collect an operator
        System.out.print("Enter a mathematical operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        // Display the selected operator
        System.out.println("You selected operator: " + operator);

        input.close();
    }
}
