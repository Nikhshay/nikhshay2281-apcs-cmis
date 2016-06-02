import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Powers extends Actor implements removeFall, gravity
{
    int speed;
    public Powers(int num)
    {
        speed= num;
    }

    public abstract void act(); 
   

    public abstract void removeFall();
    

    public abstract void fall();
    

    public abstract void touchPaddle();
    
}
