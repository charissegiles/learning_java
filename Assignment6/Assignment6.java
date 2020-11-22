package assignment6;

import java.util.Scanner;
/*
** Charisse Giles
** Assginment 6
** 11/20/2020
*/
public class Assignment6
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Welcome to Assignment 6!"); 
        System.out.println("\nLet's prompt the user for the info we need...");
        
        int profID = promptForInt("Enter the professor ID:  ", Professor.MIN_PROF_ID, Professor.MAX_PROF_ID);
        String fname = promptForString("Enter the first name:   ");
        String lname = promptForString("Enter the last name:    ");
        
        System.out.println("\nLet's try to build an Adjunct professor...");
        
        ProfessorAdjunct adjunct = new ProfessorAdjunct(profID, fname, lname); //test
        
        System.out.println("\nLet's use its toString to see if it worked...");
        System.out.println(adjunct.toString());
        
        System.out.println("\nLet's prompt for some more info...");
        double contractAmount = promptForDouble("Enter the Contract Amount: ", ProfessorAdjunct.MIN_AMOUNT, ProfessorAdjunct.MAX_AMOUNT);
        int months = promptForInt("Enter the number of months:  ", ProfessorAdjunct.MIN_MONTHS, ProfessorAdjunct.MAX_MONTHS);
       
        adjunct.setContractAmount(contractAmount);
        adjunct.setMonths(months);
    
        double pay = adjunct.calcPay();

        System.out.println("\nLet's populate those values and try to calculate the monthly pay...");
        System.out.printf("Monthly pay is: $%.2f \n", pay);
    }
    //------------------------methods------------------------------------------
    public static int promptForInt(String message, int minValue, int maxValue)
    {
        int num = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean isItRight = false;
        String buffer;
        do 
        {
            System.out.print(message);
            buffer = keyboard.nextLine(); 
           //check of it's blank
            if(buffer.isBlank())
            {
                System.err.println("The value must not be blank. Please try again");
            }
            else
            {
                try
                {
                    //convert if it can be converted
                    num = Integer.parseInt(buffer);
                    //check if within range
                    if(num < minValue || num > maxValue)
                    {
                        System.err.println("Invalid value. The acceptable range is " +
                                "between " + minValue + " and " + maxValue
                                + " Please try again.");  
                    }
                    else
                    {
                        isItRight = true;
                    }
                }
                catch (Exception ex)
                    {
                        System.err.printf("Could not convert your input to a valid "                            
                                + "number. Please try again\n%s\n", ex.toString());
                    }
            } 
        } while (isItRight == false);
        return num;
    }
    public static double promptForDouble(String message, double minValue, double maxValue)
    {
        double num = 0.0;
        Scanner keyboard = new Scanner(System.in);
        boolean isItRight = false;
        String buffer;
        do 
        {
            System.out.print(message);
            buffer = keyboard.nextLine(); 
           //check of it's blank
            if(buffer.isBlank())
            {
                System.err.printf("The value must not be blank. Please try again");
            }
            else
            {
                try
                {
                    //convert if it can be converted
                    num = Double.parseDouble(buffer);
                    //check if within range
                    if(num < minValue || num > maxValue)
                    {
                        System.err.println("Invalid value. The acceptable range is " +
                                "between " + minValue + " and " + maxValue
                                + " Please try again");   
                    }
                    else
                    {
                        isItRight = true;
                    }  
                }
                catch (Exception ex)
                    {
                        System.err.printf("Could not convert your input to a valid "                            
                                + "number. Please try again\n%s\n", ex.toString());
                    }
            }
         
        } while (isItRight == false);
        return num;
    }
    public static String promptForString(String message)
    {
        String output;
        Scanner keyboard = new Scanner(System.in);
        boolean isItRight = false;
        do 
        {
            System.out.print(message);
            output = keyboard.nextLine(); 
            if(output == null ||output.isBlank())
            {
              System.err.println("Invalid input. Cannot be empty.");  
            }
            else
            {
                isItRight = true;
            }   
        } while (isItRight == false);
        return output;
    }
}
