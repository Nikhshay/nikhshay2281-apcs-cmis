package ClassCompositionBigProblems;
import java.util.ArrayList;

public class gpsSoftware
   {
    private ArrayList<Integer> markers = new ArrayList<Integer>();
    public gpsSoftware()
       {
         markers.add(123);
         markers.add(1);
         markers.add(100);
         markers.add(10);
         markers.add(14);
         markers.add(15);
         markers.add(175);
         markers.add(178);
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
    
    public int getLength()
    {
        return markers.size()
    }
    
    public void isLevelTrailSegment( int begin, int end )
    {
        for( int i = 0; i < markers.size(); i++ )
        {
            if(begin = end && markers.get(i) < 10)
            {
                
            }
        }
    }
        
    public void addMarker(Integer Marker)
    {
        markers.add(Marker);
    }
        
    public String toString()
       {
        String output = new String();
        
        
        for( int i = 0; i < markers.size(); i++ )
           {
            output = output + i + " " + markers.get(i) + "\n";  
           }
        
        return output;  
       }
       
   }