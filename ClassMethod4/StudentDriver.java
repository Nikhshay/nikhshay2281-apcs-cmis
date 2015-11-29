package ClassMethod4;

public class StudentDriver
{
    public static void main (String[] arg)
    {
        Student Senior0001 = new Student();
        Student Senior0002 = new Student("John", "Doe", 4.0, 4.0, 3.5, 4.0, 4.0);
        
        Senior0001.setGPA();
        Senior0002.setGPA();
        
        System.out.println(Senior0001);
        System.out.println(Senior0002);
        
        Senior0002.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
        Senior0002.setGPA();
        System.out.println(Senior0002);
        
    }
}