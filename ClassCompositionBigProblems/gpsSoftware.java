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
    
    public void addMarker(Integer Marker)
    {
        markers.add(Marker);
    }
    
    public int getLength()
    {
        return markers.size();
    }
    
    public boolean isLevelTrailSegment( int begin, int end )
    {
        for( int i = 1; i < markers.size(); i++ )
        {
            if(markers(0) = markers(markers.size()) && markers.get(i) - markers.get(i - 1) < 10)
            {
                return true;
            }
        }
    }
        
    public boolean isDifficult( int begin, int end )
    {
        for( int i = 1; i < markers.size(); i++ )
        {
            if(markers(i) != markers(i-1) && markers.get(i) - markers.get(i - 1) > 100)
            {
                return true;
            }
        }
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