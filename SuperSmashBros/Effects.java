import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Effects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Effects extends Actor
{
    int timer;
    public Effects(int n)
    {
        timer = n;
    }
    public void act() 
    {
        remove();
    }    
    public void remove()
    {
        if ( timer != 0)
        {
            timer --;
        }
        if (timer == 0)
        {
            getWorld().removeObject(this);
        }
    }   
}
