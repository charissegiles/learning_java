package assignment5;

/*
** Charisse Giles
** Assginment 4
** 11/5/2020
*/
public class ClassSchedule
{
    //variables
    private String pfvClassID;
    private Semester pfvSemester;
    private Professor pfvProfessor;
    //enum
    public enum Semester
    {
        SPRING_2020,
        SUMMER_2020,
        FALL_2020
    }
    //default constructor
    public ClassSchedule()
    {   
    }
    //parameterized constructor
    public ClassSchedule(Semester sem, String classID, Professor prof)
    {
        setSemester(sem);
        setClassID(classID);
        setProfessor(prof);
    }    
     //setters and getters
    public void setSemester(Semester sem)
    {
        pfvSemester = sem;
    }
    public Semester getSemester()
    {
        return pfvSemester;
    }    
    public void setClassID(String classID)
    {
        if(classID == null || classID.isBlank())
        {
            System.err.println("ClassID can not be empty");
            return;
        }
        pfvClassID = classID;
    }
    public String getClassID()
    {
        return pfvClassID;
    }
    public void setProfessor(Professor prof)
    {
        pfvProfessor = prof.copy();
    }
    public Professor getProfessor()
    {
        return pfvProfessor;
    }
    //toString() method
    @Override
    public String toString()
    {
        String answer = String.format("Semester=%s, ClassID=%s, ProfID=%s", pfvSemester, pfvClassID, pfvProfessor.getProfID());
        return answer;
    }  
}
