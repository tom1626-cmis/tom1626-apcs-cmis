public class myWatch extends myDevice
{
    String time;
    public myWatch(int h, int m, int s)
    {
        super("Clock",199);
        time = h+":"+m+":"+s;

    }

    public String toString()
    {
        return super.toString() + "Time: "+ time;
    }
}
