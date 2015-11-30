package ClassMethod6;
import javax.swing.JOptionPane;

public class Password 
{
      public static void main(String args[]) 
      {
          int a = 0;
          String createPassword = JOptionPane.showInputDialog("Create a passwords with a length of at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @.)");
          
          for(int i = 0; i < createPassword.length(); i++)
          {
              
              if (createPassword.substring(i, i+1).equals("+") || createPassword.substring(i, i+1).equals("-") || createPassword.substring(i, i+1).equals("*") || createPassword.substring(i, i+1).equals("/") || createPassword.substring(i, i+1).equals("@"))
              {
                  a += 1;
                }
            }
          
          if (createPassword.length() >= 6 && a == 1)
              {
                  System.out.println("Password accepted");
                }
          else
              {
                  System.out.println("Password failed");
                }
          
    }   
}