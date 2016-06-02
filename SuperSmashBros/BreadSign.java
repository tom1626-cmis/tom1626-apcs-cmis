import greenfoot.*; 
import java.awt.Color;
/**
 * Write a description of class BreadSign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BreadSign extends Actor
{
    String text;
    public BreadSign(String s)
    {
        text = s;
    }

    public void act()
    {       
        setImage( new GreenfootImage(text, 24, Color.GREEN, Color.WHITE));
    }
}
