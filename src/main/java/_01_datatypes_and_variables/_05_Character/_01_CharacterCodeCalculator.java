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
public class _01_CharacterCodeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare char variable
        char letter;

        // Collect a character
        System.out.print("Enter a letter: ");
        letter = input.next().charAt(0);

        // Get the numeric character value
        int code = letter;

        // Display result
        System.out.println("Character: " + letter);
        System.out.println("Character code: " + code);

        input.close();
    }
}
