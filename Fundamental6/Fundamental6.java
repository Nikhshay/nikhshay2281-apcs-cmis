package Fundamental6;

import javax.swing.JOptionPane;

public class Fundamental6
    {
     public static void main (String[] args )
        {
        int[] myArray = new int[50];
        for( int index = 0; index < myArray.length; index++ )
        {
            myArray[index] = (int) (100 * Math.random());
           
        }   
       for (int index = 0; index < myArray.length; index++)
       {
           System.out.println(myArray[index] + " ");
        }
        } // end method main
        
    } // end class Fundamental6

        