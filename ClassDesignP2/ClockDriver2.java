package ClassDesignP2;

public class ClockDriver2
{
    public static void main (String[] arg)
    {
        Clock bedroomClock = new Clock();
        Clock kitchenClock = new Clock( 12, 13, 14 );
        bedroomClock.totalSeconds();
        System.out.println(bedroomClock);
        
        kitchenClock.getHour();
        kitchenClock.setHour(12);
        
        kitchenClock.getMinutes();
        kitchenClock.setMinutes(58);
        
        kitchenClock.getSeconds();
        kitchenClock.setSeconds(25);
        
        kitchenClock.totalSeconds();
        System.out.println(kitchenClock);
        
        
        kitchenClock.convertDaylightSaving(1);
        kitchenClock.totalSeconds();
        System.out.println(kitchenClock);
        
    }
}
