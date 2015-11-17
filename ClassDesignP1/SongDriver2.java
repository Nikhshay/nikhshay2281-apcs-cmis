package ClassDesignP1;

import javax.swing.JOptionPane;

public class SongDriver2
{
    public static void main (String[] arg)
    {
        String input1 = JOptionPane.showInputDialog( " What is your username? " );
        String input2 = JOptionPane.showInputDialog( " What is your password? " );
        int num1 = Integer.parseInt( input2 );
        
        
        
        Song1 SongA = new Song1();
        Song1 SongB = new Song1( "Stay with me", "chill", 214);
        
        System.out.println(SongA);
        System.out.println(SongB);
        
        if (input1.equals ("Nikhshay") && num1 == 2281 ) 
        {
            SongA.getYearReleased();
            SongA.setYearReleased(2019);
        }
        System.out.println(SongA);
    }
}