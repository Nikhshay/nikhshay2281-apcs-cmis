import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedDown extends Powers implements gravity, removeFall
{
    public SpeedDown()
    {
        super(-1);
    }  
    
    
    public void act() 
    {
        removeFall();
        fall();
        touchPaddle();
    }

    public void removeFall()
    {
        if(getY() >= getWorld().getHeight() - 15)
        {
            World world; 
            world = getWorld();
            world.removeObject(this);
        }
    }

    public void fall()
    {
        if(getWorld()!= null)
        {
            setLocation(getX(),getY()+4);
        }
    }

    public void touchPaddle()
    {
        if(getWorld()!= null)
        {
            if((Paddle)getOneIntersectingObject(Paddle.class)!= null)
            {
                MyWorld.ball.speed+=this.speed;
                getWorld().removeObject(this);
            }
        }
    }
}
