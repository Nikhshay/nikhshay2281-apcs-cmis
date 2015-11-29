package ClassMethod4;

public class Student
{
    private String fname;
    private String lname;
    private String LetterGrade;
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
        this.grade[4] = socialScience;
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
    
    public void setGPA()
    {
        if (calcGPA() >= 4.0)
        {
            LetterGrade = "A";
        }
        else if (calcGPA() >= 3.0)
        {
            LetterGrade = "B";
        }
        else if (calcGPA() >= 2.0)
        {
            LetterGrade = "C";
        }
        else if(calcGPA() >= 1.0)
        {
            LetterGrade = "D";
        }
        else
        {
            LetterGrade = "F";
        }
    }
    
    public String toString()
    {
        String output = String.format(
                "Student’s First Name is: %s\n" +
                "Student’s Last Name is: %s\n" +
                "Student’s Average GPA is: %f\n" +
                "%s's Grade: %s\n" +
                "%.2f" + 
                " %.2f" +
                " %.2f"+ 
                " %.2f" +
                " %.2f", 
                fname, lname, calcGPA(), fname, LetterGrade, grade[0], grade[1], grade[2], grade[3],grade[4]);
        return output;
    }
    }

