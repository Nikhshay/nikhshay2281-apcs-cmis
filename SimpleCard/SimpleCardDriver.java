package SimpleCard;

public class SimpleCardDriver
{
    public static void main (String[] arg)
    {
     SimpleCard[] myHand = new SimpleCard [52];
     String[] allRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
     String[] allSuit = {"clubs", "spades", "diamonds", "hearts"};

     for( int i = 0 ; i < myHand.length; i++)
     {
         System.out.print(i + " " );
         myHand[i] = new SimpleCard( allRank[i % 13] , allSuit[i % 4] );
         System.out.println(myHand[i]);
    }
  }
}