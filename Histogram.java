import javax.swing.JOptionPane; 

public class Histogram
{
    public static void main ( String[] args )
    {
        String input = JOptionPane.showInputDialog("please give me a number");
        int num1 = Integer.parseInt(input);
        int randomint[] = new int[num1];
        
        for ( int index = 0; index < randomint.length; index++ )
        {
            randomint[index] = (int)(Math.random()*100);
            
        } // end for loop
        
        int countint[] = new int[100];
        int a = 0;
        for ( int firstcount = 0; firstcount < randomint.length; firstcount++ )
        {
            System.out.println(randomint[firstcount]);
            for (int secondcount = 0; secondcount < countint.length; secondcount++)
            {
                countint[secondcount]++;
                System.out.println(countint[secondcount]);
            }
            
            }
         }
    }

