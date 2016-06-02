import greenfoot.*;  

public class Paddle extends SmoothActor
{
    private int moveAmount = 10;
    private Ball myBall;
    private Ball myBall2;
    private boolean myBallbool = false;
    
    private final int MAX_SPEED = 50;
    
    public void addedToWorld(World world)
    {
        newBall();
    }

    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - moveAmount,getY());
        }
        
        /* if right arrow key is pressed move right */
        else if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + moveAmount, getY());
        }
        MouseInfo minfo = Greenfoot.getMouseInfo();
        
        if (haveBall() && Greenfoot.isKeyDown ("space")) 
        {
              releaseBall();
        }
        
        if(haveBall() && Greenfoot.mouseClicked(this))
        {
            releaseBall();
        }
       
        if (minfo != null) {
            super.setLocation(minfo.getX(), getY());
        }
    }
    
    public boolean haveBall()
    {
        if(myBall == null)
            return false;
        else
            return true;
    }

    private void moveLR(int dist)
    {
        setLocation (getX() + dist, getY());
        if (myBallbool) {
            myBall.moveLR (dist);
        }
    }

    private void moveUD(int dist)
    {
        setLocation (getX(), getY() + dist);
        if (myBallbool) {
            myBall.moveUD (dist);
        }
    }
    
    public void releaseBall()
    {
        myBall.release();
        myBall2 = new Ball();
        myBall2 = myBall;
        myBall = null;
        myBallbool = true;
    }
    
    public void newBall()
    {
        myBall = new Ball();
        getWorld().addObject (myBall, this.getX(), this.getY()-7);
        myBallbool = false;
    }
    
    public void removeBall()
    {
        ((Background)getWorld()).removeObject(myBall2);
    }
}
