import javax.swing.*;
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
    public void setTime(int hourN, int minN, int secN)
    {
        hour = hourN;
        min = minN;
        sec = secN;
    }
    public int totalSeconds()
    {
        int number = 3600* hour + 60 * min + sec;
        return number;
    }
    void convertDaylightSaving ( int hours )
    {
        hour += hours;
    }
    public String toString()
    {
        String time = " The time is " + hour + ":" + min +":" +sec + ". \n Total Seconds: " + totalSeconds() ;
        return time;
    }
}
