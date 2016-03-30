import greenfoot.*;  
public class Ball extends Actor
{
    private int bricksBroken = 0;
    private int speed = 4;
    private Nor brick;
    
    public void act() 
    {
        moveAndDeflect();
        breakBrick();
    }   

    public void moveAndDeflect()
    {
        move(speed);
        
        if(getX() <= 3 || getX() >= getWorld().getWidth() -3||getY() <= 3||intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))
        {
            turn(120);
        }
        
        if(getY() >= getWorld().getHeight() - 5)
        {
            World world; 
            world = getWorld();
            world.removeObject(this);
        }
        
    }
    
    public void breakBrick()
    {
        if(brick != null)
        {
            MyWorld world; 
            world = (MyWorld)getWorld();
            world.removeObject(brick);
            turn(120);
        }
    }
}

