/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _08_OOP_Object_Oriented_Programming._01_Class;

/**
 *
 * @author HP
 */
public class _01_studentInformation {
 
    public static void main(String[] args) {

        // Create the first student object
        Student student1 = new Student();

        // Assign values to the first object
        student1.studentName = "Kennedy";
        student1.age = 25;
        student1.department = "Computer Science";

        // Display first student details
        student1.displayDetails();

        System.out.println("--------------------");

        // Create the second student object
        Student student2 = new Student();

        // Assign values to the second object
        student2.studentName = "David";
        student2.age = 22;
        student2.department = "Software Engineering";

        // Display second student details
        student2.displayDetails();

    }   
}
