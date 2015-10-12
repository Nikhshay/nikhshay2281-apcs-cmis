package ClassDesignP5;

public class Card
{
    private String playername;
    private String gamename;
    private int totalcard;
    private int cardinhand;
    
    public Card( String playername, String gamename )
    {
       this.playername = playername;
       this.gamename = gamename;
       totalcard = 52;
       cardinhand = 3;
    }
   
    public String toString()
    {
        String output = new String();
        output = "Today, " + playername + 
        " is going to play" + gamename + " with us. \n" + 
        "Todays deck has " + totalcard + "cards totally.";
        return output;
    }
    
    
}