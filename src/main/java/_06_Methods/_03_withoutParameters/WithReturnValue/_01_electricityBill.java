/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _06_Methods._03_withoutParameters.WithReturnValue;

/**
 *
 * @author HP
 */

//These methods do not receive information, 
//but they perform an operation and return a result using the return keyword.
public class _01_electricityBill {
      // Method does not accept parameters but returns a double
    public static double calculateBill() {

        // Store electricity units and cost per unit
        double units = 120;
        double costPerUnit = 50;

        // Calculate total electricity bill
        double bill = units * costPerUnit;

        // Return the calculated bill
        return bill;

    }

    public static void main(String[] args) {

        // Receive the returned value from the method
        double totalBill = calculateBill();

        // Display the electricity bill
        System.out.println("Total Electricity Bill: " + totalBill);

    }
}
