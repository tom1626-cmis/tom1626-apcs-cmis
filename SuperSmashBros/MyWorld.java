import greenfoot.*;
import java.util.ArrayList;
import java.awt.Color;
public class MyWorld extends World
{
    ground[] fgrounds = new ground[11];
    ground[] egrounds = new ground[11];
    ground[] bgrounds = new ground[15];
    ArrayList<BallOfDeath> BallArray = new ArrayList<BallOfDeath>();
        int timerBall = 1000;
        int counter = 0;
    Counter P1C = new Counter("P1C");
    Counter P2C = new Counter("P2C");
    Player test1 = new ant(false, P1C);
    Player testx = new man(true,P2C);
    public MyWorld()
    {    
        super(1100, 550, 1); 
        //create counter and players
        addObject(test1,300,0);
        addObject(testx,800,0);
        addObject(P1C,100,40);
        addObject(P2C,1000,40); 
        //walls
        for(int i = 0; i < 5; i++)
        {
            BallArray.add(new BallOfDeath((i/2+1)));
            addObject(BallArray.get(i), (int)(Math.random()*1100), 0);
        }
        for(int i=0; i< fgrounds.length ; i ++)
        {
            fgrounds[i] = new ground();
            addObject(fgrounds[i], i*20+100, 200);
            egrounds[i] = new ground();
            addObject(egrounds[i], i*20+800, 200);
        }
        for(int i= 0; i < bgrounds.length; i++)
        {
            bgrounds[i] = new ground();
            addObject(bgrounds[i], i*25+370,400);
        }
        act();
    }
    
    public static Counter getCounter(Counter C)
    {
        return C;
    }
    public void test()
    {
    }
}