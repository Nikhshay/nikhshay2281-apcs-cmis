package ClassDesignP1;

public class Song1
{
    private String title;
    private String genre;
    private int playtime;
    private String title2;
    private String genre2;
    private int playtime2;
    
    public Song1()
    {
        title = new String ( "Summer" );
        genre = new String ( "Electronic" );
        playtime = 300 ;
    }
    
    public Song1( String title, String genre, int playtime )
    {
        this.title = new String ( title );
        this.genre = new String ( genre );
        this.playtime = playtime;
    }
   
    public String toString()
    {
        String output = new String();
        output = "The title of the song is: " + title + "\n" +
                 "The genre of the song is: " + genre + "\n" +
                 "The runtime of the song is: " + playtime + " seconds";
        return output;
    }
    
    
}