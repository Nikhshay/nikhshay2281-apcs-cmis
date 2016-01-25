package ClassCompositionP4;

import java.util.ArrayList; 

public class Family
   {
    public static void main( String[] args )
       {
        ArrayList<String> Family = new ArrayList<String>(); 
        
        Family.add( "Father: Kanwar" );
        Family.add( "Mother: Dolly" );
        Family.add( "Sister: Nishikah" );
        Family.add( "Me: Nikhshay" );
        System.out.println( "Size of the family: " + Family.size() );
        System.out.println( "Each person in the family name is : ");
        
        for( int i = 0; i < Family.size(); i++ )
           {
            System.out.println(Family.get(i));    
           }
           
       }
       
   }