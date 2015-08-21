package IfOddEven;

import javax.swing.JOptionPane;

public class IfOddEven
    {
     public static void main (String[] args )
        {
        String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
         float num1 = Integer.parseInt( input1 );
         
        if ( num1  )
            {
            System.out.println( "The number " + num1 + "is even" );
        }
        else
            {
            System.out.println( "The number " + num1 + "is odd" );        
            }    
        } // end method main
        
    } // end class IfOddEven
