package Interface1;

public class MyCar extends Vehicle 
{
    
    private int mpg;
    private double lucky;
    
    public MyCar(int milesPerGallon)
    {
        this.mpg = milesPerGallon;
    }

    public MyCar(int passengers, int milesPerGallon)
    {
        super(passengers);
        this.mpg = milesPerGallon;
    }
    
    public void connectToBluetooth()
    {
       System.out.println("Connecting to bluetooth for a MyCar");
    }
    
    public String discountable()
    {
        lucky = Math.random();
        
        if
        ( lucky > 0.5)
        {
            return "Yeeee, you get discount";
        }
        else
        {
            return "Sorry, life sucks, but you get full priced";
        }
        
    }
    
    public String toString()
    {
        return super.toString() + "\n" +
        "Miles per gallon for this car is: " + mpg;
    }
}