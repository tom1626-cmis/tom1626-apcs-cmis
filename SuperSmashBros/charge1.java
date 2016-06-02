import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class charge1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class charge1 extends Effects
{
    public charge1()
    {
        super(150);
    }    
    public void remove()
    {
        if ( timer != 0)
        {
            timer --;
        }
        if (timer == 0)
        {
            getWorld().addObject(new charge2(), getX(), getY());
            getWorld().removeObject(this);
        }
    }   
}
