import javax.swing.JOptionPane; 

public class WeatherChaos
{
    public static void main ( String[] args )
    {
        String input = JOptionPane.showInputDialog("please give me a number");
        int num1 = Integer.parseInt(input);
        int randomint[] = new int[num1];
        int days = 1;
        int min = 99;
        int max = 0;
        int sum = 0;
        int swing = 0;
        
        for ( int index = 0; index < randomint.length; index++ )
        {
            randomint[index] = (int) (Math.random() * 200) - 100;
            if (randomint[index] < min)
            {
                min = randomint[index];
            }
            
            if (randomint[index] > max)
            {
                max = randomint[index];
            }
            sum += randomint[index];
        } // end for loop
        
        if (num1 > 0 && num1 < 31)
        {
            System.out.print("Days \t" + "temperature \t" + "temperature swing from the previous day \t" + "description");

            for (int i = 0; i < randomint.length; i++)
            { 
               days += 1; 
               int b = 0;
               
               while (b < randomint.length)
               {
                   swing = randomint[b-1];
                   swing++;
                }
               System.out.println(days + "\t" + randomint[i] + "\t" + swing + "wait");
                }
            
            System.out.println("MIN: " + min);
            System.out.println("MAX: " + max);
            System.out.println("AVG: " + (double) sum / (double) num1);
        }
        
        else
        {
            System.out.println("That's not a valid number of days!");
        }
         }
    }

