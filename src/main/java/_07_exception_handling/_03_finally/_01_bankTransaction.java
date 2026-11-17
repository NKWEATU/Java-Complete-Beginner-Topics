
package _07_exception_handling._03_finally;

import java.util.Scanner;

/**
 *
 * @author HP
 */

// The finally block executes after try and catch processing,
// whether an exception occurs or not.
public class _01_bankTransaction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to enter account balance
        System.out.print("Enter account balance: ");
        int balance = input.nextInt();

        // Ask the user to enter withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        int withdrawal = input.nextInt();

        try {

            // Calculate remaining balance
            int remainingBalance = balance / withdrawal;

            System.out.println("Remaining Balance: " + remainingBalance);

        } catch (ArithmeticException e) {

            // Handle division by zero
            System.out.println("Transaction failed!");
            System.out.println("Error: Withdrawal amount cannot be zero.");

        } finally {

            // This block executes after try/catch
            System.out.println("Bank transaction process completed.");

        }

        input.close();
    }
}
