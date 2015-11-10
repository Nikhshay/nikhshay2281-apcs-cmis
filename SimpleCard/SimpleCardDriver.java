package SimpleCard;

public class SimpleCardDriver
{
    public static void main (String[] arg)
    {
     int a = 1;
     int b = 1;
     String rank = "";
     String suit = "";
     String[] myHand = new String [52];
     String[] allRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
     String[] allSuit = {"clubs", "spades", "diamonds", "hearts"};

     for( int i = 1 ; i < myHand.length; i++)
     {
         for( int d = 1 ; d < allRank.length; d++)
         {
             rank = allRank[d];
             System.out.print(rank);
      }
         for( int c = 1 ; c < allSuit.length; c++)
         {
             suit = allSuit[c];
             System.out.print(suit);
      }
      System.out.print("\n");
      
    }
  }
}
//SimpleCard gameB = new SimpleCard( rank, suit );
      //System.out.println(gameB);