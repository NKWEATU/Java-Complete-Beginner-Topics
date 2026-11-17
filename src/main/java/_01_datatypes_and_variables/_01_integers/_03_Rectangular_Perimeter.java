/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._01_integers;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_Rectangular_Perimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare integer variables
        int length;
        int width;
        int perimeter;

        // Collect rectangle dimensions
        System.out.print("Enter length: ");
        length = input.nextInt();

        System.out.print("Enter width: ");
        width = input.nextInt();

        // Calculate perimeter
        perimeter = 2 * (length + width);

        // Display result
        System.out.println("Rectangle perimeter: " + perimeter);

        input.close();
    }
}
