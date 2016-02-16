package ClassCompositionBigProblems;
import java.util.ArrayList;

public class gpsSoftware
   {
    
       ArrayList<Integer> markers = new ArrayList<Integer>();
    
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
        int length = 0;
        for(int i = 0; i < markers.size(); i++)
        {
            length += markers.get(i);
        }
        return length;
    }
    
    public boolean isLevelTrailSegment(int begin, int end)
    {
        boolean level = false;
                    
        for( int i = begin; i < end; i++ )
        {
            
            if(i > begin && Math.abs(markers.get(i) - markers.get(i-1)) < 10)
            {
                level = true;
            }
        }
        
            if (markers.get(begin) == markers.get(end) && level == true)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        
    }
        
    public boolean isDifficult( int begin, int end )
    {
        int height = 0;
        
        for( int i = begin; i < end; i++ )
        {
            if( i > begin && Math.abs(markers.get(i) - markers.get(i-1)) > 0)
            {
                height += Math.abs(markers.get(i) - markers.get(i-1));
            }  
        }
        
            if (height > 100 && isLevelTrailSegment(begin, end))
            {
                return true;
            }
            else 
            {
                return false;
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