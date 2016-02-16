import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game2 extends JPanel implements ActionListener
{
    int[][] numbers = new int[10][10];
    JLabel[] Labels = new JLabel[100];
    JButton[] Buttons = new JButton[100];
    JTextField[] Texts = new JTextField[100];
    JLabel Player1 = new JLabel("Player 1");
    JLabel Player2 = new JLabel("Player 2");
    JTextField P1Turn = new JTextField(5); 
    JTextField P2Turn = new JTextField(5); 
    boolean turn = true;
    public Game2()
    {
        super(new BorderLayout());
        //first round
        for(int row = 0; row< numbers.length; row++)
        {
            for(int col = 0; col< numbers[0].length; col++)
            {
                numbers[row][col] = (int)(Math.random()*99 +1);
            }
        }
        // setting answer first round
        int rowAnswer = (int)(Math.random()*9);
        int colAnswer = (int)(Math.random()*9);
        numbers[rowAnswer][colAnswer] = 0;
        // setting up interface tools
        P1Turn.setEnabled(false);P1Turn.setDisabledTextColor(Color.BLACK);
        P2Turn.setEnabled(false);P2Turn.setDisabledTextColor(Color.BLACK);
        for(int i= 1; i <= 100; i++)
        {
            Labels[i-1]  = new JLabel(String.valueOf(i)); 
            Buttons[i-1] = new JButton(String.valueOf(i));Buttons[i-1].setSize(new Dimension(5,5));
            Buttons[i-1].addActionListener(this);
            Texts[i-1] = new JTextField(5); Texts[i-1].setEnabled(false);Texts[i-1].setDisabledTextColor(Color.BLACK);
        }
        JPanel LabelText = new JPanel(new GridLayout(20,10));
        for(int i = 0;i < 10;i++)
        {
            LabelText.add(Labels[10*i]);
            LabelText.add(Labels[10*i+1]);
            LabelText.add(Labels[10*i+2]);
            LabelText.add(Labels[10*i+3]);
            LabelText.add(Labels[10*i+4]);
            LabelText.add(Labels[10*i+5]);
            LabelText.add(Labels[10*i+6]);
            LabelText.add(Labels[10*i+7]);
            LabelText.add(Labels[10*i+8]);
            LabelText.add(Labels[10*i+9]);
            LabelText.add(Texts[10*i+0]);
            LabelText.add(Texts[10*i+1]);
            LabelText.add(Texts[10*i+2]);
            LabelText.add(Texts[10*i+3]);
            LabelText.add(Texts[10*i+4]);
            LabelText.add(Texts[10*i+5]);
            LabelText.add(Texts[10*i+6]);
            LabelText.add(Texts[10*i+7]);
            LabelText.add(Texts[10*i+8]);
            LabelText.add(Texts[10*i+9]);
        }
        JPanel ButtonPanel =  new JPanel(new GridLayout(10,10));
        for( int i = 0; i < 100; i ++)
        {
            ButtonPanel.add(Buttons[i]);
        }
        JPanel PlayerPanel = new JPanel(new GridLayout(4,1));
        PlayerPanel.add(Player1);
        PlayerPanel.add(P1Turn);
        PlayerPanel.add(Player2);
        PlayerPanel.add(P2Turn);
        P1Turn.setText("Turn");
        add(LabelText,BorderLayout.PAGE_START);
        add(ButtonPanel,BorderLayout.CENTER);
        add(PlayerPanel,BorderLayout.LINE_START);
        //GAME
        JButton Reset = new JButton("Reset");
        // filling in numbers
        Reset.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    for( int i = 0; i < 100; i ++)
                    {
                        Buttons[i].setEnabled(true);
                        Texts[i].setText("");
                    }
                    P1Turn.setText("Turn");
                    P2Turn.setText("");
                    turn = true;
                    for(int row = 0; row< numbers.length; row++)
                    {
                        for(int col = 0; col< numbers[0].length; col++)
                        {
                            numbers[row][col] = (int)(Math.random()*99 +1);
                        }
                    }
                    // setting answer
                    int rowAnswer = (int)(Math.random()*9);
                    int colAnswer = (int)(Math.random()*9);
                    numbers[rowAnswer][colAnswer] = 0;

                }
            });
        add(Reset,BorderLayout.LINE_END);
    }

    public void actionPerformed(ActionEvent e) 
    {
        Texts[Integer.parseInt(e.getActionCommand())-1].setText(String.valueOf(numbers[(Integer.parseInt(e.getActionCommand())-1)/10][(Integer.parseInt(e.getActionCommand())-1)%10]));
        Buttons[Integer.parseInt(e.getActionCommand())-1].setEnabled(false);

        if(Texts[Integer.parseInt(e.getActionCommand())-1].getText().equals("0"))
        {
            for( int i = 0; i < 100; i ++)
            {
                Buttons[i].setEnabled(false);
            }
            if(turn == true)
            {
                P1Turn.setText("WINNER");
                P2Turn.setText("LOSER");
            }
            if(turn == false)
            {
                P2Turn.setText("LOSER");
                P1Turn.setText("WINNER");
            }
        }
        else
        {
            turn = turn == false;
            if(turn == true)
            {
                P1Turn.setText("Turn");
                P2Turn.setText("");
            }
            if(turn == false)
            {
                P2Turn.setText("Turn");
                P1Turn.setText("");
            }
        }
    }

    private static void createAndShowGUI() 
    {
        //Create and set up the window.
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Game2();
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