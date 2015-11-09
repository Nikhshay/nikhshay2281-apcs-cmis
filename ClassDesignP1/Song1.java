package ClassDesignP1;

public class Song1
{
    private String title;
    private String genre;
    private int playtime;
    private String title2;
    private String genre2;
    private int playtime2;
    private int yearReleased;
    
    public Song1()
    {
        title = new String ( "Summer" );
        genre = new String ( "Electronic" );
        playtime = 300 ;
        yearReleased = 1760;
    }
    
    public int getYearReleased()
    {
        return yearReleased;
    }
    
    public void setYearReleased (int year)
    {
        this.yearReleased = year;
    }
    
    public Song1( String title, String genre, int playtime )
    {
        this.title = new String ( title );
        this.genre = new String ( genre );
        this.playtime = playtime;
    }
   
    public int playmin()
    {
        int playmin = 0;
        playmin = playtime / 60;
        return playmin;
    }
    
    public int playsec()
    {
        int playsec = 0;
        playsec = playtime % 60;
        return playsec;
    }
    
    public String toString()
    {
        String output = new String();
        output = "The title of the song is: " + title + "\n" +
                 "The genre of the song is: " + genre + "\n" +
                 "The runtime of the song is: " + playmin() + " minutes " + playsec() + " seconds ";
        return output;
    }
    
    
}