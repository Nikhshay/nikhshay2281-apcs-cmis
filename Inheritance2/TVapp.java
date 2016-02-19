package Inheritance2;

public class TVapp
{
    public static void main(String[] args)
    {
        Television[] tvs = new Television[5];
        tvs[0] = new Television("HD Bronze", 59.99);
        tvs[1] = new Plasma("Plasma Platinum", 299.99);
        tvs[2] = new LED("LED low", 19.99);
        tvs[3] = new DLP("DLP Silver", 99.99);
        tvs[4] = new LCD("LED GOld", 199.99);
    
        for ( Television tv : tvs )
        {
            System.out.println(tv + "\n");
        }     
    }
}