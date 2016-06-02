import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class charge2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class charge2 extends Effects
{   
    public charge2()
    {
        super(150);
    }    

    public void remove()
    {
        if ( timer != 0)
        {
            timer --;
        }
        if (timer == 0)
        {            
            Player x = (Player)getOneObjectAtOffset(0,45,Player.class);
            Projectiles p = new ultiWave();
            p.setRotation(x.getRotation());
            if(x.leftside)
            {
                getWorld().addObject(p,getX() - 150,getY()+40);
            }
            else
            {
                getWorld().addObject(p,getX() + 150,getY()+40);
            }
            getWorld().removeObject(this);
        }
    }  
}
