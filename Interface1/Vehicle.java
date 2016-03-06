package Interface1;

public abstract class Vehicle implements Connectable, Discountable
{
    private int peopleincar;
    
    public Vehicle()
    {
        this.peopleincar = 0;
    }

    public Vehicle(int passengers)
    {
        this.peopleincar = passengers;
    }

    public abstract void connectToBluetooth();
    
    public abstract String discountable();

    public String toString()
    {
        return "Number of passengers is: " + peopleincar;
    }
}