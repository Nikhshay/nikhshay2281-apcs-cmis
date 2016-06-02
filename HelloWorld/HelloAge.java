package HelloWorld;

import javax.swing.JOptionPane;

public class HelloAge
    {
     public static void main (String[] args )
        {
         String input1 = JOptionPane.showInputDialog( " What is your name? " );
         String input2 = JOptionPane.showInputDialog( " What is your age? " );
         System.out.println( "Hello, " + input1 + " You are " + input2 + " years old." );
         
        } // end method main
        
    } // end class HelloAge