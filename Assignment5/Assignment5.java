package assignment5;
import java.util.ArrayList;
import java.util.Scanner;
/*
** Charisse Giles
** Assginment 4
** 11/5/2020
*/
public class Assignment5
{
    public static void main(String[] args)
    {
        //title
        System.out.println("Welcome to Assignment5");
        System.out.println("Part 1"); 
        //get professor ID
        int profID;
        profID = promptForInt("Enter the professor ID: ", Professor.MIN_PROF_ID, Professor.MAX_PROF_ID);        
        //get professor name
        String name;
        System.out.print("Enter the professor's name: ");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();       
        //get ProfType
        Professor.ProfType type;
        type = promptForProfType("Enter the type of professor: ");         
        //create prof1 object
        Professor prof1 = new Professor(profID, name, type);       
        //call toString from Professor class
        System.out.println("toString() yeilds: " + prof1.toString());
        System.out.println();      
        //get semester
        ClassSchedule.Semester sem;
        sem = promptForSemester("Enter the Semester: ");       
        //get class ID
        String classID;
        System.out.print("Enter the classID: ");
        classID = keyboard.nextLine();    
        //create class1 object
        ClassSchedule class1 = new ClassSchedule(sem, classID, prof1); 
        System.out.println("Let's use the professor object above...");
        //call toString from ClassSchedule class
        System.out.println("toString() yeilds: " + class1.toString());
        System.out.println();            
        System.out.println("Part2");  
        //get target and search texts
        String text, searchText;
        System.out.print("Enter some text to search against: ");
        text = keyboard.nextLine();
        System.out.print("Enter the search text: ");
        searchText = keyboard.nextLine();  
        //output the items from an array
        for(int i :find(text, searchText))
        {
            System.out.println(i);
        }
    }
    //----------------------------methods------------------------------------------
    public static ArrayList<Integer> find(String targetString, String searchString)
    {
        ArrayList<Integer> indexOfSearch = new ArrayList<>();
        int index = targetString.indexOf(searchString);
        //loop that adds index in indexOfSearch array
        while(index >= 0)
        {
            indexOfSearch.add(index);
            index = targetString.indexOf(searchString, index+1);   
        }
        return indexOfSearch;
    }
    public static int promptForInt(String message, int minValue, int maxValue)
    {
        int num = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean isItRight = false;
        do 
        {
            System.out.print(message);
            num = Integer.parseInt(keyboard.nextLine()); 
            if(num < minValue || num > maxValue)
            {
              System.err.println("Invalid value. The acceptable range is between " + minValue + " and " + maxValue);  
            }
            else
            {
                isItRight = true;
            }   
        } while (isItRight == false);
        return num;
    }
    public static ClassSchedule.Semester promptForSemester(String message)
    {
        ClassSchedule.Semester answer = null;
        boolean gotIt;
        Scanner keyboard = new Scanner(System.in);
        String input; 
        do 
        {
            gotIt = false;          
            System.out.print(message);
            input = keyboard.nextLine();  
            //compare user input to enum values
            for (ClassSchedule.Semester a : ClassSchedule.Semester.values())
            {
                if(input.equalsIgnoreCase(a.toString()))
                {
                    gotIt = true;
                    answer = a;
                    break;
                }
            }
            if(!gotIt)
            {
                System.err.println("Not a valid semester. Please try again.");
            }
        }while(!gotIt);     
        return answer;
    } 
    public static Professor.ProfType promptForProfType(String message)
    {
        Professor.ProfType answer = null;
        boolean gotIt;
        Scanner keyboard = new Scanner(System.in);
        String input;  
        do 
        {
            gotIt = false;         
            System.out.print(message);
            input = keyboard.nextLine(); 
            //compare user input to enum values
            for (Professor.ProfType a : Professor.ProfType.values())
            {
                if(input.equalsIgnoreCase(a.toString()))
                {
                    gotIt = true;
                    answer = a;
                    break;
                }
            }
            if(!gotIt)
            {
                System.err.println("Not a valid professor type. Please try again.");
            }
        }while(!gotIt);
        return answer;
    }
}
