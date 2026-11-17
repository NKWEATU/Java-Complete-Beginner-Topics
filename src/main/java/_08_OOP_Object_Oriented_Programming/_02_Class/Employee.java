/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _08_OOP_Object_Oriented_Programming._02_Class;

/**
 *
 * @author HP
 */
public class Employee {
    
    String employeeName;
    int employeeAge;
    double employeeSalary;

    // Method to display employee information
    void displayDetails() {

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Salary: " + employeeSalary);

    }
}
