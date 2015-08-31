package Fundamental1;

public class FavoriteStuff
    {
     public static void main (String args[] )
        {
         String input1 = JOptionPane.showInputDialog( " What is your favorite food? " );
         String input2 = JOptionPane.showInputDialog( " What is your favorite color? " );
         String input3 = JOptionPane.showInputDialog( " What is your favorite movie? " );
         String input4 = JOptionPane.showInputDialog( " What is your favorite musical group? " );
     
         
         System.out.println( "Your favorite food is " + input1 );
         System.out.println( "Your favorite color is " + input2 );
         System.out.println( "Your favorite movie is " + input3 );
         System.out.println( "Your favorite musical group is " + input4 );
        } // end method main
        
    }// end class FavoriteStuff
