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
public class _03_multiplesOf_a_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 1;

        // Generate the first ten multiples
        while (count <= 10) {

            int result = number * count;

            System.out.println(number + " x " + count + " = " + result);

            count++;
        }

        input.close();
    }
}
