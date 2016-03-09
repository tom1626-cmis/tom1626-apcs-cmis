public class FriedEggMan extends SuperHero
{
    
    FriedEggMan(String suitColor)
    {
        setSuitColor(suitColor);
        if(Math.random()>.5)
        {
            setCape(true);
        }
    }
    public String motto()
    {
        return "The yolk is watching you!";
    }

    public String toString()
    {
        return "FriedEggMan\t" + super.toString();
    }
}