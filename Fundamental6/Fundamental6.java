package Fundamental6;

import javax.swing.JOptionPane;

public class Fundamental6
    {
     public static void main (String[] args )
        {
        int random = 0;
        int[] myArray = new int[50];
        for( int index = 0; index < myArray.length; index++ )
        {
            random = (int) (89 + Math.random());
        }   
       for (int index = 0; index < myArray.length; index++)
       {
           System.out.print(random + " ");
        }
        } // end method main
        
    } // end class Fundamental6

        