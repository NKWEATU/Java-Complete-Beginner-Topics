/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_Operators._03LogicalOperators;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _03_accountAccessChecker {
       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Is your account blocked? (true/false): ");
        boolean blocked = input.nextBoolean();

        // NOT reverses the boolean value
        boolean canAccess = !blocked;

        System.out.println("Can access account? " + canAccess);

        input.close();
    }
}
