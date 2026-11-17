/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _01_datatypes_and_variables._04_String;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _02_shopping_Reciept {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare String variable
        String product;

        // Declare numerical variables
        double price;
        int quantity;
        double total;

        // Collect product name
        System.out.print("Enter product name: ");
        product = input.nextLine();

        // Collect price and quantity
        System.out.print("Enter product price: ");
        price = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Calculate total cost
        total = price * quantity;

        // Display receipt
        System.out.println("\n--- SHOPPING RECEIPT ---");
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: ₦" + total);

        input.close();
    }
}
