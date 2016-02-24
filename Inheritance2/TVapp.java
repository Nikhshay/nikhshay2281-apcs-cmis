package Inheritance2;

public class TVapp
{
    public static void main(String[] args)
    {
        Television[] tvs = new Television[5];
        tvs[0] = new Television("HD Bronze", 25.00);
        tvs[1] = new DLP("DLP Silver", 59.99);
        tvs[2] = new LED("LED Gold", 99.99);
        tvs[3] = new LCD("LCD Platinum", 199.99);
        tvs[4] = new Plasma("Dayum Plasma", 199999.99);
    
        for ( Television tv : tvs )
        {
            System.out.println(tv);
        }     
    }
}