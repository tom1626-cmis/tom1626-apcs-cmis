import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallExplosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallExplosion extends Actor
{
    int timer = 15;
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
