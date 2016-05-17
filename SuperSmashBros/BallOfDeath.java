import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallOfDeath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallOfDeath extends Actor
{
    int speed;
    public BallOfDeath(int x)
    {
        speed = x;
    }

    public void act() 
    {
        checkFall();
    }    

    public void fall()
    {
        setLocation(getX(), getY() + (int)(speed));
    }

    public boolean onGround()
    {
        int spriteheight = getImage().getHeight();
        int lookForGround = (int)(spriteheight/2)+2;
        Actor ground = getOneObjectAtOffset(0,lookForGround,ground.class);
        if(ground == null)
        {
            return false;
        }
        else
        {
            BallExplosion p = new BallExplosion();
            getWorld().addObject(p, getX(), getY());
            return true;
        }

    }

    public boolean touchingP()
    {
        Actor ground = getOneObjectAtOffset(0,0,Player.class);
        if(ground == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void checkFall()
    {
        if(onGround()&& speed>=0)
        {
                setLocation((int)(Math.random()*1100),0);             
        }
        else if(getY() > getWorld().getHeight() - 50)
        {
            setLocation((int)(Math.random()*1100),0); 
        }
        else
        {
            fall();
        }
    }
}
