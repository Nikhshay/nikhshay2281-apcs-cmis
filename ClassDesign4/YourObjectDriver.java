package ClassDesign4;

import javax.swing.JOptionPane;
public class YourObjectDriver
{
    public static void main (String[] arg)
    {
        YourObject TeamA = new YourObject();
        
        YourObject TeamB = new YourObject( "Chelsea", "Branislav Ivanović", 0.045 );
        
        System.out.println(TeamA);
        System.out.println(TeamB);
    }
}