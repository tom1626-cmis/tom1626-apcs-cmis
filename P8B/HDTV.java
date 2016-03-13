
/**
 * Write a description of class HDTV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HDTV extends TV implements Digital
{
    public HDTV()
    {
        super(false);
    }

    public String tvType()
    {
        return "I'm a High Def 24 million color TV";
    }

    public String connectHDMI()
    {
        return "HDMI cable connected";
    }

    public String toString()
    {
        return tvType() + super.toString();
    }
}
