import greenfoot.*;  
public class Ball extends Actor
{
    private int bricksBroken = 0;
    private int speed = 4;
    private Actor brick;
    
    public void act() 
    {
        moveAndDeflect() ;
    }   

    public void moveAndDeflect()
    {
        move(speed);
        
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5||getY() <= 5||intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))
        {
            turn(120);
        }
        
        if(getY() >= getWorld().getHeight() -5)
        {
            World world; 
            world = getWorld();
            world.removeObject(this);
        }
        
    }
}    
