package ClassCompositionP3;

public class Roster
{
    private ;
    
    public Roster()
    {
        clockInStore[0] = new Clock( 12, 30, 45 );
        clockInStore[1] = new Clock( 9, 47, 35 );
        clockInStore[2] = new Clock( 3, 29, 22 );
    }
    
    
    public String toString()
    {
        String output = "Most seconds: " + mostSeconds() + "\n" ; 

        for (Clock clock : clockInStore)
        {
            output += clock + "\n";
        }
        
        return output;
    }
}