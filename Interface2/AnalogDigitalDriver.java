package Interface2;
import java.util.ArrayList;
public class AnalogDigitalDriver
{
    public static void main(String[] args)

    {
        BWTV FirstTV = new BWTV();
        HDTV SecondTV = new HDTV();
        
        ArrayList<TV> TV = new ArrayList<TV>();
        TV.add(FirstTV);
        TV.add(SecondTV);
        
        for(TV eachTV: TV)
        {
            System.out.println(eachTV.tvType() + " Am I on? " + eachTV.getTvOn() );
        }
        
        for(int i = 0; i < TV.size(); i++)
        {
            TV.get(i).setTvOn(true);
        }
        System.out.println();
        
        for(TV eachTV: TV)
        {
            System.out.println(eachTV.tvType() + " Am I on? " + eachTV.getTvOn() );
        }
        
        
        System.out.println(FirstTV.rotateRabbitEars());
        System.out.println(SecondTV.connectHDMI());
        
        
      
    }
}