package CubiversePractice;

public class Cubiverse
{
    private int w;
    private int h;
    private int d;
    private double x;
    private double y;
    private double z;
    private double dx;
    private double dy;
    private double dz;
    private String name;
    private int volume;
    
    public Cubiverse()
    {
        name =  "Default Cubiverse-" + ((double) Math.random());
        w = 1;
        h = 1;
        d = 1;
        x = 0.50;
        y = 0.50;
        z = 0.50;
        dx = 0.50;
        dy = 0.50;
        dz = 0.50;
        volume = 1;
    }
   
    public Cubiverse(int w, int h, int d, String name)
    {
        this.w=w;
        this.h=h;
        this.d=d;
        this.name=name; 
        volume = this.w*this.h*this.d;
        x = 0.50;
        y = 0.50;
        z = 0.50;
        dx = ((double)this.w/2);
        dy = ((double)this.h/2);
        dz = ((double)this.d/2);
    }
    
    public Cubiverse(double x, double y, double z, String name )
    {
        this.x=x;
        this.y=y;
        this.z=z;
        this.name=name; 
        w = 1;
        h = 1;
        d = 1;
        volume = 1;
        dx = this.x;
        dy = this.x;
        dz = this.x;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Name: " + name +
                    "\nw: " + w +
                    "\nh: " + h +
                    "\nd: " + d +
                    "\nvolume: " + volume +
                    "\nx: " + String.format("%.2f", x) +
                    "\ny: " + String.format("%.2f", y) +
                    "\nz: " + String.format("%.2f", z)+
                    "\ndistance from left: " + String.format("%.2f", dx) +
                    "\ndistance from right: " + String.format("%.2f", dy) +
                    "\ndistance from back: " + String.format("%.2f", dz) +
                    "\n\n";
        return output;
    }
    
    
}