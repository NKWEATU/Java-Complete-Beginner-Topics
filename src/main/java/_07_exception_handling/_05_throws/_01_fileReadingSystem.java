
package _07_exception_handling._05_throws;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */

// The throws keyword is used in a method declaration
// to indicate that the method may produce an exception
// that its caller must handle or declare.

public class _01_fileReadingSystem {

    // Declare that this method may produce an IOException
    public static void readFile(String fileName) throws IOException {

        // Attempt to open the file entered by the user
        FileReader file = new FileReader(fileName);

        // Display message if file opens successfully
        System.out.println("File opened successfully!");

        // Close the file
        file.close();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to enter the file name
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();

        try {

            // Call the method that may throw an IOException
            readFile(fileName);

        } catch (IOException e) {

            // Handle file-related errors
            System.out.println("File Error: " + e.getMessage());

        } finally {

            input.close();
        }

    }
}
