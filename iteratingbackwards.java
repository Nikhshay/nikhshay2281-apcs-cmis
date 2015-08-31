import javax.swing.JOptionPane;

public class iteratingbackwards
    {
     public static void main (String[] args )
        {
        int[] nums = { 3, 5, 7, 9, 11, 13};
        for ( int index = nums.length; index > 0; index--)
        {
            System.out.println(nums[index-1]);
        }   
       
        } // end method main
        
    } // end class iteratingbackwards

        