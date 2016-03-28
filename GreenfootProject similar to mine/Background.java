import greenfoot.*;
import java.util.Random;
import java.awt.Color;
import java.util.List;
import javax.swing.*;

public class Background extends World
{
    public static int SIZEX = 400;
    public static int SIZEY = 300;
    private boolean check = false;
    private int level = 1;

    public static int BRICKSPACING = 10;
    public static int BRICKLEFTBORDER = 30;
    public static int BRICKRIGHTBORDER = 30;
    public static int BRICKWIDTH = 30;
    public static int BRICKHEIGHT = 15;
    public static int BRICKTOPBORDER = 10;
    
    private boolean startedAlready = false;

    private Paddle paddle = new Paddle();
    private Ball ball = new Ball();
    private StartGame start = new StartGame();
    private Paused pause = new Paused();

    private int count = 0;
    private int count3 = 0;
    private int count2 = 0;
    private int score = 0;

    private Counter[] counter;
    private Counter2[] counter2;

    private int brickNum2 = 35;
    private int brickNum = 0;
    private int brickX = 50;
    private int brickY = 70;
    
    private int p = 0;
    
    private GreenfootSound backgroundMusic = new GreenfootSound("Mario.MP3");

    public Background()
    {    
        super(SIZEX, SIZEY, 1); 
        
        addObject(start, 200, 150);
        backgroundMusic.playLoop();

        counter = new Counter[5];
        counter2 = new Counter2[1];

        counter[0] = new Counter("Bricks Left: ", brickNum2);
        counter[1] = new Counter("Lives Left: ", 3);
        counter[2] = new Counter("Score: ", score);
        counter[3] = new Counter("Level: ", level);
        counter2[0] = new Counter2("Final Score: ", score);
        
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("p"))
        {
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(null, "You have paused the game.  Click OK to continue", "Notice", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        }
        
        if(paddle.haveBall() && Greenfoot.mouseClicked(this))
        {
            paddle.releaseBall();
        }
        
        if(counter[0].getValue() == 0 && level == 1)
        {
            populate();
            
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(null, "You have beaten level 1.  Click OK to continue", "Notice", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
            for(int j = 0; j < 55; j++)
            {
                counter[0].increaseValue();
            }
            counter[3].increaseValue();
            counter[1].increaseValue();
            level++;
        }
        
        else if(counter[0].getValue() == 0 && level == 2)
        {
            populate3();
            
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(null, "You have beaten level 2.  Click OK to continue", "Notice", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
            for(int j = 0; j < 75; j++)
            {
                counter[0].increaseValue();
            }
            counter[3].increaseValue();
            counter[1].increaseValue();
            level++;
        }
        
        else if(counter[0].getValue() == 0 && level == 3)
        {
            if(count2 == 0)
            {
                Object[] options = {"OK"};
                JOptionPane.showOptionDialog(null, "You have beaten the game.  Click OK to continue", "Notice", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
                gameSet();
                count2++;
            }
        }
    }
    
    public void started()
    {
        removeObject(start);
        
        addObject(paddle, 210, 275);
        if(!startedAlready)
        {
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(null, "Control the paddle with the mouse or the arrow keys.\nKeep the ball above the paddle, or else lose a life.\nPress p to pause the game.\nRelease the ball by clicking the world, or by pressing the space bar.\nLose all of your lives, and it's game over!", "Instructions", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
            populate2();
            startedAlready = true;
        }
        
        removeObject(pause);
        
        addObject(counter[0], 80, getHeight() - 10);
        addObject(counter[1], getWidth() - 5 , getHeight() - 10);
        addObject(counter[2], 50, 10);
        addObject(counter[3], getWidth() - 5, 10);
    }
    
    public void stopped()
    {
        addObject(pause, getWidth()/2, getHeight()/2);
    }
    
    public void finalBoss()
    {
        
    }
    
    public void populate()
    {
        paddle.removeBall();
        paddle.newBall();
        
        for(int i = 0; i < 11; i++)
        {
            Random gen = new Random();
            brickNum = gen.nextInt(5);
            if(brickNum == 0)
            {
                addObject(new PurpleBrick(),brickX, brickY);
            }
            else if(brickNum == 1)
            {
                addObject(new BlueBrick(),brickX, brickY);
            }
            else if(brickNum == 2)
            {
                addObject(new GreenBrick(),brickX, brickY);
            }
            else if(brickNum == 3)
            {
                addObject(new YellowBrick(),brickX, brickY);
            }
            else
            {
                addObject(new RedBrick(), brickX, brickY);
            }
            brickX += 30;
        }
        brickX = 50;
        brickY += 15;
        for(int i = 0; i < 11; i++)
        {
            Random gen = new Random();
            brickNum = gen.nextInt(5);
            if(brickNum == 0)
            {
                addObject(new PurpleBrick(),brickX, brickY);
            }
            else if(brickNum == 1)
            {
                addObject(new BlueBrick(),brickX, brickY);
            }
            else if(brickNum == 2)
            {
                addObject(new GreenBrick(),brickX, brickY);
            }
            else if(brickNum == 3)
            {
                addObject(new YellowBrick(),brickX, brickY);
            }
            else
            {
                addObject(new RedBrick(), brickX, brickY);
            }
            brickX += 30;
        }
        brickX = 50;
        brickY += 15;
        for(int i = 0; i < 11; i++)
        {
            Random gen = new Random();
            brickNum = gen.nextInt(5);
            if(brickNum == 0)
            {
                addObject(new PurpleBrick(),brickX, brickY);
            }
            else if(brickNum == 1)
            {
                addObject(new BlueBrick(),brickX, brickY);
            }
            else if(brickNum == 2)
            {
                addObject(new GreenBrick(),brickX, brickY);
            }
            else if(brickNum == 3)
            {
                addObject(new YellowBrick(),brickX, brickY);
            }
            else
            {
                addObject(new RedBrick(), brickX, brickY);
            }
            brickX += 30;
        }
        brickX = 50;
        brickY += 15;
        for(int i = 0; i < 11; i++)
        {
            Random gen = new Random();
            brickNum = gen.nextInt(5);
            if(brickNum == 0)
            {
                addObject(new PurpleBrick(),brickX, brickY);
            }
            else if(brickNum == 1)
            {
                addObject(new BlueBrick(),brickX, brickY);
            }
            else if(brickNum == 2)
            {
                addObject(new GreenBrick(),brickX, brickY);
            }
            else if(brickNum == 3)
            {
                addObject(new YellowBrick(),brickX, brickY);
            }
            else
            {
                addObject(new RedBrick(), brickX, brickY);
            }
            brickX += 30;
        }
        brickX = 50;
        brickY += 15;
        for(int i = 0; i < 11; i++)
        {
            Random gen = new Random();
            brickNum = gen.nextInt(5);
            if(brickNum == 0)
            {
                addObject(new PurpleBrick(),brickX, brickY);
            }
            else if(brickNum == 1)
            {
                addObject(new BlueBrick(),brickX, brickY);
            }
            else if(brickNum == 2)
            {
                addObject(new GreenBrick(),brickX, brickY);
            }
            else if(brickNum == 3)
            {
                addObject(new YellowBrick(),brickX, brickY);
            }
            else
            {
                addObject(new RedBrick(), brickX, brickY);
            }
            brickX += 30;
        }
        brickX = 50;
        brickY = 70;
    }
    
    public void populate2()
    {
       for(int i = 0; i < 7; i++)
       {
           addObject(new RedBrick(),brickX, brickY);
           brickX += 30;
       }
       brickX = 80;
       brickY += 15;
       for(int i = 0; i < 7; i++)
       {
           addObject(new PurpleBrick(),brickX, brickY);
           brickX += 30;
       }
       brickX = 110;
       brickY += 15;
       for(int i = 0; i < 7; i++)
       {
           addObject(new BlueBrick(),brickX, brickY);
           brickX += 30;
       }
       brickX = 140;
       brickY += 15;
       for(int i = 0; i < 7; i++)
       {
           addObject(new GreenBrick(),brickX, brickY);
           brickX += 30;
       }
       brickX = 170;
       brickY += 15;
       for(int i = 0; i < 7; i++)
       {
           addObject(new YellowBrick(),brickX, brickY);
           brickX += 30;
       }
       brickX = 50;
       brickY = 70;
    }
    
    public void populate3()
    {
        paddle.removeBall();
        paddle.newBall();
        
        addObject(new RedBrick(), getWidth()/2 - 60, 70 - 35);
        addObject(new RedBrick(), getWidth()/2 + 60, 70 - 35);
        addObject(new RedBrick(), getWidth()/2 + 30, 85 - 35);
        addObject(new RedBrick(), getWidth()/2 - 30, 85 - 35);
        addObject(new RedBrick(), getWidth()/2, 100 - 35);
        addObject(new RedBrick(), getWidth()/2 - 90, 85 - 35);
        addObject(new RedBrick(), getWidth()/2 + 90, 85 - 35);
        addObject(new RedBrick(), getWidth()/2 + 120, 100 - 35);
        addObject(new RedBrick(), getWidth()/2 - 120, 100 - 35);
        addObject(new RedBrick(), getWidth()/2, 220 - 35);
        addObject(new RedBrick(), getWidth()/2 + 30, 205 - 35);
        addObject(new RedBrick(), getWidth()/2 - 30, 205 - 35);
        addObject(new RedBrick(), getWidth()/2 + 60, 190 - 35);
        addObject(new RedBrick(), getWidth()/2 - 60, 190 - 35);
        addObject(new RedBrick(), getWidth()/2 + 90, 175 - 35);
        addObject(new RedBrick(), getWidth()/2 - 90, 175 - 35);
        addObject(new RedBrick(), getWidth()/2 + 120, 160 - 35);
        addObject(new RedBrick(), getWidth()/2 - 120, 160 - 35);
        addObject(new RedBrick(), getWidth()/2 + 150, 145 - 35);
        addObject(new RedBrick(), getWidth()/2 - 150, 145 - 35);
        addObject(new RedBrick(), getWidth()/2 + 150, 130 - 35);
        addObject(new RedBrick(), getWidth()/2 - 150, 130 - 35);
        addObject(new RedBrick(), getWidth()/2 + 150, 115 - 35);
        addObject(new RedBrick(), getWidth()/2 - 150, 115 - 35);
        
        addObject(new YellowBrick(), getWidth()/2 - 60, 85 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 60, 85 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 30, 100 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 30, 100 - 35);
        addObject(new YellowBrick(), getWidth()/2, 115 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 90, 100 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 90, 100 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 120, 115 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 120, 115 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 120, 130 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 120, 130 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 120, 145 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 120, 145 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 90, 160 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 90, 160 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 60, 175 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 60, 175 - 35);
        addObject(new YellowBrick(), getWidth()/2 - 30, 190 - 35);
        addObject(new YellowBrick(), getWidth()/2 + 30, 190 - 35);
        addObject(new YellowBrick(), getWidth()/2, 205 - 35);
        
        addObject(new GreenBrick(), getWidth()/2, 130 - 35);
        addObject(new GreenBrick(), getWidth()/2 - 30, 115 - 35);
        addObject(new GreenBrick(), getWidth()/2 + 30, 115 - 35);
        addObject(new GreenBrick(), getWidth()/2 - 60, 100 - 35);
        addObject(new GreenBrick(), getWidth()/2 + 60, 100 - 35);
        addObject(new GreenBrick(), getWidth()/2 - 90, 115 - 35);
        addObject(new GreenBrick(), getWidth()/2 + 90, 115 - 35);
        addObject(new GreenBrick(), getWidth()/2 - 90, 130 - 35);
        addObject(new GreenBrick(), getWidth()/2 + 90, 130 - 35);
        addObject(new GreenBrick(), getWidth()/2 - 90, 145 - 35);
        addObject(new GreenBrick(), getWidth()/2 + 90, 145 - 35);
        addObject(new GreenBrick(), getWidth()/2 - 60, 160 - 35);
        addObject(new GreenBrick(), getWidth()/2 + 60, 160 - 35);
        addObject(new GreenBrick(), getWidth()/2 - 30, 175 - 35);
        addObject(new GreenBrick(), getWidth()/2 + 30, 175 - 35);
        addObject(new GreenBrick(), getWidth()/2, 190 - 35);
        
        addObject(new BlueBrick(), getWidth()/2, 145 - 35);
        addObject(new BlueBrick(), getWidth()/2 - 30, 130 - 35);
        addObject(new BlueBrick(), getWidth()/2 + 30, 130 - 35);
        addObject(new BlueBrick(), getWidth()/2 - 60, 115 - 35);
        addObject(new BlueBrick(), getWidth()/2 + 60, 115 - 35);
        addObject(new PurpleBrick(), getWidth()/2 - 60, 130 - 35);
        addObject(new PurpleBrick(), getWidth()/2 + 60, 130 - 35);
        addObject(new PurpleBrick(), getWidth()/2 - 60, 145 - 35);
        addObject(new PurpleBrick(), getWidth()/2 + 60, 145 - 35);
        addObject(new BlueBrick(), getWidth()/2 - 30, 160 - 35);
        addObject(new BlueBrick(), getWidth()/2 + 30, 160 - 35);
        addObject(new PurpleBrick(), getWidth()/2 - 30, 145 - 35);
        addObject(new PurpleBrick(), getWidth()/2 + 30, 145 - 35);
        addObject(new PurpleBrick(), getWidth()/2, 160 - 35);
        addObject(new PurpleBrick(), getWidth()/2, 175 - 35);
    }


    public void removeObject (SmoothActor object, int x, int y)
    {
        super.removeObject(object);
        counter[0].decreaseValue();
        counter[2].increaseValue();
        counter2[0].increaseValue();
    }

    public void ballIsOut()
    {        
        if(counter[1].isZero()){
            gameSet();
        }
        else{
            counter[1].decreaseValue();
            paddle.newBall();
        }
    }
    
    public void gameSet()
    {
        if(counter[0].isZero()){
            addObject(new GameBoard("GameClear.png"), getWidth()/2, getHeight()/2);
            addObject(counter2[0], 80, 10);
        }
        else{
            addObject(new GameBoard("GameOver.png"), getWidth()/2, getHeight()/2);
            addObject(counter2[0], 80, 10);
        }
        check = true;
    }

    public void breakBrick()
    {
        counter[0].decreaseValue();
        for(int k = 0; k < 25; k++)
        {
            counter[2].increaseValue();
            counter2[0].increaseValue();
        }
    }

    public boolean getCheck()
    {
        return check;
    }
}

