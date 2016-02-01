package ClassCompositionBigProblems;
import java.util.ArrayList;


public class gpsSoftwareDriver
{
    public static void main (String[] arg)
    {
        int i= 0;
        gpsSoftware Something = new gpsSoftware();
        System.out.print("index Elevation \n" + Something);
        
        
        ArrayList<Integer> markers = new ArrayList<Integer>();
        markers.add(120);
        markers.add(907);
        markers.add(92);
        markers.add(96);
        markers.add(904);
        markers.add(970);
        markers.add(941);
        markers.add(424);
        markers.add(953);
        markers.add(985);
        markers.add(9581);
        markers.add(624);
        markers.add(347);
        gpsSoftware SomethingA = new gpsSoftware(markers);
        System.out.print("index Elevation \n" + SomethingA);
    }
}