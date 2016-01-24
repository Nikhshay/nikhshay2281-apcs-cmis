package ClassCompositionP1;
import java.util.ArrayList;

public class MyPod
{
    private String color;
    private int memory;
    private ArrayList<String> songLibrary = new ArrayList<String>(3);
    
    
    public MyPod()
    {
        color = "Blue";
        memory = 3;
        songLibrary.add("Hotline Bling");
        songLibrary.add("See you again");
        songLibrary.add("Watch me");
    }

    public MyPod(String color, int memory, String song, String song1, String song2)
    {
            this.color= color;
            this.memory= memory;
            this.songLibrary.add(song);
            this.songLibrary.add(song1);
            this.songLibrary.add(song2);
        
    }
    
    public String toString()
    {
        String output = new String();
        output = "The color is: " + color + "\n" +
                 "The memory  is: " + memory + "\n" +
                 "The song is: " + songLibrary ;
        return output;
    }
}
