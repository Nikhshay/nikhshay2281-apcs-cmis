package ClassCompositionBigProblems;
import java.util.ArrayList;

public class gpsSoftware
   {
    private ArrayList<Integer> markers = new ArrayList<Integer>();
    int i;
    public gpsSoftware()
       {
         markers.add(1234567890);
         markers.add(1000000000);
         markers.add(100000000);
         markers.add(10000000);
         markers.add(1000000);
         markers.add(100000);
         markers.add(10000);
         markers.add(1000);
         markers.add(100);
         markers.add(10);
         markers.add(5);
         markers.add(3);
         markers.add(1);
       }
    
    public gpsSoftware(ArrayList markers)
       {
           this.markers = markers;
        }
       
    public String toString()
       {
        String output = new String();
        
        
        for( Integer s : markers )
           {
            output += s + "\n";  
           }
        
        return output;  
       }
       
   }