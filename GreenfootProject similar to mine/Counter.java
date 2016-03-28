import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Color;
import java.awt.Graphics;

public class Counter  extends Actor
{

    private static final Color textColor = new Color(255, 0, 0);
    
    private int value;
    private String text;
    private int stringLength;
    
    public Counter(String prefix, int value)
    {
        text = prefix;
        this.value = value;
        stringLength = (text.length() + 2) * 10;

        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);

        updateImage();
    }

    public void act()
    {
        updateImage();
    }
    
    public int getValue()
    {
        return value;
    }

    public void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 12);
    }

    public boolean isZero()
    {
        boolean result=false;
        
        if(value==0){
            result=true;
        }
        
        return result;
    }

    public void decreaseValue()
    {
        value--;
    }
    
    public void increaseValue()
    {
        value++;
    }
}
