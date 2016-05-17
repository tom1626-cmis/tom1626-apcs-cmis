import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor implements gravity
{
    double speed = 0;
    boolean jump = true;
    boolean leftside = false;
    int timer11 = 0;
    boolean P1;
    double kb = 1;
    int dx = 0;
    Counter counter;

    public Player(boolean P1, Counter c)
    {
        this.P1 =P1;
        counter =c;
    }

    public void act() 
    {
        forceMove();
        TouchingP();
        checkFall();
        movement();
        keys();
        die();
    }

    public void fall()
    {
        setLocation(getX(), getY() + (int)(speed));
        speed += 0.5;
        if (speed >= 15)
        {
            speed = 15;
        }
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
            jump = true;
            return true;
        }

    }

    public void checkFall()
    {
        if(onGround()&& speed>=0)
        {
            speed = 0;
        }
        else
        {
            fall();
        }
    }

    public void movement()
    {
        if(P1 == true)
        {
            if(Greenfoot.isKeyDown("left"))
            {
                if(!leftside)
                {
                    leftside = true;
                    turn(180);
                }
                move(3);
            }
            if(Greenfoot.isKeyDown("right"))
            {
                if(leftside)
                {
                    leftside = false;

                    turn(180);
                }
                move(3);
            }
            if(Greenfoot.isKeyDown("up")&& jump)
            {
                jump = false;
                setLocation(getX(),getY()- 15);
                speed = -15;
            }
        }
        else
        {
            if(Greenfoot.isKeyDown("a"))
            {
                if(!leftside)
                {
                    leftside = true;
                    turn(180);
                }
                move(3);
            }
            if(Greenfoot.isKeyDown("d"))
            {
                if(leftside)
                {
                    leftside = false;

                    turn(180);
                }
                move(3);
            }
            if(Greenfoot.isKeyDown("w")&& jump)
            {
                jump = false;
                setLocation(getX(),getY()- 15);
                speed = -15;
            }
        }
    }

    public void keys()
    {
        if(P1)
        {
            if (timer11!=0) {timer11--;}
            if(Greenfoot.isKeyDown("l") && timer11 == 0)
            {
                timer11 +=15;
                Projectiles p= new Bomb();
                p.setRotation(getRotation());
                if(leftside)
                {
                    getWorld().addObject(p,getX() - 40,getY());
                }
                else
                {

                    getWorld().addObject(p,getX() + 40,getY());
                }
            }
        }
        else
        {

            if (timer11!=0) {timer11--;}
            if(Greenfoot.isKeyDown("e") && timer11 == 0)
            {
                timer11 +=15;
                Projectiles p= new Bomb();
                p.setRotation(getRotation());

                if(leftside)
                {
                    getWorld().addObject(p,getX() - 40,getY());
                }
                else
                {

                    getWorld().addObject(p,getX() + 40,getY());
                }
            }
        }
    }

    public void TouchingP()
    {
        if(getWorld() != null)
        {
            Projectiles x = (Projectiles)getOneObjectAtOffset(-2,0,Projectiles.class);
            Projectiles y = (Projectiles)getOneObjectAtOffset(2,0,Projectiles.class);
            if(x !=null )
            {
                double num= Math.random()*x.damage ;
                kb+= num;
                MyWorld.getCounter(counter).update(num);
                if(x.getX() > getX())
                {
                    dx = (int)(kb/3 * x.kb);
                    speed = (int)(-kb/3 * x.kb);}
                else{
                    dx = (int)(kb/3 * x.kb);
                    speed = (int)(-kb/3 * x.kb);}
            }
            if(y != null)
            {
                double num= Math.random()*y.damage ;
                kb+= num;
                MyWorld.getCounter(counter).update(num);
                if(y.getX() > getX())
                {
                    dx = (int)(kb/3 * y.kb);
                    speed = (int)(-kb/3 * y.kb);}
                else{
                    dx = (int)(kb/3 * y.kb);
                    speed = (int)(-kb/3 * y.kb);}
            }
        }
    }

    public void die()
    {
        if(getY() > getWorld().getHeight()-30)
        {
            getWorld().removeObject(this);
        }
    }

    public void forceMove()
    {
        if(getWorld()!= null)
        {
            setLocation(getX()+dx,getY());
            if(dx > 0)
            {
                dx--;
            }
            else if( dx< 0)
            {
                dx++;
            }
        }
    }

    public void TouchingBall()
    {
        if(getWorld() != null)
        {
            Actor x = getOneObjectAtOffset(0,0,BallOfDeath.class);
            if(x !=null)
            {
                double num= Math.random()*0.7 ;
                kb+= num;
                if(x.getX() < getX())
                {
                    dx = (int)(7 * kb);
                    speed = (int)(-2 * kb);}
                else{
                    dx = (int)(7 * kb);
                    speed = (int)(-2 * kb);}
            }

            Actor y = getOneObjectAtOffset(0,0,BallExplosion.class);
            if(y !=null)
            {
                double num= Math.random()*0.7 ;
                kb+= num;
                if(x.getX() < getX())
                {
                    dx = (int)(7 * kb);
                    speed = (int)(-2 * kb);}
                else{
                    dx = (int)(7 * kb);
                    speed = (int)(-2 * kb);}
            }
        }
    }

}