

public abstract class TV
{
    // instance variables - replace the example below with your own
    private boolean tvOn;
    
    boolean getTvOn()
    {
        return tvOn;
    }
    TV(boolean n)
    {
        tvOn = n ;
    }
    void setTvOn(boolean n)
    {
        tvOn =n;
    }
    abstract public String tvType();
    public String toString()
    {
        return "   Am I On? ... " + tvOn;
    }
}
