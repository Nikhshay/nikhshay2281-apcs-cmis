package IfThreeNum;

import javax.swing.JOptionPane;

public class IfThreeNum
    {
     public static void main (String[] args )
        {
        int modulo = 0;
        int one = 1;
        
        String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
        int num1 = Integer.parseInt( input1 );
         
         
        if ( modulo == one  )
            {
            System.out.println( "The number " + num1 + " is odd" );
        }
        else
            {
            System.out.println( "The number " + num1 + " is even" );        
            }    
        } // end method main
        
    } // end class IfThreeNum
