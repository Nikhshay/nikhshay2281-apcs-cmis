import javax.swing.JOptionPane; 

public class WeatherChaos
{
    public static void main ( String[] args )
    {
        String input = JOptionPane.showInputDialog("please give me a number");
        int num1 = Integer.parseInt(input);
        int randomint[] = new int[num1];
        int days = 0;
        
        for ( int index = 0; index < randomint.length; index++ )
        {
            randomint[index] = (int) (Math.random() * 200) - 100;
        } // end for loop
        if (num1 > 0 && num1 < 31)
        {
            System.out.print("Days \t" + "temperature \t" + "temperature swing from the previous day \t" + "description");
            days = days + 1;
            for (int i = 0; i < randomint.length; i++)
            { 
                System.out.println(days + "\t" + randomint[i] + "\t" + randomint[i-1] + "");
            }
        }
        else
        {
            System.out.println("That's not a valid number of days!");
        }
         }
    }

