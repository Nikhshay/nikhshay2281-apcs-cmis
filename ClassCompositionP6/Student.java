package ClassCompositionP6;

public class Student
{
    private String fname;
    private String lname;
    private double gpa;
    
    public Student()
    {
       fname = "DJ";
       lname = "Ketsing";
       gpa = 4.00;
    }
    
    public Student( String fname, String lname, double gpa)
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
    
    public String getlname()
    {
        return this.lname;
    }
    
    public String toString()
    {
        String output = new String();
        output = "The Student's name is " + fname + " " + lname + ".\n" + "His gpa is: " + gpa;
        return output;
    }
    
    
}