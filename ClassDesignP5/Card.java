package ClassDesignP5;

public class Card
{
    private int totalcard;
    private int cardinhand;
    private String myHand;
    
    public Card()
    {
       totalcard = 52;
       cardinhand = 3;
    }
    
    public Card( String myHand )
    {
      this.myHand = myHand;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Todays deck has " + totalcard + "cards totally." +
                  "The " + cardinhand + " cards you got today are: " + myHand;
        return output;
    }
    
    
}