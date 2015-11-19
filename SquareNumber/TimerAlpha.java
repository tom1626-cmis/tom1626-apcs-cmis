
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Testing a timer Timer
 * 
 * @author (Pawat) 
 * @version (Alpha1)
 */
public class TimerAlpha
{
    JTextField TimeField;
    Timer timer;
    JFrame MainFrame;

    int totalTime = 60;
    public void Time()
    {
        timer = new Timer();
        while ( totalTime > 0)
        {
            
            timer.schedule(new Second(), 1000);
        }
    }
    public baby sex()
    {
        person1 = UrMom
        person
    }

    class Second implements ActionListener
    {
        private int counter = 0;
    
    }
    

    TimerAlpha()
    {
        Time();
        TimeField = new JTextField(10);
        MainFrame = new JFrame("One Minute");
        MainFrame.setSize(100,100);

        MainFrame.getContentPane().add(TimeField, BorderLayout.PAGE_END);

        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);
    }

    public static void main(String args[])
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.
                getCrossPlatformLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
        }
        TimerAlpha app = new TimerAlpha();

    }
}
