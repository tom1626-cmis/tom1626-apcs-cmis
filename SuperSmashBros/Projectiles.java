import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Projectiles extends Actor
{
    int speed;
    int kb;
    double damage;
    boolean touching = false;
    public Projectiles(int num, int kb, double damage)
    {
        speed = num;
        this.kb = kb;
        this.damage = damage;
    }
}
