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
public class _02_squareNumberGenerator {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want? ");
        int limit = input.nextInt();

        // Generate squares from 1 up to the limit
        for (int i = 1; i <= limit; i++) {

            int square = i * i;

            System.out.println(i + " squared = " + square);
        }

        input.close();
    }
}
