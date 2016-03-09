public class LazyMan extends SuperHero
{
    
    LazyMan(String suitColor)
    {
        setSuitColor(suitColor);
        if(Math.random()>.5)
        {
            setCape(true);
        }
    }
    public String motto()
    {
        return "Tomorrow";
    }

    public String toString()
    {
        return "LazyMan\t\t" + super.toString();
    }
}