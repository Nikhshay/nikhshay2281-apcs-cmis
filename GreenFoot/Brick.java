import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Brick extends Actor
{
    int power;
    public Brick(int num)
    {
        power = num;
    }
    
    public abstract void act(); 
    
    
}
