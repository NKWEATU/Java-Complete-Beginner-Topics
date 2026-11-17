
package _07_exception_handling._04_throw;

import java.util.Scanner;

/**
 *
 * @author HP
 */

// The throw keyword is used to manually generate an exception
// when a particular condition is not satisfied.
public class _02_bankWithdrawalValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to enter account balance
        System.out.print("Enter account balance: ");
        double balance = input.nextDouble();

        // Ask the user to enter withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double withdrawal = input.nextDouble();

        try {

            // Check whether withdrawal exceeds available balance
            if (withdrawal > balance) {

                // Generate an exception if funds are insufficient
                throw new IllegalArgumentException(
                    "Insufficient account balance!"
                );

            }

            // Calculate remaining balance
            double remainingBalance = balance - withdrawal;

            // Display remaining balance
            System.out.println("Remaining Balance: " + remainingBalance);

            System.out.println("Withdrawal successful!");

        } catch (IllegalArgumentException e) {

            // Handle invalid withdrawal
            System.out.println("Transaction Error: " + e.getMessage());

        } finally {

            input.close();
        }

    }
}
