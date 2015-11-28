package ClassMethod3;

public class Student
{
    private String fname;
    private String lname;
    private int age;
    private double weight;
    private double english;
    private double math;
    private double science;
    private double fineArts;
    private double socialScience;
    private double[] grade = new double [5];

    
    public Student()
    {
       fname = "DJ";
       lname = "Ketsing";
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
        String output =
        String.format(
                "First name is %s\n" +
                "Last name is  %s\n" +
                "average GPA is %.2f\n", 
                fname, lname,calcGPA());

        return output;
    }
    
    public Student(String fname, String lname, double english, double math, double science, double fineArts, double socialScience)
    {
        this.fname=fname;
        this.lname=lname;
        grade[0] = english;
        grade[1] = math;
        grade[2] = science;
        grade[3] = fineArts;
        grade[4] = socialScience;
    }

    public void setGPA(double english, double math, double science, double fineArts, double socialScience)
    {
        this.grade[0] = english;
        this.grade[1] = math;
        this.grade[2] = science;
        this.grade[3] = fineArts;
    }

    public double calcGPA()
    {
        double GPA = 0.0;
        
        for (int i=0; i< grade.length; i++)
        {
            GPA = grade[i] + GPA;
        }
        
        GPA = GPA/grade.length;
        
        return GPA;

    }

}

