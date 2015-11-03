package ClassDesignP6;

public class CardDriver2
{
    public static void main (String[] arg)
    {
     String[] allRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
     int[] point = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10 , 10, 10, 11};
     String[] allSuit = {"clubs", "spades", "diamonds", "hearts"};
     
     Card[] Dealer = new Card [2];
     
     System.out.print("Dealer: ");
     for( int i = 0; i < Dealer.length; i++)
       {
        int a = ((int) (Math.random()*13));
        int b = ((int) (Math.random()*4));
        Dealer[i] = new Card( allRank[a], allSuit[b] );
        System.out.print(Dealer[i] + " ");
        
        for(int c = 0; c < allRank.length; c++)
        {
            allRank[c] = Integer.parseInt(allRank[c]);
            System.out.print(allRank[c]);
        
        }

    }
  }
}