package Inheritance1;

public class CarApp
{
    public static void main(String[] args)
    {
        Car[] cars = new Car[4];
        cars[0] = new Car("Volvo","SE940");
        cars[1] = new Ferrari("Ferrari","488 GTB", 2015);
        cars[2] = new Lamborghini("Lamborghini","veneno", 2014, 112000000);
        cars[3] = new Ford("Ford","Fiesta", 2015, 600000, 8);
        
        for ( Car car : cars )
        {
            System.out.println(car + "\n");
        }     
    }
}