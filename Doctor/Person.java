package Doctor;
public class Person
{
    private String name;
    private String yob;
    private String mob;
    private String dob;
    
    public Person(String name, String yob, String mob, String dob)
    {
        this.name = name;
        this.yob = yob;
        this.mob = mob;
        this.dob = dob;
    }

    public String toString()
    {
        return String.format("Name: %s\nYOB: %s\nMOB: %s\nDOB: %s", name, yob, mob, dob);
    }

}