package TestOne;

import javax.swing.JOptionPane;

public class TestOne
    {
     public static void main (String[] args )
        {
        
        String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
        int num1 = Integer.parseInt( input1 );
         
        int[] myArray = new int[num1];
        int b = 0;
        
        for( int index = 0; index < myArray.length; index++ )
        {
            myArray[index] = (int)((Math.random() * 510000000));
           
            b = myArray[index] / 10000000;
            System.out.println("["+index+"]" +  b);
            }
        } 
         
      int index2 = ;
        {
        while (index2 > myArray.length)
        {
            System.out.println("["+index+"]" + myArray[index2] );
            index2--;
        }
        for ( int index = 0; index < myArray.length; index++ )
        {
            modulo = myArray[index] % 2; 
            if ( modulo == one  )
            {
            System.out.println( "The number " + num1 + " is odd" );
             }
            else
            {
            System.out.println( "The number " + num1 + " is even" );        
            }
        }
    }
}
