public class ClockStore
{
    Clock[] clocksinStock = new Clock[3];
    public ClockStore()
    {
        clocksinStock[0] = new Clock((int)(Math.random()*24),(int)(Math.random()*60),(int)(Math.random()*60));
        clocksinStock[1] = new Clock((int)(Math.random()*24),(int)(Math.random()*60),(int)(Math.random()*60));
        clocksinStock[2] = new Clock((int)(Math.random()*24),(int)(Math.random()*60),(int)(Math.random()*60));
    }

    public Clock mostseconds()
    {
        Clock output = clocksinStock[0];
        for( Clock e: clocksinStock)
        {
            if (e.totalSeconds()> output.totalSeconds())
            {
                output = e;
            }
        }
        return  output;
    }

    public String toString()
    {
        String output = "Clocks: \n";
        for( Clock e: clocksinStock)
        {
            output += e + "\n";
        }
        return output;
    }
}
