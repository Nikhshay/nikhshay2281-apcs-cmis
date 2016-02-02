package Array2D3;
import javax.swing.JOptionPane; 

public class Array2D3
{
    public static void main ( String arg[] )
    {
        int row = Integer.parseInt(JOptionPane.showInputDialog("Number of rows"));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Number of column"));
        int number[][] = new int[row][col];
        
        for(int r = 0; row < number.length; row++)
        {
            for(int c = 0; col < number[0].length; col++)
             {
                number[row][col] = (int)(Math.random()*10); 
                System.out.print(number[row][col] + "    "); 
             }
            System.out.print("\n"); 
        }
    }
}