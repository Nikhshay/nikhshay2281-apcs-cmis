package ClassCompositionP3;

public class Roster 
   {
    private Students[] Roster;
   
    public Roster()
       {
        this.Roster = new Students[3];
        Roster[0] = new Students( "Nikhshay", "Singh", 3.52 );
        Roster[1] = new Students( "DJ", "Bling", 3.90 );
        Roster[2] = new Students( "Tin", "Ping", 1.82 );
       }
    
    public String findStudentWithMaxGPA() 
       {
        int maximum = 0;
        
        for( int i = 0; i < Roster.length; i++ )
           {
            if( Roster[i].getGPA() > Roster[ maximum ].getGPA() )
            {
             maximum = i;   
            }
           }
           
        return Roster[ maximum ].getName();
           
       }
       
    public String toString()
       {
        String output = new String();
        
        output = "Student with the highest GPA: " + findStudentWithMaxGPA() + "\n\n";
        
        for( Students s : Roster )
           {
            output += s + "\n" + "\n";  
           }
        
        return output;  
       } // end method toString 
       
   } // end class