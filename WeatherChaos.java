import javax.swing.JOptionPane; 

public class WeatherChaos
{
    public static void main ( String[] args )
    {
        String input = JOptionPane.showInputDialog("please give me a number");
        int num1 = Integer.parseInt(input);
        int randomint[] = new int[num1];
        int days;
        
        days += 1;
        
        for ( int index = 0; index < randomint.length; index++ )
        {
            randomint[index] = (int) (Math.random() * 200) - 100;
            System.out.println(randomint[index]);
        } // end for loop
        System.out.print("Days \t" + "temperature \t" + "temperature swing from the previous day \t" + "description");
        System.out.println(days);
        
         }
    }

