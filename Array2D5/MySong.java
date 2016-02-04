package Array2D5;

public class MySong
{
    private String song = "";
    private int rating = 0;
    
    public MySong()
    {
       song = "Hi";
       rating = 5;
    }
    
    public MySong(String song, int rating)
    {
       this.song = song;
       this.rating = rating;
    }
    
    public int getRating()
    {
        return rating;
    }
    
    public String toString()
    {
        String output = new String();
        output =
        "The name of the song is: " + song +
        " and its rating is: " + rating;
        return output;
    }
}
