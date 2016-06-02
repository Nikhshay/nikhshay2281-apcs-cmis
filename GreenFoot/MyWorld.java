import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

      static  Ball ball = new Ball();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1000, 600, 1); 
        int addcounter = 7;
        ArrayList<b1> b1AL = new ArrayList<b1>();
        ArrayList<b2> b2AL = new ArrayList<b2>();
        ArrayList<b3> b3AL = new ArrayList<b3>();
        for(int i = 0; i < 7;i++)
        {
            b1AL.add(new b1());
            b3AL.add(new b3());
        }
        for(int i = 0; i < 8; i++)
        {
            b2AL.add(new b2());
        }
        while(addcounter>0)
        {
            addObject(b1AL.get(addcounter-1),1020-(addcounter*b1AL.get(addcounter-1).getImage().getWidth()),200);
            addObject(b2AL.get(addcounter-1),990-(addcounter*b1AL.get(addcounter-1).getImage().getWidth()),135);
            addObject(b3AL.get(addcounter-1),1020-(addcounter*b1AL.get(addcounter-1).getImage().getWidth()),50);
            addcounter--;
        } 
        Paddle paddle = new Paddle();
        addObject(paddle,504,560);
        addObject(ball,504,496);
        ball.setRotation(270);
    }
   public Ball getBall()
   {
       return ball;
    }

}
