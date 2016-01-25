package ClassCompositionP3;

public class Student
{
    private String fname;
    private String lname;
    private int age;
    private double weight;
    
    public Student()
    {
       fname = "DJ";
       lname = "Ketsing";
       age = 11;
       weight = 79.5;
    }
    
    public Student( String fname, String lname, int age, double weight )
    {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.weight = weight;
    }
   
    public String toString()
    {
        String output = new String();
        output = "The Student's name is " + fname + " " + lname + ".\n" + "He is " + age + " years old. \n" + "His weight is " + weight + " kg.";
        return output;
    }
    
    
}