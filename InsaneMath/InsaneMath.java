import javax.swing.JOptionPane;

public class InsaneMath
    {
     public static void main (String[] args )
        {
         int psum1 = 0;
         int psum2 = 0;
         int nsum3 = 0;
         int nsum4 = 0;
         int product1 = 0;
         int product2 = 0;
         int quotion1 = 0;
         int quotion2 = 0;
         
         String input1 = JOptionPane.showInputDialog( " What is your first number? " );
         String input2 = JOptionPane.showInputDialog( " What is your second number? " );
         
         int num1 = Integer.parseInt( input1 );
         int num2 = Integer.parseInt( input2 );
         
         psum1 = num1 + num2; 
         psum2 = num2 + num1;
         nsum3 = num1 - num2;
         nsum4 = num2 - num1;
         product1 = num1 * num2;
         product2 = num2 * num1;
         quotion1 = num1 / num2;
         quotion2 = num2 / num1;
         
         System.out.println( num1 + " + " + num2 + " = " + psum1 );
         System.out.println( num2 + " + " + num1 + " = " + psum2 );
         System.out.println( num1 + " - " + num2 + " = " + nsum3 );
         System.out.println( num2 + " - " + num1 + " = " + nsum4 );
         System.out.println( num1 + " * " + num2 + " = " + product1 );
         System.out.println( num2 + " * " + num1 + " = " + product2 );
         System.out.println( num1 + " / " + num2 + " = " + quotion1 );
         System.out.println( num2 + " / " + num1 + " = " + quotion2 );         
         
        } // end method main
        
    } // end class InsaneMath