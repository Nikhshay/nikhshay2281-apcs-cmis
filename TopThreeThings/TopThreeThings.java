package TopThreeThings;

import javax.swing.JOptionPane;

public class TopThreeThings
    {
     public static void main (String[] args )
        {
        
        String[] Movies = {"50 Shades of Grey", "Wolf of Wall Street","Great Gatsby"};
        for ( int index = 0 ; index < Movies.length;index++)
            {
            System.out.println( Movies[index] );
        }
        System.out.println("\n\n");
        
        String[] song = {"Stay with me", " Demons ", " Let her go"};
        int index= 0;
        
        while (index < song.length)
               {
                   System.out.print(song[index] + " , ");
                   index++;
       }
        } // end method main
        
    } // end class TopThreeThings
