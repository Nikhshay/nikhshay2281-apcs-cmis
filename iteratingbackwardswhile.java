import javax.swing.JOptionPane;

public class iteratingbackwardswhile
    {
     public static void main (String[] args )
        {
        
        int[] nums = { 3, 5, 7, 9, 11, 13};
        int index = nums.length;
        while (index > 0)
        {
            System.out.println(nums[index-1]);
            index--;
        }   
       
        } // end method main
        
    } // end class iteratingbackwards