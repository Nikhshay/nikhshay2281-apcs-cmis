package ClassCompositionBigProblems;
import java.util.ArrayList;


public class gpsSoftwareDriver
{
    public static void main (String[] arg)
    {
        gpsSoftware Something = new gpsSoftware();
        System.out.print(Something);
        
        
        ArrayList<Integer> markers = new ArrayList<Integer>();
        markers.add(1234567890);
        markers.add(90000000);
        markers.add(900000000);
        markers.add(90000000);
        markers.add(9000000);
        markers.add(900000);
        markers.add(90000);
        markers.add(9000);
        markers.add(900);
        markers.add(90);
        markers.add(9);
        markers.add(6);
        markers.add(3);
        gpsSoftware SomethingA = new gpsSoftware(markers);
        System.out.print(SomethingA);
    }
}