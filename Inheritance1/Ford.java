package Inheritance1;

public class Ford extends Lamborghini
{
    int rating = 0;
    
    public Ford(String brand, String model, int year, int price, int rating)
    {
        super(brand, model, year, price);
        this.rating = rating;;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("\nRating: %d", rating);
    }
    
}