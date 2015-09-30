package ClassDesignP2;

public class Clock
{
    private int hour;
    private int minutes;
    private int seconds;
    
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
   
    public String toString()
    {
        String output = new String();
        output = "The time is: " + hour + " : " + minutes + " : " + seconds + " .";
        return output;
    }
    
    
}