
public class BWTV extends TV implements Analog
{
    
    
    public BWTV()
    {
        super(false);
    }

    public String tvType()
    {
        return "I'm a black and white TV";
    }
    public String rotateRabbitEars()
    {
        return "Rabbit ears rotated 45 degrees";
    }
    public String toString()
    {
        return tvType() + super.toString();
    }
}
