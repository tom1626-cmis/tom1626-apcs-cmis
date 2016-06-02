import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallExplosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallExplosion extends DamagingEffects
{
    public BallExplosion()
    {
        super(15,7,0.5);
    }
    public void act()
    {
        remove();
    }
}
