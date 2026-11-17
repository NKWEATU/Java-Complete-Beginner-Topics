/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_loops_02_while_loop;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _01_numberGuessingGame {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int correctNumber = 7;
        int guess = 0;

        // Continue until the correct number is entered
        while (guess != correctNumber) {

            System.out.print("Guess the number: ");
            guess = input.nextInt();

            if (guess != correctNumber) {
                System.out.println("Wrong guess. Try again!");
            }
        }

        System.out.println("Congratulations! You guessed correctly.");

        input.close();
    }
}
