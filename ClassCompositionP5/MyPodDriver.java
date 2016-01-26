package ClassCompositionP5;

public class MyPodDriver
{
    public static void main (String[] arg)
    {
        MyPod carpod1 = new MyPod(); 
        MyPod carpod2 = new MyPod( "yellow" , 5 ,"Riptide", "Photograph", "Demon");
        System.out.print(carpod1 +"\n"+ carpod2);
    }
}