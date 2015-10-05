import javax.swing.JOptionPane;
public class ClockDriver
{
    public static void main(String args[])
    {
        Clock kitchenClock = new Clock();
        int hour = Integer.parseInt( JOptionPane.showInputDialog("Hour:"));
        int min = Integer.parseInt(JOptionPane.showInputDialog("Minutes:"));
        int sec = Integer.parseInt(JOptionPane.showInputDialog("Seconds:"));
        
        Clock bedroomClock = new Clock(hour,min,sec);
        System.out.println("The kitchen clock:" + kitchenClock);
        System.out.println("The bedroom clock:" + bedroomClock);
    }
}
