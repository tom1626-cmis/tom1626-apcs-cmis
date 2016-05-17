import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    double kb=1;
    String name;
    boolean dead=false;
    public Counter(String c)
    {
        name = c;
    }

    public void update(double num)
    {
        kb+= num;
    }
    public void diechange()
    {
        dead = true;
    }
    public void act() 
    {
        if(!dead)
        {
            setImage( new GreenfootImage("Damage: " + String.format("%.2f",kb), 24, Color.GREEN, Color.WHITE));  
        }
        else
        {
            setImage( new GreenfootImage("DEAD", 24, Color.GREEN, Color.WHITE));  
        }
    }    
}
