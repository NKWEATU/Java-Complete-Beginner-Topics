/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _08_OOP_Object_Oriented_Programming._03_Class_multipleObjectsFromOneclass;

/**
 *
 * @author HP
 */
public class schoolExamination {
     public static void main(String[] args) {

        // Create first examination object
        Examination student1 = new Examination();

        student1.studentName = "Kennedy";
        student1.subject = "Java Programming";
        student1.score = 85;

        // Create second examination object
        Examination student2 = new Examination();

        student2.studentName = "David";
        student2.subject = "Python Programming";
        student2.score = 90;

        // Display first student's result
        System.out.println("--- First Student ---");
        student1.displayResult();

        // Display second student's result
        System.out.println("\n--- Second Student ---");
        student2.displayResult();

    }
}
