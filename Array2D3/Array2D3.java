package Array2D3;
import javax.swing.JOptionPane; 

public class Array2D3
{
    public static void main ( String arg[] )
    {
        int col = Integer.parseInt(JOptionPane.showInputDialog("Number of column"));
        int row = Integer.parseInt(JOptionPane.showInputDialog("Number of row"));
        int number[][] = new int[row][col];
        
        for(int r = 1; r < number.length; r++)
        {
            System.out.print(r-1 + "\t");
            for(int c = 1; c < number[0].length; c++)
             {
                System.out.print(c-1 + "\t");
                number[r][c] = (r * c);  
                System.out.print(number[r][c] + "\t"); 
             }
            System.out.print("\n"); 
        }
    }
}