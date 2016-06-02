import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Marble extends Projectiles
{
    int timer = 4;
    public Marble()
    {
        super(15,2,0.2);

    }

    public void act() 
    {

        move(speed);

        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else if(!touching)
        {
            TPR();
        }
        else if (timer != 0)
        {
            timer --;
        }
        else
        {
            getWorld().removeObject(this);
        }

    }

    public void TPR()
    {
        Actor x = getOneObjectAtOffset(0,0,Player.class);
        if(x == null )
        {
        }
        else
        {
            touching = true;
        }

    }
}
