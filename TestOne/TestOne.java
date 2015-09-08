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
            myArray[index] = (double) (Math.random() * (50-1)+1); 
            System.out.println("["+index+"]" + myArray[index]);
            }// end making decimal number // end making decimal number 
       
        int index2 = (myArray.length-1);
        
        while (index2 >= 0)
           {
            int value = (int)(myArray[index2]); 
            if ( value%2==0  )
              {
              String e = ("E");
              
              for (int c = 0; c <= value; c++ )
              {
                e += "E";
               }
               System.out.println( e + myArray[index2] );
            }
            else
            {
               String o = ("O");
              
              for (int d = 0; d <= value; d++ )
              {
                o += "O";
               }
              System.out.println( o + myArray[index2] );
            }
            index2--;
        }
  }
}
