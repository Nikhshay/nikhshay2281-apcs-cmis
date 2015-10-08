package ClassDesignP3;

import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main (String[] arg)
    {
       String fname = JOptionPane.showInputDialog("What is the Student's first name?");
       String lname = JOptionPane.showInputDialog("What is the Student's last name?");
       int age = Integer.parseInt(JOptionPane.showInputDialog("What is the Student's age?"));
       double weight = Double.parseDouble(JOptionPane.showInputDialog("What is the Student's weight?"));

        Student Senior0001 = new Student();
        
        Student Junior0001 = new Student( fname, lname, age, weight );
        
        JOptionPane.showMessageDialog(null, Senior0001, "CMIS Students", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null, Junior0001, "CMIS Students", JOptionPane.PLAIN_MESSAGE);
        
    }
}