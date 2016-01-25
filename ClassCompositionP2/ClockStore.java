package ClassCompositionP2;

public class ClockStore
{
    private Clock[] clockInStore = new Clock[3];
    
    public ClockStore()
    {
        clockInStore[0] = new Clock( 12, 30, 45 );
        clockInStore[1] = new Clock( 9, 47, 35 );
        clockInStore[2] = new Clock( 3, 29, 22 );
    }
    
    public Clock mostSeconds()
    {
        int mostseconds = 0;
        int mostclock = 0;
        
        for (int i = 0; i < clockInStore.length; i++)
        {
            if ( clockInStore[i].totalSeconds() > mostseconds)
            {
                mostclock = i;
                mostseconds = clockInStore[i].totalSeconds();
            }                        
        }
        
        return clockInStore[mostclock];
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
