package Array2D4;
import javax.swing.JOptionPane; 

public class Array2D4
{
    public static void main ( String arg[] )
    {
        int col = Integer.parseInt(JOptionPane.showInputDialog("Number of column"));
        int row = Integer.parseInt(JOptionPane.showInputDialog("Number of row"));
        int x = 0;
        
        String grid[][] = new String[row][col];
        String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        
        for(int r = 0; r < grid.length; r++)
        {
            
            for(int c = 0; c < grid[0].length; c++)
             {
                grid[r][c] = alphabet[x];
                System.out.print(grid[r][c] + "\t");
                x++;
                if( x == 26)
                {
                    x -= 26;
                }
             }
       
            System.out.print("\n"); 
        }
    }
}