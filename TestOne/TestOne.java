package TestOne;

import javax.swing.JOptionPane;

public class TestOne
    {
     public static void main (String[] args )
        {
        
        String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
        int num1 = Integer.parseInt( input1 );
         
        int[] myArray = new int[num1];
        double b = 0;
        
        for( int index = 0; index < myArray.length; index++ )
        {
            myArray[index] = (int)((Math.random() * (51-0)+10));
           
            b = myArray[index] / 10;
            System.out.println("["+index+"]" +  b);
            }// end making decimal number 
       
           int index2 = num1;
        
          while (index2 > myArray.length)
           {
            System.out.println("["+index2+"]" + myArray[index2] );
            index2--;
            }
            
          int  modulo = 0;
          int one = 1;  
          
          for ( int index = 0; index < myArray.length; index++ )
           {
            modulo = myArray[index] % 2; 
            if ( modulo == one  )
            {
              System.out.println( "E" + myArray[index] );
             }
            else
            {
              System.out.println( "O" + myArray[index] );        
            }
            
          }
  }
}
