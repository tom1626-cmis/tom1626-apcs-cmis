
import greenfoot.*;
public class Bomb extends Projectiles
{

    public Bomb()
    {
        super(4,3,0.8);
    }

    public void act() 
    {
        move(speed);

        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else
        {
            Touching();
        }
    }    

    public void Touching()
    {
        Actor x = getOneObjectAtOffset(0,0,Player.class);
        if(x == null )
        {
        }
        else
        {
           
            getWorld().removeObject(this);;
        }

    }


    }
