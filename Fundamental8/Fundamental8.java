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
           if( myArray[b].equals ( "Michael Jackson") )
           {
               System.out.println("Michael Jackson have arrived");
            }
            else
           {    
               System.out.println("Michael Jackson not found ["+b+"]");
            }
        }
        } // end method main
        } // end class Fundamental8
        
    

        