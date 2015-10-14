package CubiversePractice;

public class Cubiverse
{
    private int w;
    private int h;
    private int d;
    private double dimension2;
    private String name;
    
    public Cubiverse()
    {
        name =  "Default Cubiverse-" + ((double) Math.random());
        w = 1;
        h = 1;
        d = 1;
        dimension2 = 0.50; //not printing 0.50, its printing 0.5**
    }
   
    public Cubiverse(int w, int h, int d, String name )
    {
        this.h=h;
        this.h=h;
        this.d=d;
        this.name=name; 
        dimension2 = 0.50;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + name +
                    "\nw: " + w +
                    "\nh: " + h +
                    "\nd: " + d +
                    "\nvolume: " + w +
                    "\nx: " + dimension2 +
                    "\ny: " + dimension2 +
                    "\nz: " + dimension2 +
                    "\ndistance from left: " + dimension2 +
                    "\ndistance from right: " + dimension2 +
                    "\ndistance from back: " + dimension2 +
                    "\n\n";
        return output;
    }
    
    
}