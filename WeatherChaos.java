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
        String description;
        int thisnumber;
        
        
        for ( int index = 0; index < randomint.length; index++ )
        {
            randomint[index] = (int) (Math.random() * 200) - 100;
            thisnumber = randomint[index];
            if (thisnumber < min)
            {
                min = thisnumber;
            }
            
            if (thisnumber > max)
            {
                max = thisnumber;
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
                   swing = b-1;
                   b++;
                }
                
               for (int c = 0; c < randomint.length; c++) 
               {
                   
                if (randomint[c] < 0 )
                {
                   description = "freezing";
                }
                if (randomint[c] >= 0 && randomint[c] <= 15)
                {
                   description = "chilly";
                }
                if (randomint[c] >= 16 && randomint[c] <= 30)
                {
                    description = "comfortable";
                }
                if (randomint[c] >= 31  && randomint[c] <= 40)
                {
                   description = "hot";
                }
                if (randomint[c] > 40)
                {
                   description = "AAAAAAUUUUGGGHHH!";
                }
              }
                System.out.println(days + "\t" + randomint[i] + "\t" + randomint[swing] + "\t" + description);
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

