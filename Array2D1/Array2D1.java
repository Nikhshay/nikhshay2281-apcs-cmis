package Array2D1;

public class Array2D1
{
    public static void main ( String arg[] )
    {
        int number[][] = new int[3][4];
        for(int row = 0; row < number.length; row++)
        {
            for(int col = 0; col < number[0].length; col++)
             {
                number[row][col] = (int)(Math.random()*10); 
                System.out.print(number[row][col] + "    "); 
             }
            System.out.print("\n"); 
        }
    }
}