package ClassDesignP5;

public class CardDriver2
{
    public static void main (String[] arg)
    {
     String[] myHand = new String [3];
     String[] allRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
     String[] allSuit = {"clubs", "spades", "diamonds", "hearts"};
     
     Card gameA = new Card( );
     System.out.println(gameA);
     for( int i = 0 ; i <myHand.length; i++)
     {
         int a = ((int) (Math.random()*13));
         int b = ((int) (Math.random()*4));
         //myHand[i] = allRank[a] + allSuit[b];
         Card gameB = new Card( allRank[a], allSuit[b] );

         System.out.println(gameB);
        }

    }
}