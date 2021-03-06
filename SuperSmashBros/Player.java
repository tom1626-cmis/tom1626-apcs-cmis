import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Player extends Actor implements gravity
{
    double speed = 0;
    boolean jump = true;
    boolean leftside = false;
    int timer11 = 0;
    int timer21 = 0;
    int timersuper = 0;
    int chargingtimer = 0;
    boolean P1;
    double kb = 1;
    int dx = 0;
    Counter counter;
    int marblecounter = 10;
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
        TouchingE();
    }

    public void fall()
    {
        if(chargingtimer==0)
        {
            setLocation(getX(), getY() + (int)(speed));
            speed += 0.5;
            if (speed >= 15)
            {
                speed = 15;
            }
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
        if(chargingtimer==0)
        {
            if(P1 == true)
            {
                if(Greenfoot.isKeyDown("left"))
                {
                    if(!leftside)
                    {
                        leftside = true;

                        GreenfootImage img = getImage(); img.mirrorVertically();
                        setImage(img);
                        turn(180);
                    }
                    move(3);
                }
                if(Greenfoot.isKeyDown("right"))
                {
                    if(leftside)
                    {
                        leftside = false;

                        GreenfootImage img = getImage(); img.mirrorVertically();
                        setImage(img);
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
                        GreenfootImage img = getImage(); img.mirrorVertically();
                        setImage(img);
                        turn(180);
                    }
                    move(3);
                }
                if(Greenfoot.isKeyDown("d"))
                {
                    if(leftside)
                    {
                        leftside = false;
                        GreenfootImage img = getImage(); img.mirrorVertically();
                        setImage(img);
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
    }

    public void keys()
    {

        if(P1)
        {
            if (timer11!=0) {timer11--;}
            if(Greenfoot.isKeyDown("l") && timer11 == 0)
            {
                timer11 +=100;
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
            if (timer21!=0 && marblecounter!= 10) {timer21--;}
            if(timer21==0){marblecounter=10; timer21+=100;}
            if(Greenfoot.isKeyDown("k") && marblecounter != 0)
            {
                marblecounter--;
                Projectiles p= new Marble();
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
            if(timersuper!=0){timersuper--;}
            if(Greenfoot.isKeyDown("j")&& timersuper == 0)
            {
                jump=true;
                timersuper+=900;
                chargingtimer = 350;
                getWorld().addObject(new charge1(),getX(),getY()-35);
            }
        }
        else
        {

            if (timer11!=0) {timer11--;}
            if(Greenfoot.isKeyDown("e") && timer11 == 0)
            {
                timer11 +=100;
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
            if (timer21!=0 && marblecounter!= 10) {timer21--;}
            if(timer21==0){marblecounter=10; timer21+=100;}
            if(Greenfoot.isKeyDown("r") && marblecounter!= 0)
            {
                marblecounter--;
                Projectiles p= new Marble();
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
            if(timersuper!=0){timersuper--;}
            if(Greenfoot.isKeyDown("t")&& timersuper == 0)
            {
                jump = true;
                timersuper+=900;
                chargingtimer = 350;
                getWorld().addObject(new charge1(),getX(),getY()-45);
            }
        }
        if(chargingtimer>0){chargingtimer--;}
    }

    public void TouchingP()
    {
        if(getWorld() != null)
        {
            if(chargingtimer <50)
            {
                Projectiles x = (Projectiles)getOneObjectAtOffset(-2,0,Projectiles.class);
                Projectiles y = (Projectiles)getOneObjectAtOffset(2,0,Projectiles.class);
                if(x !=null )
                {
                    double num= Math.random()*x.damage ;
                    kb+= num;
                    MyWorld.getCounter(counter).update(num);
                    if(x.getRotation() ==0)
                    {
                        dx = (int)(kb/3 * x.kb);
                        speed = (int)(-kb/4 * x.kb);}
                    else{
                        dx = (int)-(kb/3 * x.kb);
                        speed = (int)(-kb/4 * x.kb);}
                }
                if(y != null)
                {
                    double num= Math.random()*y.damage ;
                    kb+= num;
                    MyWorld.getCounter(counter).update(num);
                    if(y.getRotation() ==0)
                    {
                        dx = (int)(kb/3 * y.kb);
                        speed = (int)(-kb/4 * y.kb);}
                    else{
                        dx = (int)(-kb/3 * y.kb);
                        speed = (int)(-kb/4 * y.kb);}
                }
            }
        }
    }

    public void TouchingE()
    {
        if(getWorld() != null)
        {
            if(chargingtimer <50)
            {
                DamagingEffects x = (DamagingEffects)getOneObjectAtOffset(-2,0,DamagingEffects.class);
                DamagingEffects y = (DamagingEffects)getOneObjectAtOffset(2,0,DamagingEffects.class);
                if(x !=null )
                {
                    double num= Math.random()*x.damage ;
                    kb+= num;
                    MyWorld.getCounter(counter).update(num);
                    if(x.getX() > getX())
                    {
                        dx = (int)(-kb/2.5 * x.kb);
                        speed = (int)(-kb/3 * x.kb);}
                    else{
                        dx = (int)(kb/2.5 * x.kb);
                        speed = (int)(kb/3 * x.kb);}
                }
                if(y != null)
                {
                    double num= Math.random()*y.damage ;
                    kb+= num;
                    MyWorld.getCounter(counter).update(num);
                    if(y.getX() > getX())
                    {
                        dx = (int)(-kb/2.5 * y.kb);
                        speed = (int)(-kb/3 * y.kb);}
                    else{
                        dx = (int)(kb/3 * y.kb);
                        speed = (int)(-kb/3* y.kb);}
                }
            }
        }
    }

    public void die()
    {
        if(getY() > getWorld().getHeight()-30)
        {
            getWorld().removeObject(this);
            counter.diechange();
        }
        else if(isAtEdge() && Math.abs(dx)>40)
        {
            getWorld().removeObject(this);
            counter.diechange();
        }
    }

    public void forceMove()
    {
        if(getWorld()!= null)
        {
            if(chargingtimer<80)
            {
                setLocation(getX()+dx,getY());
                if(dx > 0)
                {
                    dx-= 0.5;
                }
                else if( dx< 0)
                {
                    dx+= 0.5;
                }
            }
        }
    }

}

