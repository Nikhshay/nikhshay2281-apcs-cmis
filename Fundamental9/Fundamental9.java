package Fundamental9;

import javax.swing.JOptionPane;

public class Fundamental9
    {
     public static void main (String[] args )
        {
        String input1 = JOptionPane.showInputDialog( " What is your username? " );
        String input2 = JOptionPane.showInputDialog( " What is your password? " );
        int num1 = Integer.parseInt( input2 );
        
        if (input1.equals ("Nikhshay") && num1 == 2281 ) 
        {
            System.out.println("Login successful!");
        }
        else
        {
            System.out.println("Boo hoo login unsuccessful…try againl!");
        }
    }// end method main
         
        } // end class Fundamental9
