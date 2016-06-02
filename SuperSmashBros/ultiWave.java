import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ultiWave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ultiWave extends Projectiles
{
    public ultiWave()
    {
        super(25,7,0.8);

    }

    public void act() 
    {
        move(speed);

        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }    
}
