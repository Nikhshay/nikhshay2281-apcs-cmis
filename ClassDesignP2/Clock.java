package ClassDesignP2;

public class Clock
{
    private int hour;
    private int minutes;
    private int seconds;
    private int convertDaylightSaving;
    
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
    
    public int getHour()
    {
        return hour;
    }
    
    public void setHour (int hours)
    {
        this.hour = hours;
    }
    
    public int getMinutes()
    {
        return minutes;
    }
    
    public void setMinutes (int min)
    {
        this.minutes = min;
    }
    
    public int getSeconds()
    {
        return seconds;
    }
    
    public void setSeconds (int sec)
    {
        this.seconds = sec;
    }
    
    public int convertDaylightSaving()
    {
        if (//something equal “Springing forward”)
        {
            hour -= 1
        }
        else 
        {
            hour += 1
        }
    }

    public String toString()
    {
        String output = new String();
        output = "The time is: " + hour + " : " + minutes + " : " + seconds + " .";
        return output;
    }
    
    
}