package Fundamental7;

import javax.swing.JOptionPane;

public class Fundamental7
    {
     public static void main (String[] args )
        {
        int random = 0;
        int[] myArray = new int[10];
        int index2 = 0;
        for( int index = 0; index < myArray.length; index++ )
        {
            random = (int) (Math.random() + 75 * -1);
        }   
       for (int index = 0; index < myArray.length; index++)
       {
           System.out.print(random + " ");
        }
       while (index2 < myArray.length)
       {
           System.out.println(random + " ");
           index2++;
        }
       if (random > 0)
       {
           System.out.println(random);
        }
        } // end method main
        
    } // end class Fundamental7

        