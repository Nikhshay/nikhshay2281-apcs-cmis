package ClassDesignP6;

public class CardDriver2
{
    public static void main (String[] arg)
    {
        int Worth = 0;
        int TotalWorth = 0;
        
        String[] allRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] allSuit = {"clubs", "spades", "diamonds", "hearts"};
     
        Card[] Dealer = new Card [2];
        
       for( int z = 1; z < 2; z++)
       {
       for( int i = 0; i < Dealer.length; i++)
       {
          int a = ((int) (Math.random()*13));
          int b = ((int) (Math.random()*4));
          Dealer[i] = new Card( allRank[a], allSuit[b] );         
          System.out.print("Dealer card ");
          System.out.print( i+1 );
          System.out.print(" : " + Dealer[i] + "\n");

           if (allRank[a]  == ("A") )
             {
                Worth = 11;
            }
            else if (allRank[a]  == ("2") )
             {
                Worth = 2;
             }   
            else if (allRank[a]  == ("3") )
             {
                Worth = 3;
             }   
           else if (allRank[a]  == ("4") )
             {
                Worth = 4;
             }    
           else if (allRank[a]  == ("5") )
             {
                Worth = 5;
             }   
            else if (allRank[a]  == ("6") )
             {
                Worth = 6;
             }   
           else if (allRank[a]  == ("7") )
             {
                Worth = 7;
             }       
             else if (allRank[a]  == ("8") )
             {
                Worth = 8;
             }   
            else if (allRank[a]  == ("9") )
             {
                Worth = 9;
             }   
           else if (allRank[a]  == ("10") )
             {
                Worth = 10;
             }     
           else if (allRank[a]  == ("J") || allRank[a]  ==("Q") || allRank[a]  ==("K") )
             {
                Worth = 10;
            }
           TotalWorth += Worth;
           if (TotalWorth == 21)
           {
               System.out.println( "You are the winner!)"); 
            }
        }
       System.out.println( "\n" + "Points in hand " + TotalWorth + "\n");
      }
            
           
        
        }
    }