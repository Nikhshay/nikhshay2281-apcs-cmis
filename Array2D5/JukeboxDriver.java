package Array2D5;

public class JukeboxDriver
{
    public static void main(String[] args)
    {
       Jukebox Songs = new Jukebox();
       System.out.println(Songs);
       System.out.println("Random song: " + Songs.randomSong());
       System.out.println("Songs with the rating of 2: " + Songs.playSongofRating(2));
    }
}