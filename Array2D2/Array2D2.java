package Array2D2;

public class Array2D2
{
    public static void main ( String arg[] )
    {
        int[][] number = new int[3][5];
        int i = 0;
        for(int row = 0; row < number.length; row++)
        {      
            for(int col = 0; col < number[0].length; col++)
             {
                number[row][col] = i + col + 1 ; 
             }
            i = i + 5;
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
        
        System.out.print("The sum total of all 15 elements of the array is : " + total); //120
        System.out.print("The sum total of each row of the array is : ");
        System.out.print("The sum total of each column of the array is : ");
    }
}