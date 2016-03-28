import greenfoot.*;

public class Ball extends Actor
{
    private final int MAX_SPEED = 7;
    private int deltaX;  
    private int deltaY; 
    private int count = 2;
    private boolean stuck = true;
    private Brick brick;

    public void act() 
    {
        if (!stuck && !((Background) getWorld()).getCheck()) 
        {
            move();
            checkOut();
        }
    }

    private void move()
    {
        setLocation (getX() + deltaX, getY() + deltaY);
        checkPaddle();
        checkBrick();
        checkWalls();
    }

    private void checkPaddle()
    {
        Actor paddle = getOneIntersectingObject(Paddle.class);
        if (paddle != null) {
            deltaY = -deltaY;  
            int offsetY = getY() - paddle.getY();  
            int offsetX = getX() - paddle.getX();  
            setLocation(getX(), paddle.getY() + offsetY + deltaY);  
            deltaX = deltaX + (offsetX/10); 
            if (deltaX > MAX_SPEED) {
                deltaX = MAX_SPEED;
            }
            if (deltaX < -MAX_SPEED) {
                deltaX = -MAX_SPEED;
            }
        }            
    }

    private void checkBrick()
    {
        brick = (Brick)getOneIntersectingObject(RedBrick.class);
        if(brick==null){
            brick = (Brick)getOneIntersectingObject(PurpleBrick.class);
        }
        if(brick==null){
            brick = (Brick)getOneIntersectingObject(BlueBrick.class);
        }
        if(brick==null){
            brick = (Brick)getOneIntersectingObject(YellowBrick.class);
        }
        if(brick==null){
            brick = (Brick)getOneIntersectingObject(GreenBrick.class);
        }
        
        
        if(brick != null){
            if((getY() > brick.getY()) || (getY() < brick.getY())){
                deltaY = -deltaY;
            }
            else{
                deltaX = -deltaX;
            }
            
            if(brick instanceof RedBrick){
                RedBrick redBrick = (RedBrick)brick;
                if(redBrick.isZero()){
                    ((Background) getWorld()).breakBrick();
                }
            }
            if(brick instanceof PurpleBrick){
                PurpleBrick purpleBrick = (PurpleBrick)brick;
                if(purpleBrick.isZero()){
                    ((Background) getWorld()).breakBrick();
                }
            }
            if(brick instanceof BlueBrick){
                BlueBrick blueBrick = (BlueBrick)brick;
                if(blueBrick.isZero()){
                    ((Background) getWorld()).breakBrick();
                }
            }
            if(brick instanceof YellowBrick){
                YellowBrick yellowBrick = (YellowBrick)brick;
                if(yellowBrick.isZero()){
                    ((Background) getWorld()).breakBrick();
                }
            }
            if(brick instanceof GreenBrick){
                GreenBrick greenBrick = (GreenBrick)brick;
                if(greenBrick.isZero()){
                    ((Background) getWorld()).breakBrick();
                }
            }
            brick.collide();
        }
    }
    
    private void checkWalls()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1) {
            deltaX = -deltaX;
        }
        if (getY() == 0) {
            deltaY = -deltaY;
        }
    }

    private void checkOut()
    {
        if (getY() == getWorld().getHeight()-1) {
            ((Background) getWorld()).ballIsOut();
            getWorld().removeObject(this);
        }
    }

    public void moveLR(int dist)
    {
        setLocation (getX() + dist, getY());
    }

    public void moveUD(int dist)
    {
        setLocation (getX(), getY() + dist);
    }

    public void release()
    {
        deltaX = Greenfoot.getRandomNumber(11) - 5;
        deltaY = -MAX_SPEED;
        stuck = false;
    }
    
    public void remove()
    {
        ((Background)getWorld()).removeObject(this);
    }
}
