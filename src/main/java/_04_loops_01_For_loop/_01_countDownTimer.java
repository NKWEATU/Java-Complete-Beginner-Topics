/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_loops_01_For_loop;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _01_countDownTimer {
         public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int number = input.nextInt();

        // Count down from the entered number to 1
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Countdown completed!");

        input.close();
    }
}
