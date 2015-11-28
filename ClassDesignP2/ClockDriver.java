package ClassDesignP2;
import javax.swing.JOptionPane; 

public class ClockDriver
{
    public static void main (String[] arg)
    {
       int hour = Integer.parseInt(JOptionPane.showInputDialog("What the hour?"));
       int min = Integer.parseInt(JOptionPane.showInputDialog("What the minute?"));
       int sec = Integer.parseInt(JOptionPane.showInputDialog("What the seconds?"));

        Clock bedroomClock = new Clock();
        
        Clock kitchenClock = new Clock( hour , min , sec );
        
        System.out.println(bedroomClock);
        System.out.println(kitchenClock);
    }
}
