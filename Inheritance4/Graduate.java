package Inheritance4;

public class Graduate extends Student
{
    
    public Graduate(String firstName, String major, int units)
    {
        super(firstName, major, units);
    }

    public int calculateTuition()  
    {
        return getUnits() * 500;
    }
    
    public String toString()
    {
        return super.toString();
    }

}
