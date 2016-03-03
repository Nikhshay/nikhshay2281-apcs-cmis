package Inheritance4;
import java.util.ArrayList;

public class StudentDriver
{
    public static void main(String[] args)
    {  
        UnderGrad underGrad1 = new UnderGrad("DJ", "Science", 16);
        UnderGrad underGrad2 = new UnderGrad("Tin", "Mathematics", 32);
        Graduate graduate1 = new Graduate("Bruno", "Biology", 128);
        Graduate graduate2 = new Graduate("Clifton", "Medical", 12);
        PostGraduate postGrad1 = new PostGraduate("Johnnie", "Culinary", 1);
        PostGraduate postGrad2 = new PostGraduate("Tadpole", "Mechanical Engineering", 10000);

        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(postGrad1);
        allStudents.add(postGrad2);
        allStudents.add(graduate1);
        allStudents.add(graduate2);
        allStudents.add(underGrad1);
        allStudents.add(underGrad2);

        Student[][] students = new Student[3][2];
        int i = 0;
        for(int row = 0; row < students.length; row++)
        {
            for(int col = 0; col < students[0].length; col++)
            {
                students[row][col] = allStudents.get(i);
                i++;
                System.out.print(students[row][col] + "\t\t" );
            }
            System.out.println();
        }
        
    }
}