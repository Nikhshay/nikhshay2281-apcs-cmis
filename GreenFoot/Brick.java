import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Brick extends Actor
{
    
    public void act() 
    {
        
    }    
    
    public void collide()
    {
        getWorld().removeObject(this);
    }
}
