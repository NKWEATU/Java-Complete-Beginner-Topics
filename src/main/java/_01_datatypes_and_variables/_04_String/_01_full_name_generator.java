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
public class _01_full_name_generator {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare String variables
        String firstName;
        String middleName;
        String surname;
        String fullName;

        // Collect names
        System.out.print("Enter first name: ");
        firstName = input.nextLine();

        System.out.print("Enter middle name: ");
        middleName = input.nextLine();

        System.out.print("Enter surname: ");
        surname = input.nextLine();

        // Combine names
        fullName = firstName + " " + middleName + " " + surname;

        // Display full name
        System.out.println("Your full name is: " + fullName);

        input.close();
    } 
}
