package Array2DTest;
import javax.swing.JOptionPane; 

public class SwapArray
{
    public static void main ( String arg[] )
    {
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                                    {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                                    {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                                    {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                                    {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                                    {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                                    {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                                    {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                                    {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                                    {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
                                    
        int[] rowsum = new int[10];
        int[] colsum = new int[10];
          int firstcol = 0;
        
          for(int r = 0; r < grid.length; r++)
          {  
            for(int c = 0; c < grid[0].length; c++)
             {
              if (grid[r][c] == 0)
                {
                    grid[r][c] = 1;
                } //multiply anything with 1 equal same amount
                
                if(c == 0)
                {
                  firstcol = grid[r][0];   
                }
                else
                {
                colsum[c] = firstcol * grid[r][c] ;
              }
             }
            System.out.print(colsum[r]);
            System.out.print("\n"); 
          }
         // this is to know the value
        
        int highcol = 0;
        int highrow = 0;
        
        for( int i = 0; i < colsum.length;i++)
        {
            if (colsum[i] > highcol)
            {
                highcol = colsum[i];
            }
            
            if (colsum[i] > highcol)
            {
                highrow = rowsum[i];
            }
            
        }
        
        
    }
}