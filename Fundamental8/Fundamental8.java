package Fundamental8;

import javax.swing.JOptionPane;

public class Fundamental8
    {
     public static void main (String[] args )
        {
            int b = 0;
            
       String [] myArray = {"Shakira", "Ed Sheeran", "Calvin Harris"};
         
        for (int a = 0; a < myArray.length; a++)
        {
            System.out.println(myArray[a] );
       }
       
       myArray[(int) (Math.random() * 4)] = "Michael Jackson";
       
       for ( b =  0; b < myArray.length; b++ )
           {
               System.out.println(myArray[b]);
            }
       
       for (b =  0; b < myArray.length; b++)
       {
           if( b == "Michael Jackson" )
           {
               System.out.println("MIchael Jackson have arrived");
            }
            else
           {    
               sdf
            }
        }
        }
        } // end method main
        
    // end class Fundamental8

        