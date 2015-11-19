import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class StatRecorderVersionHistory
{
    JFrame MainFrame;
    JButton V1, V2;
    JPanel Panel;
    JLabel Text;

    StatRecorderVersionHistory()
    {
        MainFrame = new JFrame("Calculator Version History");
        MainFrame.setSize(500,300);
        Text = new JLabel("     Click on a Button to see the updates       ");
        Text.setFont(new Font("Arial",1,16));
        V1 = new JButton("> V1 <");
        V2 = new JButton("> V2 <");
        Panel = new JPanel();

        V1.setMnemonic(KeyEvent.VK_I);
        V1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null, "V1: \n" +
                        "- can lock the indexes and keep stats\n");
                }
            });
        V2.setMnemonic(KeyEvent.VK_I);
        V2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null, "V2: \n" +
                        "- automatically creates new index if none of them are equal \n" +
                        "- lock button removed (unneccessary) \n" +
                        "- can be recorded by pressing 'Enter'");
                }
            });

        Panel.setLayout( new GridLayout(3,1));
        Panel.add(Text);
        Panel.add(V1);
        Panel.add(V2);
        MainFrame.getContentPane().add(Panel, BorderLayout.PAGE_START);

        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.
                getCrossPlatformLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
        }
        StatRecorderVersionHistory app = new StatRecorderVersionHistory();
    }
}