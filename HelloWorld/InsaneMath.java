package HelloWorld;

import javax.swing.JOptionPane;

public class InsaneMath
    {
     public static void main (String[] args )
        {
         int sum1 = 0;
         int sum2 = 0;
         int sum3 = 0;
         int sum4 = 0;
         
         String input1 = JOptionPane.showInputDialog( " What is your first number? " );
         String input2 = JOptionPane.showInputDialog( " What is your second number? " );
         
         int num1 = Integer.parseInt( input1 );
         int num2 = Integer.parseInt( input2 );
         
         sum1 = num1 + num2; 
         sum2 = num2 + num1;
         
         System.out.println( sum1 );
         System.out.println( sum2 );
         
        } // end method main
        
    } // end class InsaneMath