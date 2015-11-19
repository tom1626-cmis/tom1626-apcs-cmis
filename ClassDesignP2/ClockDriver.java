import javax.swing.JOptionPane;
public class ClockDriver
{
    public static void main(String args[])
    {
        Clock kitchenClock = new Clock();
        
        Clock bedroomClock = new Clock(7,12,23);
        System.out.println("The kitchen clock:" + kitchenClock);
        System.out.println("The bedroom clock:" + bedroomClock);
        
        Clock NewClock = new Clock();
        System.out.println(NewClock);
        NewClock.setTime( 11, 24, 35);
        System.out.println(NewClock);
        NewClock.convertDaylightSaving( 1);
        System.out.println("After Daylight Saving : \n" + NewClock);

    }
}
