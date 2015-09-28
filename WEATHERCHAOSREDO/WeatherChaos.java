package WEATHERCHAOSREDO;


import javax.swing.JOptionPane; 

public class WeatherChaos
{
    public static void main ( String[] args )
    {
        String input = JOptionPane.showInputDialog("please give me a number");
        int num1 = Integer.parseInt(input);
        int randomint[] = new int[num1];
        int min = 99;
        int max = 0;
        int sum = 0;
        int swing = 0;
        String description ="";
        int thisnumber = 0;
        
        
        
        
        if (num1 > 0 && num1 < 31)
        {
            System.out.print("Days \t" + "temperature \t" + "temperature swing from the previous day \t" + "description");
            
             for ( int index = 0; index < randomint.length; index++ )
             {
              randomint[index] = (int) (Math.random() * 200) - 100;
            
             } // end for loop

              for (int i = 0; i < randomint.length; i++)
              {
              
               int b = 0;
               while (b < randomint.length)
               {
                   swing = b-1;
                   b++;
                }
               thisnumber = randomint[i];
               if (thisnumber < min)
               {
                min = thisnumber;
               }
               if (thisnumber > max)
               {
                max = thisnumber;
               }
               sum += randomint[i];
                 
            
            
               if (randomint[i] < 0 )
                {
                   description = "\t \t \t \t \t \t  freezing";
                }
               if (randomint[i] >= 0 && randomint[i] <= 15)
                {
                   description = "\t \t \t \t \t \t  chilly";
                }
               if (randomint[i] >= 16 && randomint[i] <= 30)
                {
                    description = "\t \t \t \t \t \t comfortable";
                }
               if (randomint[i] >= 31  && randomint[i] <= 40)
                {
                   description = "\t \t \t \t \t \t \t hot";
                }
               if (randomint[i] > 40)
                {
                   description = "\t \t \t \t \t  AAAAAAUUUUGGGHHH!";
                }
                
               System.out.println(i + "\t" + randomint[i] + "\t" + randomint[swing] + "\t" + description);
            
        
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

