package ClassDesignP5;

public class Card
{
    private String rank;
    private String suit;
    
    public Card()
    {
       rank = "A";
       suit = "Spade";
    }
    
    public Card( String rank, String suit )
    {
     this.rank = rank;
     this.suit = suit;
    }
    
    public String toString()
    {
        String output = new String();
        output = "The card is "+ rank + " of " + suit;
        return output;
    }
    
    
}