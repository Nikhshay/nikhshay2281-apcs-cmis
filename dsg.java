import javax.swing.JOptionPane;


    import javax.swing.JOptionPane;
public class dsg
    {
     public static void main (String[] args )
        {
                String input1 = JOptionPane.showInputDialog( " What is your number? " );
         
        int num1 = Integer.parseInt( input1 );
         
        double[] myArray = new double[num1];
        for( int index = 0; index < myArray.length; index++ )
        {
            myArray[index] = (double) (Math.random() * 51); 
            System.out.println("["+index+"]" + myArray[index]);
            }// end making decimal number // end making decimal number 
       
        int index2 = myArray.length-1;
        
        while (index2 >= 0)
           {
            System.out.println("["+index2+"]" + myArray[index2] );
            index2--;
             
            int b = 0;
            
            for (int a = (int)myArray[index2]; a > 0; a++ )
            {
                b++;
                System.out.println(b);
            }
        }
    }
}