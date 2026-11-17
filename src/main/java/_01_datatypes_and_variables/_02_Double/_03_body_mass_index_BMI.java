/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._02_Double;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_body_mass_index_BMI {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare double variables
        double weight;
        double height;
        double bmi;

        // Collect weight in kilograms
        System.out.print("Enter weight in kg: ");
        weight = input.nextDouble();

        // Collect height in metres
        System.out.print("Enter height in metres: ");
        height = input.nextDouble();

        // Calculate BMI
        bmi = weight / (height * height);

        // Display result
        System.out.println("Your BMI is: " + bmi);

        input.close();
    }
}
