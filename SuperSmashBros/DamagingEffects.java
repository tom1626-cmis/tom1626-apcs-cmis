import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DamagingEffects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DamagingEffects extends Effects
{
    int timer;
    double damage;
    int kb;
    public DamagingEffects(int x, int kb, double damage)
    {
        super(x);
        this.kb=kb;
        this.damage=damage;
    }
}
