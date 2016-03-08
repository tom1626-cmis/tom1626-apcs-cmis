
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JPanel
{
    JButton FrameOpener = new JButton("Open");
    JTextField cardS = new JTextField(10);
    CardSelector Open = new CardSelector();
    boolean OpenF = true;
    JButton Update = new JButton("Update");
    Card OpenC = new Card("3","NWorking");
    public Main()
    {
        super(new BorderLayout());
        FrameOpener.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e)
                {        
                    if(OpenF)
                    {
                        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    Open.createAndShowGUI();
                                }
                            });
                        OpenF = false;
                    }
                    else
                    {
                         Open.MainFrame.setVisible(true);
                    }
                }
            });
        Update.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(Open.SelectedCard != null)
                    {
                        OpenC = Open.SelectedCard;
                    }
                    cardS.setText(OpenC.toString());                    
                }
            });
        add(FrameOpener,BorderLayout.CENTER);
        add(cardS, BorderLayout.PAGE_END);
        add(Update, BorderLayout.PAGE_START);
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
