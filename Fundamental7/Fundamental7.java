package Fundamental7;

import javax.swing.JOptionPane;

public class Fundamental7
    {
     public static void main (String[] args )
        {
        int[] myArray = new int[10];
        int neg = 0;
        for( int index = 0; index < myArray.length; index++ )
        {
            myArray[index] = (int) (Math.random()*100);
            if ( myArray[index] < 50)
            {
                 neg = myArray[index] * -1 ; 
                 System.out.print(neg + " ");
                }
            else
            {
                  System.out.print(myArray[index] + " ");
                 }
        }
        }   
       //while (index2 < myArray.length)
       //{
           //System.out.println(myArray[index2] + " ");
           //myArray[index2]++;
        //}
       //if (myArray[index] > 0)
       //{
       //    System.out.println(myArray[index2]);
       // }
        } // end method main
        
     // end class Fundamental7

        