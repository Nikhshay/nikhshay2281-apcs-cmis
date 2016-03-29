import greenfoot.*;  
public class Ball extends Actor
{
    private int bricksBroken = 0;
    private int speed = 4;
    private Actor brick;
    
    public void act() 
    {
        moveAndDeflect();
        breakBrick();
    }   

    public void moveAndDeflect()
    {
        move(speed);
        
        if(getX() <= 10 || getX() >= getWorld().getWidth() -10||getY() <= 10||intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))
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
    
    public void breakBrick()
    {
        
    }
}

