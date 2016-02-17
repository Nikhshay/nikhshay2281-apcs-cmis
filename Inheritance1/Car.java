package Inheritance1;

public class Car
{
    private String brand;
    private String model;
    
    public Car(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    public String toString()
    {
        return String.format("Brand: %s\nModel: %s\n", brand, model);
    }
}
