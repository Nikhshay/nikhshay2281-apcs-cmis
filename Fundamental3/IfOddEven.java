package Fundamental3;

import javax.swing.JOptionPane;

public class IfOddEven
    {
     public static void main (String[] args )
        {
        int modulo = 0;
        int one = 1;
        
        String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
        int num1 = Integer.parseInt( input1 );
         
        modulo = num1 % 2;
         
        if ( modulo == one  )
            {
            System.out.println( "The number " + num1 + " is odd" );
        }
        else
            {
            System.out.println( "The number " + num1 + " is even" );        
            }    
        } // end method main
        
    } // end class IfOddEven
