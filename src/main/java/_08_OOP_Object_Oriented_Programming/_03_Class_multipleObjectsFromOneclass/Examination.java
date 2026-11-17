/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _08_OOP_Object_Oriented_Programming._03_Class_multipleObjectsFromOneclass;

/**
 *
 * @author HP
 */
public class Examination {
    String studentName;
    String subject;
    int score;

    // Method to display examination details
    void displayResult() {

        System.out.println("Student: " + studentName);
        System.out.println("Subject: " + subject);
        System.out.println("Score: " + score);

    }
}
