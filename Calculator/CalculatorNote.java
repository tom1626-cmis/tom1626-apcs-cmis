import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class CalculatorNote
{
    JFrame MainFrame;
    JButton Alpha, Beta;
    JPanel Panel;
    JLabel Text;

    CalculatorNote()
    {
        MainFrame = new JFrame("Calculator Version History");
        MainFrame.setSize(500,300);
        Text = new JLabel("     Click on a Button to see the updates       ");
        Text.setFont(new Font("Arial",1,16));
        Alpha = new JButton("> Alpha <");
        Beta = new JButton("> Beta <");
        Panel = new JPanel();

        Alpha.setMnemonic(KeyEvent.VK_I);
        Alpha.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null, "First Version of Calculator: \n" +
                        "- can add, subtract, multiply and divide\n" +
                        "- can use integers\n");
                }
            });
        Beta.setMnemonic(KeyEvent.VK_I);
        Beta.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JOptionPane.showMessageDialog(null, "Second Version of Calculator: \n" +
                        "- can now use doubles \n" +
                        "- can add decimal points \n" +
                        "- can now change index to negative" );
                }
            });

        Panel.setLayout( new GridLayout(3,1));
        Panel.add(Text);
        Panel.add(Alpha);
        Panel.add(Beta);
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
        CalculatorNote app = new CalculatorNote();
    }
}