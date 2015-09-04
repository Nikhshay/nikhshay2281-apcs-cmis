package TestOne;

import javax.swing.JOptionPane;

public class TestOne
    {
     public static void main (String[] args )
        {
        
        String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
        int num1 = Integer.parseInt( input1 );
         
        int[] myArray = new int[num1];
        
        for( int index = 0; index < myArray.length; index++ )
        {
            myArray[index] = (int) (((Math.random()*51000000000) / 100000000000.0);
            System.out.println(myArray[index] + " ");
        } 
        } // end method main
        
    } // end class TestOne