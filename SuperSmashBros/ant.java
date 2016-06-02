import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ant extends Player implements gravity
{
    public ant(boolean P1, Counter c)
    {
        super(P1,c);
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



}