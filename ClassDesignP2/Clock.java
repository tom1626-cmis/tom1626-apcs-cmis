
public class Clock
{
    private int hour;
    private int min;
    private int sec;
    public Clock()
    {
        hour = 12;
        min = 30;
        sec = 46;
    }
    public Clock ( int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    
    public String toString()
    {
        String time = " The time is " + hour + ":" + min +":" +sec + ".";
        return time;
    }
}
