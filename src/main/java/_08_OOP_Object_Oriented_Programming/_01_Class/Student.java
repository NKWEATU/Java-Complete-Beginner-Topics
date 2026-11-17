/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _08_OOP_Object_Oriented_Programming._01_Class;

/**
 *
 * @author HP
 */
// Create a Student class
public class Student {

    // Declare class properties
    String studentName;
    int age;
    String department;

    // Create a method to display student details
    void displayDetails() {

        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);

    }
}