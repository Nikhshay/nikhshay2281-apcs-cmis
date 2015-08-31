package Fundamental4;

import javax.swing.JOptionPane;

public class ForThreeNUmber
    {
     public static void main (String[] args )
        {
        int power = 0;
        int random = 0;
        int one = 1; 
        int two = 2;
        
        for ( int num1 = 1; num1 <= 10; num1++ )
            {
            power = num1 * num1;         
            random = (((int) (Math.random() + num1) * two) - one);
            System.out.println( num1 + "\t" + power + "\t" + random );
        }
        } // end method main
        
    } // end class ForThreeNUmber
