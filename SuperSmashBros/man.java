import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class testX here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends Player
{
    public man(boolean P1,  Counter counter)
    {
        super(P1,counter);
    }

    public void act() 
    {
        if(getWorld() != null)
        {
            TouchingP();
            checkFall();
            movement();
            keys();
            die();
            forceMove();
        TouchingE();
        }
    }    

  

    // public void special powers
}