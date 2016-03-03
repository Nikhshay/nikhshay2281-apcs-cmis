package Inheritance4;

public class UnderGrad extends Student
{
    public UnderGrad(String firstName, String major, int units)
    {
        super(firstName, major, units);
    }

    public int calculateTuition()  
    {
        return getUnits() * 250;
    }
    
    public String toString()
    {
        return super.toString();
    }

}