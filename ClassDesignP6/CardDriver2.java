package ClassDesignP6;

public class CardDriver2
{
    public static void main (String[] arg)
    {
     String[] allRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
     String[] allSuit = {"clubs", "spades", "diamonds", "hearts"};
     
     String[] player1 = new String [2];
     String[] player2 = new String [2];
     String[] player3 = new String [2];
     String[] player4 = new String [2];
     String[] player5 = new String [2];
     String[] dealer = new String [2];
        
     for( int i = 1 ; i < player1.length; i++)
     {
         int a = ((int) (Math.random()*13));
         int b = ((int) (Math.random()*4));
         player1[i] = allRank[a] + allSuit[b];
         
         int c = ((int) (Math.random()*13));
         int d = ((int) (Math.random()*4));
         player2[i] = allRank[c] + allSuit[d];
         
         int e = ((int) (Math.random()*13));
         int f = ((int) (Math.random()*4));
         player3[i] = allRank[e] + allSuit[f];
         
         int g = ((int) (Math.random()*13));
         int h = ((int) (Math.random()*4));
         player4[i] = allRank[g] + allSuit[h];
         
         int m = ((int) (Math.random()*13));
         int j = ((int) (Math.random()*4));
         player5[i] = allRank[m] + allSuit[j];
         
         int k = ((int) (Math.random()*13));
         int l = ((int) (Math.random()*4));
         dealer[i] = allRank[k] + allSuit[l];
        }
        

    }
}