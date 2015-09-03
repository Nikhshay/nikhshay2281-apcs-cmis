package Fundamental7;

import javax.swing.JOptionPane;

public class Fundamental7
    {
     public static void main (String[] args )
        {
        int[] myArray = new int[10];
        int b = 0;
        int c = 0;
        for( int index = 0; index < myArray.length; index++ )
        {
            double a = 0;
             a = Math.random();
            if ( a < 0.5)
            {
                myArray[index] = (int) (Math.random()*100*(-1)); 
                a++;
                b++;
                }
            else
            {
                  myArray[index] = (int) (Math.random()*100);
                  a++;
                  c++;
                 }
        }
           
      
        int  index = 0;

        while ( index < myArray.length )
        {
                System.out.println(myArray[index] + " ");
                index++;
        }
        
        System.out.println ("The number of postivie numbers are" + c + ", and the number of negative numbers are " + b +".");
        
        for (int a = 0; a< myArray.length; a++)
        {
            if (myArray [a] > 0)
        { 
           System.out.print(myArray[a] + "\t" );
        }
       }
        } // end method main
        
    }// end class Fundamental7

        