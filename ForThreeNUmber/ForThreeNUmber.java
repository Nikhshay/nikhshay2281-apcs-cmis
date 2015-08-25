package ForThreeNUmber;

import javax.swing.JOptionPane;

public class ForThreeNUmber
    {
     public static void main (String[] args )
        {
        int power = 0;
        int random = 0;
        
        for ( int num1 = 0; num1 <= 10; num1++ )
            {
            power = num1 * num1;         
            random = Math.random() + power - num1;
            System.out.println( num1 + "\t" + power + "\t" + random );
        }
        } // end method main
        
    } // end class ForThreeNUmber
