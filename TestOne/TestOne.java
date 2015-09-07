package TestOne;

import javax.swing.JOptionPane;

public class TestOne
    {
     public static void main (String[] args )
        {
        
        String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
        int num1 = Integer.parseInt( input1 );
         
        double[] myArray = new double[num1];
        double b = 0;
        
        for( int index = 0; index < myArray.length; index++ )
        {
            myArray[index] = (double) (Math.random() * 51); 

            System.out.println("["+index+"]" + myArray[index]);
            }// end making decimal number // end making decimal number 
       
        int index2 = num1;
        
        while (index2 > myArray.length)
           {
            System.out.println("["+index2+"]" + myArray[index2] );
            index2--;
        }
            
          int  modulo = 0;
          int one = 1;  
          
          
          for ( int index3 = 0; index3 < myArray.length; index3++ )
           {
            modulo = (int)(myArray[index3]) % 2; 
            if ( modulo == one  )
            {
              System.out.println( "E" + myArray[index3] );
             }
            else
            {
              System.out.println( "O" + myArray[index3] );        
            }
            
          }
  }
}
