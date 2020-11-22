package assignment4;

/*
** Charisse Giles
** Assginment 4
** 10/23/2020
*/

public class GradeBook
{
    //variables
    public static final double MIN_SCORE = 0.0;
    public static final double MAX_SCORE = 100.0;
    public static final int MIN_STUDENTS = 1;
    public static final int MAX_STUDENTS = 20;
    public static final int MIN_QUIZZES = 1;
    public static final int MAX_QUIZZES = 20;
    private int pfvStudents;
    private int pfvQuizzes;
    private double[][] scores;
    
    //default constructor
    public GradeBook()
    {
        pfvStudents = 0;
        pfvQuizzes = 0;
    }    
    //parameterized constructor
    public GradeBook(int students, int quizzes)
    {
       setStudents(students);
       setQuizzes(quizzes);
       scores = new double[pfvStudents][pfvQuizzes];
    }    
    //----------------Setters---------------------------------------------    
    public void setStudents(int students)
    {
        //input valiation
        if(students < MIN_STUDENTS && students > MAX_STUDENTS)
        {
            System.err.println("The number of students must be between 1 and 20");
        }
        pfvStudents = students;
    }
    
    public void setQuizzes(int quizzes)
    {
        //input valiation
        if(quizzes < MIN_QUIZZES && quizzes > MAX_QUIZZES)
        {
            System.err.println("The number of quizzes must be between 1 and 20");
        }
        pfvQuizzes = quizzes;
    }    
    //-------------------Getters------------------------------------------
    public int getStudents()
    {
        return pfvStudents;
    }
    
    public int getQuizzes()
    {
        return pfvQuizzes;
    }    
    //---------------------methods-----------------------------------------    
    public void inputGrades(int studentNum, int quizNum, double score)
    {
        scores[studentNum][quizNum] = score;
    }//end of inputGrades
    
    public double calcAvgScore()
    {
        double avgScore = 0.0;
        double total = 0.0;
        int count = 0;
        //reads and adds elemets in a 2D array to get total
        for (int row = 0; row < scores.length; row++)
        {
            for(int col = 0; col < scores[row].length; col++)
            {
                total += scores[row][col];
                count++;
            } 
        }       
        //calculate avg
        avgScore = total / count;      
        return avgScore;
    }// end of calcAvgScore   
}// end of class
