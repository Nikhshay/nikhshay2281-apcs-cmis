package ClassCompositionP6;
import java.util.ArrayList;

public class apComputerScience 
   {
    private ArrayList<Student> myStudents = new ArrayList<Student>();;
   
    public apComputerScience()
       {
        Student a = new Student ("Nikhshay", "Singh", 3.52);
        Student b = new Student ("DJ", "Bling", 3.90);
        Student c = new Student ("Tin", "Ping", 1.82);
        myStudents.add( a );
        myStudents.add( b );
        myStudents.add( c );
       }
    
    public void addStudent ( Student newStudent )
    {
        myStudents.add(newStudent);
    }
    
    public void dropStudent ( String lastName )
    {
        for( int i = 0; i < myStudents.size(); i++)
        {
            if( myStudents.get(i).lname.equals( lastName ))
            {
                Students.remove(i);
                i--;
            }
        }
    }
       
    public String toString()
       {
        String output = new String();
        
        
        for( Student s : myStudents )
           {
            output += s + "\n" + "\n";  
           }
        
        return output;  
       }
       
   }