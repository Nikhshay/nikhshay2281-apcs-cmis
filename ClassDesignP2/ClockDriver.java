package ClassDesignP2;

public class ClockDriver
{
    public static void main (String[] arg)
    {
        Clock bedroomClock = new Clock();
        
        Clock kitchenClock = new Clock( 24 , 00 , 00 );
        
        System.out.println(bedroomClock);
        System.out.println(kitchenClock);
        
    }
}
  // make j option pane for the kitten clock