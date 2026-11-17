/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._03_Float;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_Fuel_Consumption {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare float variables
        float distance;
        float fuel;
        float consumption;

        // Collect distance
        System.out.print("Enter distance travelled: ");
        distance = input.nextFloat();

        // Collect fuel used
        System.out.print("Enter fuel used in litres: ");
        fuel = input.nextFloat();

        // Calculate distance per litre
        consumption = distance / fuel;

        // Display result
        System.out.println("Distance per litre: " + consumption);

        input.close();
    }   
}
