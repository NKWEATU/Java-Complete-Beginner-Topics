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
public class _02_SpeedCalculator {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare double variables
        double distance;
        double time;
        double speed;

        // Collect distance
        System.out.print("Enter distance in kilometres: ");
        distance = input.nextDouble();

        // Collect time
        System.out.print("Enter time in hours: ");
        time = input.nextDouble();

        // Calculate speed
        speed = distance / time;

        // Display result
        System.out.println("Speed: " + speed + " km/h");

        input.close();
    }
}
