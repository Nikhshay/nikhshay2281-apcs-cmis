package ClassMethod5;

public class University 
{
      public static void main(String args[]) 
      {

        String school1 = new String ( "GT" ); 
        String school2 = new String ( "UTA" ); 
        String school3 = new String ( "Auckland" ); 

        System.out.println(school1.compareTo( school2 ));
        System.out.println(school2.compareTo( school1 ));
        System.out.println(school2.compareTo( school3 ));
        System.out.println(school3.compareTo( school2 ));
        System.out.println(school1.compareTo( school3 ));       
        System.out.println(school3.compareTo( school1 ));
    }   
}
//a. What is the output of the compareTo() method telling us? 
//Answer ==> It is telling us the number of alphabets there are between the first letter of. each words.
//b. Compare to schools that have the same first letter and a different second letter. What does compareTo() do in this case? 
//2. It compare the second letter. If the words are the same, then the answer will come out as 0. Otherwise, it will tell us the first letter that is different.