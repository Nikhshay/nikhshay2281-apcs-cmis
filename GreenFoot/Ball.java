import greenfoot.*;  
public class Ball extends Actor implements removeFall
{
    private int bricksBroken = 0;
    public int speed = 4;
    private Brick brick;
    private int brokenbricks = 0;

    public void act() 
    {
        moveAndDeflect();
        breakBrick();
        removeFall();
        forceAdjustSpeed();
    }   
    public void forceAdjustSpeed()
    {
        if(speed>6)
        {
            speed = 6;
        }
        if(speed< 2)
        {
            speed = 2;
        }
    }
    public void moveAndDeflect()
    {
        move(speed);

        if(getX() <= 2||getX()>=getWorld().getWidth()-2 )
        {
            if(getRotation()!= 0 && Math.abs(getRotation()-180) > 15)
            {
                setRotation(180-getRotation());
            }
            else 
            {
                turn(120);
            }
        }
        if(getY()<=2 && getRotation() == 270)
        {
            setRotation((int)(Math.random()*90+45));
        }
        else if(getY() <= 2)
        {
            setRotation(-getRotation());
        }
        if(intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))
        {
            setRotation((int)(-Math.random()*85-48)); 
        }

    }
    public void breakBrick()
    {
        if(getWorld() != null)
        {
            brick = (Brick)getOneIntersectingObject(b1.class);

            if(brick == null)
            {
                brick = (Brick)getOneIntersectingObject(b2.class);
            }

            if(brick == null)
            {
                brick = (Brick)getOneIntersectingObject(b3.class);
            }

            if(brick != null)
            {
                MyWorld world; 
                world = (MyWorld)getWorld();
                brick.power--;
                if(brick.power ==0)
                {
                    brokenbricks++;
                    if(brokenbricks % 4 ==0 )
                    {
                        if(Math.random()>0.5)
                        {
                            getWorld().addObject(new SpeedUp(), getX(),getY());
                        }
                        else
                        {
                            getWorld().addObject(new SpeedDown(), getX(),getY());
                        }
                    }
                    world.removeObject(brick);
                }
                turn(120);

                bricksBroken++;
            }
        }
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

}

