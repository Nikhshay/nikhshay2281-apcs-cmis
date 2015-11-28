package ClassDesignP2;

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
    
    public String toString()
    {
        String output = String.format( 
                "hour: %d\n" +
                "Minutes: %d\n" +
                "Seconds: %d\n"  + 
                "Time in Seconds:  %d", hour ,minutes ,seconds, sec); 

        return output;
    }
    
    public int getHour()
    {
        return hour;
    }
    
    public void setHour (int hour)
    {
        this.hour = hour;
    }
    
    public int getMinutes()
    {
        return minutes;
    }
    
    public void setMinutes (int minutes)
    {
        this.minutes = minutes;
    }
    
    public int getSeconds()
    {
        return seconds;
    }
    
    public void setSeconds (int seconds)
    {
        this.seconds = seconds;
    }
    
    public int totalSeconds()
    {
         sec = (hour * 3600) + (minutes * 60) + seconds;
         return sec;
    }
    
    public int convertDaylightSaving(int hours)
    {
        hour = hours + hour;
        return hour;
    }

}