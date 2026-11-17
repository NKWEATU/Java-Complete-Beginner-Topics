/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _06_Methods._02_withParameters.WithoutReturnValue;

/**
 *
 * @author HP
 */
//These methods receive information through parameters but do not return any result. 
//They perform operations or display information.
public class _01_displayStudentDetails {
    // Method accepts three parameters
    public static void displayStudent(String name, int age, String department) {

        // Display student information
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Department: " + department);

    }

    public static void main(String[] args) {

        // Call the method and pass three arguments
        displayStudent("Kennedy", 25, "Software Engineering");

    }  
}
