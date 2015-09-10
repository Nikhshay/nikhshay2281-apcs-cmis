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
        
        int countint[] = new int[num1];
        int a = 0;
        
        for ( int firstcount = 0; firstcount < randomint.length; firstcount++ )
        {
              String e = "#";
              if (firstcount == countint.length)
              {
                countint[firstcount] += 1;
               }
               System.out.println(countint[firstcount] + e);
         }
    }
}