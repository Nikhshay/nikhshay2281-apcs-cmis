package ClassCompositionP6;

public class apComputerScienceDriver
{
    public static void main (String[] arg)
    {
        apComputerScience StudentList = new apComputerScience();
        System.out.print(StudentList);
        
        
        Student d = new Student ("Nikhshay", "Lew", 3.52);
        StudentList.addStudent( d );
        System.out.print("After adding" + "\n" + StudentList);
        StudentList.dropStudent( "Lew" );
        System.out.print("After dropping" + "\n" + StudentList);
    }
}