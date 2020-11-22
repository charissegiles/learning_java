
package assignment2;

import java.util.Scanner;
/**
 * Charisse Giles
 * Assignment2
 * 9/16/2020
 */
public class Assignment2
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to simple calculator!");
        
        // takes input from keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //converts the input into double data type
        System.out.print("Enter the first number:    ");
        double firstNumber = Double.parseDouble(keyboard.nextLine());
        
        System.out.print("Enter the second number:   ");
        double secondNumber = Double.parseDouble(keyboard.nextLine());
        
        //the input is stored as a string data type
        System.out.print("Enter math operator (+, -, *, /):   ");
        String input = keyboard.nextLine();
        
        // convert string to char
        char operator = input.charAt(0);
        
        double answer = 0;
        
        //matches the value in operator to one of the cases then computation 
        // is done
        switch (operator)
        {
            case '+': 
                answer = firstNumber + secondNumber;
                break;
             
            case '-':
                answer = firstNumber - secondNumber;
                break;
                
            case '*':
                answer = firstNumber * secondNumber;
                break;
             
            case '/':
                answer = firstNumber / secondNumber;
                break;
            
            //error message if invalid input in operator
            default:
                System.out.println("That's not a valid math operator.");
                break;          
        }
        
        //displays the formatted answer
        System.out.printf("The answer is: %.4f \n", answer);
    }
    
}
