package assignment4;

import java.util.Scanner;

/*
** Charisse Giles
** Assignment 4
** 10/23/2020
*/

public class Assignment4
{
    public static void main(String[] args)
    {
        //tittle 
        System.out.println("Welcome to Simple Gradebook v2.0\n");
        
        // Variables
        int numStudents;
        int numQuizzes;
        double score = 0.0;
        
        // Prompt user to enter number or students and quizzes
        numStudents = promptForInteger("Enter the number of students:  ", GradeBook.MIN_STUDENTS , GradeBook.MAX_STUDENTS);
        numQuizzes = promptForInteger("Enter the number of quizzes:  ", GradeBook.MIN_QUIZZES, GradeBook.MAX_QUIZZES);
        
        System.out.println(); //print blank line
        
        //create grades object
        GradeBook grades = new GradeBook(numStudents, numQuizzes );
        
        System.out.println("Input the grades:");
    
        //nested loop to put scores into a 2D array
        for (int student = 0; student < numStudents; student++)
        {
            for (int quiz = 0; quiz < numQuizzes; quiz++)
            {
                score = promptForDouble("Enter the score for Student#" + student + " and Quiz#" + quiz + ":  ", GradeBook.MIN_SCORE, GradeBook.MAX_SCORE); 
                grades.inputGrades(student, quiz, score);                
            }
        }
                  //Display results
        System.out.println();
        System.out.printf("The average score for %d students and %d quizzes is %.2f", grades.getStudents(), grades.getQuizzes(), grades.calcAvgScore());
        System.out.println();               
    }//end of main    
    //------------------------Methods----------------------------------------    
    public static int promptForInteger(String message, int minValue, int maxValue)
    {
        int count = 0;

        //for user input
        Scanner keyboard = new Scanner(System.in);

        boolean areWeDone = false;

        // do while that prompts user to enter a number with input validation
        do
        {
            System.out.print(message);
            count = Integer.parseInt(keyboard.nextLine());
            
            //input validation
            if (count < minValue || count > maxValue)
            {
                System.err.println("Invalid value. The acceptable range is between"
                        + " 1 and 20. Please try again.");
            } 
            else
            {
                areWeDone = true; //exit loop
            }
        } while (areWeDone == false);
        return count;
    }//end of promptForInteger
    
    public static double promptForDouble(String message, double minValue, double maxValue)
    {
        double score;
        
        //for user input
        Scanner keyboard = new Scanner(System.in);
        
        boolean areWeDone = false;

        // do while that prompts user to enter score with input validation
        do
        {
            System.out.print(message);
            score = Double.parseDouble(keyboard.nextLine());

            //Input validation
            if (score < minValue || score > maxValue)
            {
                System.err.println("Invalid value. The acceptable range is between"
                        + " 0 and 100. Please try again.");
            } 
            else
            {
                areWeDone = true; //exit loop
            }
        } while (areWeDone == false);       
        return score;
    }    
}//end of promptForDouble
