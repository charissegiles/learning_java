
package assignment3;

import java.util.Scanner;
/*
** Charisse Giles
** Assginment 3
** 10/1/2020
*/

public class Assignment3
{

    //constants
    static final int MAX_VALUE = 100;
    static final int MIN_VALUE = -1;
    
    public static void main(String[] args)
    {
     //title
     System.out.println("Welcome to Simple Gradebook");   
     
     // initialize variables
     int score = 0; 
     double average = 0;
     int numStudents = 0;
     int sum = 0;
     char grade;
     int studNum = 0;
     
     // do-while loop that exits when -1 is entered
     do {
         score = promptForInt("Enter the score for student #" + studNum + " (or -1 to quit): ", MIN_VALUE, MAX_VALUE); //gets score
         
         if (score != -1)
         {
             sum += score;
             studNum++;
             numStudents++;
         }
       
     }while (score != -1);
     
     //calculate average
     average = (double)sum / numStudents;  
     
    //convert to letter grade
     grade = convertToLetter(average);
     
     //display average and score
     System.out.printf("The average score is a %.2f which equates to a %c. \n ", average, grade);
    }
    
    //promptForInt method
    public static int promptForInt (String message, int minValue, int maxValue)
    {
        int score = 0;
       
        //for user input
        Scanner keyboard = new Scanner(System.in);
       
        boolean areWeDone = false;
        
        // do while that prompts user to enter score with input validation
        do 
        {
            System.out.print(message);
            score = Integer.parseInt(keyboard.nextLine());
            
            if ( score == -1)
            {
                break;
            }
            else if (score < minValue || score > maxValue)
            {
              System.err.println("Invalid value. The acceptable range is between" 
            + " -1 and 100. Please try again.");  
            }
            else
            {
                areWeDone = true; //exit loop
            }
        } while (areWeDone == false);
        
        return score;
    }
    
    // convertToLetter method - converts average to letter grade
    public static char convertToLetter(double score)
    {
       char letterGrade = 'F';
       if (score >= 90 && score <= 100)
       {
           letterGrade = 'A';
       }   
       else if (score < 90 && score >= 80)
       {
           letterGrade = 'B';
       }
       else if (score < 80 && score >= 70)
       {
           letterGrade = 'C';
       }
       else if (score < 70 && score >= 60)
       {
           letterGrade = 'D';
       }
       
       return letterGrade;
    }
}
