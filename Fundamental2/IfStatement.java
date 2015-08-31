package Fundamental2;

import javax.swing.JOptionPane;

public class IfStatement
    {
     public static void main (String[] args )
        {
        String input1 = JOptionPane.showInputDialog( " What is your first number? " );
        String input2 = JOptionPane.showInputDialog( " What is your second number? " );
         
         int num1 = Integer.parseInt( input1 );
         int num2 = Integer.parseInt( input2 );
         
        if ( num1 > num2 )
            {
            System.out.println( "The value of the first number is " + num1 + " and it is more than the second number whose value is " + num2 );
            }
        if ( num2 > num1 )
            {
             System.out.println( "The value of the second number is " + num2 + " and it is greater than the first number whose value is " + num1 );
            }
        if ( num1 == num2 )
            {
             System.out.println( "The value of the first number is " + num1 + " and it is equal to the second number whose value is " + num2 );
            }
        } // end method main
        
    } // end class IfStatement
