
package assignment1;

import java.util.Scanner;

/*
* Name: Charisse Giles
* Assignment: 1
* Date: 9/2/2020
 */

public class Assignment1
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to Simple Payroll");
        
        // takes the input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the Employee's name:   ");
        String employeeName = keyboard.nextLine();
        
        System.out.print("Enter the whole hours worked:   ");
        int hoursWorked = Integer.parseInt(keyboard.nextLine());
        
        System.out.print("Enter the hourly rate:   ");
        double hourlyRate = Double.parseDouble(keyboard.nextLine());
        
        // variables are promoted before calculation
        double grossPay = hoursWorked * hourlyRate;
        
        System.out.println(employeeName + "'s gross pay due is " + grossPay);
        
    }
    
}
