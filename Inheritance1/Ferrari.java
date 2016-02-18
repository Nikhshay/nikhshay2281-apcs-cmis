package Inheritance1;

public class Ferrari extends Car
{
    int year = 0;
    
    public Ferrari(String brand, String model, int year)
    {
        super(brand, model);
        this.year = year;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("\nYear: %d", year);
    }
    
}