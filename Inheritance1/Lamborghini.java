package Inheritance1;

public class Lamborghini extends Ferrari
{
    int price = 0;
    
    public Lamborghini(String brand, String model, int year, int price)
    {
        super(brand, model, year);
        this.price = price;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("\nPrice: %d Baht", price);
    }
    
}