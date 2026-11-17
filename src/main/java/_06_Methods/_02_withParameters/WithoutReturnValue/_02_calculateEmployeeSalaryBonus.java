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
public class _02_calculateEmployeeSalaryBonus {
     // Method accepts salary and bonus percentage
    public static void calculateBonus(double salary, double bonusPercentage) {

        // Calculate the employee's bonus
        double bonus = salary * bonusPercentage / 100;

        // Add bonus to the original salary
        double totalSalary = salary + bonus;

        // Display the results
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus Amount: " + bonus);
        System.out.println("Total Salary: " + totalSalary);

    }

    public static void main(String[] args) {

        // Pass salary and bonus percentage to the method
        calculateBonus(150000, 10);

}
}