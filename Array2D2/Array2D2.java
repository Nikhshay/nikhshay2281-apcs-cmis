package Array2D2;

public class Array2D2
{
    public static void main ( String arg[] )
    {
        int[][] number = new int[3][5];
        int[] colsum = new int[5];
        int[] rowsum = new int[3];
        int i = 0;
        for(int row = 0; row < number.length; row++)
        {      
            for(int col = 0; col < number[0].length; col++)
             {
                number[row][col] = i + col + 1 ;
                colsum[col] += number[row][col];
                rowsum[row] += number[row][col];
             }
            i = i + number[0].length;
        }
        
        int total =  0;
        for (int[] x : number )
        {
            for(int num : x)
             {
                 total += num;
                 System.out.print( num  + "\t");
              }
            System.out.println();
        }
        
        System.out.println("The sum total of all 15 elements of the array is : " + total); 
        
        for (int x = 0; x < number.length; x++)
        {
            System.out.println("The sum total of row " + (i+1) + " is : " + rowsum[x]);
        }
        
        for(int x = 0; x < number[0].length; x++)
             {
            System.out.println("The sum total of column " + (i+1)  + " is : " + colsum[x]);
         }
    }
}