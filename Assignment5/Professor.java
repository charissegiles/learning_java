package assignment5;

/*
** Charisse Giles
** Assginment 4
** 11/5/2020
*/
public class Professor
{
     //variables
    public static final int MIN_PROF_ID = 100;
    public static final int MAX_PROF_ID = 2000;
    private static int pfvProfID;
    private static String pfvName;
    private static ProfType pfvType;
    //enum
    public enum ProfType
    {
        ADJUNCT,
        ASSOCIATE_PROFESSOR,
        ASSISTANT_PROFESSOR,
        PROFESSOR
    }
    //default constructor
    public Professor()
    {      
    }
    //parameterized constructor
     public Professor(int profID, String name, ProfType type)
    {
         setProfID(profID);
         setName(name);
         setType(type);        
    }    
    //setters and getters
    public void setProfID(int profID)
    {
        if(profID < MIN_PROF_ID || profID > MAX_PROF_ID)
        {
            System.err.println("Invalid value. The acceptable range is between " + MIN_PROF_ID + " and " + MAX_PROF_ID);
        }
        pfvProfID = profID;
    }   
    public int getProfID()
    {
        return pfvProfID;
    }   
    public void setName(String name)
    {
        if(name == null || name.isBlank())
        {
            System.err.println("Name can not be empty");
            return;
        }
        pfvName = name;
    }   
    public String getName()
    {
        return pfvName;
    } 
    public void setType(ProfType type)
    {        
        pfvType = type;
    }   
    public ProfType getType()
    {
        return pfvType;
    }
    //methods
    @Override
     public String toString()
    {
        String answer = String.format("ProfID=%d, Name=%s, Type=%s", pfvProfID, pfvName, pfvType);
        return answer;
    }    
    public Professor copy()
    {
        Professor answer = new Professor(pfvProfID, pfvName, pfvType);
        return answer;       
    }    
    public boolean equals(Professor prof)
    {
        boolean answer = false;
        if(pfvProfID == prof.getProfID() && pfvName.equals(prof.getName()) && pfvType == prof.getType())
        {
            answer = true;
        }
        return answer;
    }
}
