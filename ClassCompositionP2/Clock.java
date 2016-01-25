package ClassCompositionP2;

public class Clock
{
    private int hour;
    private int minutes;
    private int seconds;
    private int sec;
    
    public Clock()
    {
        hour = 17;
        minutes = 13;
        seconds = 59;
    }
    
    public Clock( int hour, int minutes, int seconds )
    {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int totalSeconds()
    {
        int total = 0;
        int hourInSeconds = hour * 3600;
        int minuteInSeconds = minutes * 60;
        total = hourInSeconds + minuteInSeconds + seconds;
        
        return total;
    }
    
    
    public String toString()
    {
        String output =
                "Time is : " + hour + " , " + minutes + " , " + seconds ; 

        return output;
    }
}