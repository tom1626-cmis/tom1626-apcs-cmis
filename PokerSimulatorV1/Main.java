
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JPanel implements ActionListener
{
    JButton FrameOpener = new JButton("Open");
    public Main()
    {

    }

    public void actionPerformed(ActionEvent e) 
    {
            CardSelector.setVisible(true);
    }

    private static void createAndShowGUI() 
    {
        //Create and set up the window.
        JFrame frame = new JFrame("Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Main();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
