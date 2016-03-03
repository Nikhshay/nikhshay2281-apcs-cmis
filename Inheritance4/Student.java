package Inheritance4;

public abstract class Student

{
    private String firstName;
    private String major;
    private int units;
    
    public Student(String firstName, String major, int units)
    {
        this.firstName = firstName;
        this.major = major;
        this.units = units;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;	
    }
    
    public void setMajor(String major)
    {
        this.major = major;
    }

    public String getMajor()
    {
        return major;	
    }
    
    public void setUnits(int units)
    {
        this.units = units;
    } // end method setSuitColor

    public int getUnits()
    {
        return units;	
    }
    
    public abstract int calculateTuition();
    
    public String toString()
    {
        String output = new String("");
        output = "First name: " + firstName +
        " Major: " + major +
        " Units: " + units +
        " Tuition Price " + calculateTuition();
        return output;
    }

}