package InputData;

import javax.swing.JOptionPane;

public class InputData
    {
     public static void main (String[] args )
        {
         String input = JOptionPane.showInputDialog( "Press 1 for Monday \n" +
                                                     "Press 2 for Tuesday" );
         System.out.println( input );
         
        } // end method main
        
    } // end class InputData