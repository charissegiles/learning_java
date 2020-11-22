package assignment6;
/*
** Charisse Giles
** Assginment 6
** 11/20/2020
*/
public abstract class Professor
{
     //----------variables----------------------
    public static final int MIN_PROF_ID = 100;
    public static final int MAX_PROF_ID = 2000;
    
    private int pfvProfID;
    private String pfvFirstName;
    private String pfvLastName;

    //--------default constructor---------
    public Professor()
    {      
    }
    //-------------parameterized constructor----------------
    @SuppressWarnings("OverridableMethodCallInConstructor")
     public Professor(int profID, String firstName, String lastName) throws Exception 
    {
        setProfID(profID);
        setFirstName(firstName);
        setLastName(lastName);      
    }    
    //------------------setters and getters---------------
    public void setProfID(int profID) throws Exception
    {
        if(profID < MIN_PROF_ID || profID > MAX_PROF_ID)
        {
            throw new Exception("Invalid value. The acceptable range is between " + MIN_PROF_ID + " and " + MAX_PROF_ID);
        }
        pfvProfID = profID;
    }   
    public int getProfID()
    {
        return pfvProfID;
    }   
    public void setFirstName(String firstName) throws Exception
    {
        if(firstName == null || firstName.isBlank())
        {
            throw new Exception("First name can not be empty");
        }
        pfvFirstName = firstName;
    }   
    public String getFirstName()
    {
        return pfvFirstName;
    } 
    public void setLastName(String lastName) throws Exception
    {
        if(lastName == null || lastName.isBlank())
        {
            throw new Exception("Last name can not be empty");
        }
        pfvLastName = lastName;
    }   
    public String getLastName()
    {
        return pfvLastName;
    } 
    //-------------------------methods--------------------------
    @Override
     public String toString()
    {
        String answer = String.format("ProfID=%d, FirstName=%s, LastName=%s", pfvProfID, pfvFirstName, pfvLastName);
        return answer;
    }    
}
