/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _08_OOP_Object_Oriented_Programming._02_Class;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EmployeeInformation {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an employee object
        Employee employee1 = new Employee();

        // Collect employee information
        System.out.print("Enter employee name: ");
        employee1.employeeName = input.nextLine();

        System.out.print("Enter employee age: ");
        employee1.employeeAge = input.nextInt();

        System.out.print("Enter employee salary: ");
        employee1.employeeSalary = input.nextDouble();

        // Display employee information
        System.out.println("\n--- Employee Details ---");

        employee1.displayDetails();

        input.close();

    } 
}
