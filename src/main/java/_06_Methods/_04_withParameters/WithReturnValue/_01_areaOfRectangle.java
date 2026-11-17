/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _06_Methods._04_withParameters.WithReturnValue;

/**
 *
 * @author HP
 */
//These methods receive information, perform an operation,
//and return the result to the place where they were called.
public class _01_areaOfRectangle {
    
    // Method accepts length and width and returns an integer
    public static int calculateArea(int length, int width) {

        // Calculate the area of the rectangle
        int area = length * width;

        // Return the calculated area
        return area;

    }

    public static void main(String[] args) {

        // Pass length and width to the method
        int result = calculateArea(20, 10);

        // Display the returned area
        System.out.println("Area of Rectangle: " + result);

    }
}
