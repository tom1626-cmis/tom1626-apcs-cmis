
import greenfoot.*;
public class Bomb extends Projectiles implements TPR
{
    int timer = 2;
    public Bomb()
    {
        super(4,4,0.8);
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
