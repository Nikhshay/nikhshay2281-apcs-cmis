package IfStatement;

import javax.swing.JOptionPane;

public class IfStatement
    {
     public static void main (String[] args )
        {
        int psum1 = 0;

         
         String input1 = JOptionPane.showInputDialog( " What is your first number? " );
         String input2 = JOptionPane.showInputDialog( " What is your second number? " );
         
         int num1 = Integer.parseInt( input1 );
         int num2 = Integer.parseInt( input2 );
  
         If num1 > num2;
         
         System.out.println( num1 + " + " + num2 + " = " + psum1 );
         
        } // end method main
        
    } // end class IfStatement
