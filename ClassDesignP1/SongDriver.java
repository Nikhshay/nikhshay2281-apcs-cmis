package ClassDesignP1;

public class SongDriver
{
    public static void main (String[] arg)
    {
        Song1 SongA = new Song1();
        Song1 SongB = new Song1( "Stay with me", "chill", 214);
        
        System.out.println(SongA);
        System.out.println(SongB);
        
    }
}
