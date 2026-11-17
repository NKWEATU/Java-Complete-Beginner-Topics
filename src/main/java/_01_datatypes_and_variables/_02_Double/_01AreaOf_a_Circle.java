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
public class _01AreaOf_a_Circle {
     
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare double variables
        double radius;
        double area;

        // Collect radius
        System.out.print("Enter circle radius: ");
        radius = input.nextDouble();

        // Calculate area
        area = 3.142 * radius * radius;

        // Display result
        System.out.println("Area of circle: " + area);

        input.close();
    }
}
