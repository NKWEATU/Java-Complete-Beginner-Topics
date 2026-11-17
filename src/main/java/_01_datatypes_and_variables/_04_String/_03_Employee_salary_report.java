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
public class _03_Employee_salary_report {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare String variable
        String employeeName;

        // Declare numerical variables
        double basicSalary;
        double allowance;
        double totalSalary;

        // Collect employee name
        System.out.print("Enter employee name: ");
        employeeName = input.nextLine();

        // Collect basic salary
        System.out.print("Enter basic salary: ");
        basicSalary = input.nextDouble();

        // Collect allowance
        System.out.print("Enter allowance: ");
        allowance = input.nextDouble();

        // Calculate total salary
        totalSalary = basicSalary + allowance;

        // Display salary report
        System.out.println("\n--- SALARY REPORT ---");
        System.out.println("Employee: " + employeeName);
        System.out.println("Basic Salary: ₦" + basicSalary);
        System.out.println("Allowance: ₦" + allowance);
        System.out.println("Total Salary: ₦" + totalSalary);

        input.close();
    }
}
