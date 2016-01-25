package ClassCompositionP3;

public class Students
{
    private String fname;
    private String lname;
    private double gpa;
    
    public Students()
    {
       fname = "DJ";
       lname = "Ketsing";
       gpa = 4.00;
    }
    
    public Students( String fname, String lname, double gpa)
    {
        this.fname = fname;
        this.lname = lname;
        this.gpa = gpa;
    }
   
    public double getGPA()
    {
        return this.gpa;
    }
    
    public String getName()
    {
        return this.fname + this. lname;
    }
    
    public String toString()
    {
        String output = new String();
        output = "The Student's name is " + fname + " " + lname + ".\n" + "His gpa is: " + gpa;
        return output;
    }
    
    
}