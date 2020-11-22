package assignment6;
/*
** Charisse Giles
** Assginment 6
** 11/20/2020
*/

//inherits from Professor class
public class ProfessorAdjunct extends Professor 
{
    //------------variables-------------------
    public static final double MIN_AMOUNT = 3000.0;
    public static final double MAX_AMOUNT = 12000.0;
    public static final int MIN_MONTHS = 3;
    public static final int MAX_MONTHS = 12;
    private double pfvContractAmount;
    private int pfvMonths;
    //-----------default constructor-----------------
    public ProfessorAdjunct() 
    {
    }
    //----------parameterize constructor---------------------------------
    public ProfessorAdjunct(int profID, String firstName, String lastName) throws Exception 
    {
        //call the constructor from the superclass
        super(profID, firstName, lastName);
    }
    //-----------getters & setters --------------------------------------
    public double getContractAmount() 
    {
        return pfvContractAmount;
    }
    public void setContractAmount(double amount) throws Exception
    {
        if(amount < MIN_AMOUNT || amount > MAX_AMOUNT)
        {
            throw new Exception("Contract amount must be set"); //check this
        } 
        pfvContractAmount = amount;
    }
    public double getMonths() 
    {
        return pfvMonths;
    }
    public void setMonths(int months) throws Exception
    {
        if(months < MIN_MONTHS || months > MAX_MONTHS)
        {
            throw new Exception("Out of range. Valid range is between " +
                    MIN_MONTHS + " and " + MAX_MONTHS); //check
        }
        pfvMonths = months;
    }    
    //------------------methods-------------------------------------
    public double calcPay() throws Exception //sanity check here maybe
    {
        double pay;
        //------------sanity check------------------------
        if(pfvContractAmount < MIN_AMOUNT || pfvContractAmount > MAX_AMOUNT)
        {
            throw new Exception("Contract amount not set.");
        }
        if(pfvMonths < MIN_MONTHS || pfvMonths > MAX_MONTHS)
        {
            throw new Exception("Months not set.");
        }
        else
        {
            pay = pfvContractAmount / pfvMonths;
        }
         return pay;
    }
    @Override
     public String toString()
    {
        String answer = super.toString();
        answer += ", Type=Adjunct";
        return answer;
    }    
}