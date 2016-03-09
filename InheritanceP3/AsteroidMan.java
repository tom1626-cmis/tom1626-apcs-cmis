
public class AsteroidMan extends SuperHero
{
    
    AsteroidMan(String suitColor)
    {
        setSuitColor(suitColor);
        if(Math.random()>.5)
        {
            setCape(true);
        }
    }
    public String motto()
    {
        return "Things will get a bit rocky!";
    }

    public String toString()
    {
        return "AsteroidMan\t" + super.toString();
    }
}
