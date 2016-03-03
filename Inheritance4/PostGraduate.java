package Inheritance4;

public class PostGraduate extends Graduate
{

    public PostGraduate(String firstName, String major, int units)
    {
        super(firstName, major, units);
    }

    public int calculateTuition()  
    {
        return getUnits() * 750;
    }
    
    public String toString()
    {
        return super.toString();
    }

}
