package Doctor;


public class XTRA extends Doctor
{
    String typeofdoctor;
    int yearsofexperience = 0;
    public XTRA(String name, String yob, String mob, String dob, String schoolName, String university, boolean gapYear, String typeofdoctor, int yearsofexperience)
    {
        super(name, yob, mob, dob, schoolName, university, gapYear);
        this.typeofdoctor = typeofdoctor;
        this.yearsofexperience = yearsofexperience;
    }
    
    public String toString()
    {
        return super.toString() + String.format("\nType of Doctor: %s\nYear of experience: %d", typeofdoctor, yearsofexperience);
    }
}