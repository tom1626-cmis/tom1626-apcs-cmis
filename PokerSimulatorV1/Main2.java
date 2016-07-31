import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main2 extends JPanel implements ActionListener
{
    Card[] CardsForHand = new Card[13];
    JButton[] Cards = new JButton[13]; // p1 0-1, p2 2-3, p3 4-5, p 4 6-7
    JTextField[] CardsText = new JTextField[13];
    JPanel[] Groups = new JPanel[13];

    JPanel[] Players = new JPanel[4];
    JTextField[] Chances = new JTextField[4];
    JLabel[] PlayerLabel = new JLabel[4];

    JLabel Flop = new JLabel("Flop\n");
    JLabel River = new JLabel("River\n");
    JLabel Turn = new JLabel("Turn\n");

    JPanel FlopP = new JPanel(new BorderLayout());
    JPanel FlopCards = new JPanel(new GridLayout(1,3));    
    JPanel RiverP = new JPanel(new BorderLayout());
    JPanel TurnP = new JPanel(new BorderLayout());

    int selectedCard;
    JPanel Top = new JPanel(new GridLayout(1,3));
    JPanel Left = new JPanel(new BorderLayout());
    JPanel Right = new JPanel(new BorderLayout());
    JPanel Center = new JPanel(new GridLayout(1,2));
    JPanel MainCenter = new JPanel(new BorderLayout());
    JPanel Display = new JPanel( new BorderLayout());
    JLabel Title = new JLabel("    Poker Simulator v1.0    "); 

    String[] Ranks = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
    String[] Suits = { "♠", "♥", "♦" ,"♣"};
    JPanel RadioButtons= new JPanel(new GridLayout(4,13));
    JPanel Combine = new JPanel(new BorderLayout());
    JPanel OkCancel = new JPanel(new GridLayout(1,2));
    JRadioButton[] CardSelect = new JRadioButton[53];
    Card[] CardsButton = new Card[52];

    JButton Simulate = new JButton( "Simulate" );
    //------- GUI DONE
    
    public Main2()
    {
        super(new BorderLayout());

        for (int i = 0; i < 52; i++)// Choices
        {
            CardsButton[i] = new Card(Ranks[i%13],Suits[i/13]);
            CardSelect[i] = new JRadioButton(CardsButton[i].toString());
            RadioButtons.add(CardSelect[i]);
            CardSelect[i].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        CardsForHand[selectedCard] = Card.reverseToString(e.getActionCommand());
                        for( JRadioButton x : CardSelect)
                        {
                            if(x.getActionCommand() != e.getActionCommand())
                            {
                                x.setSelected(false);
                            }
                            CardsText[selectedCard].setText(e.getActionCommand());
                        }
                    }});
        }
        CardSelect[52] = new JRadioButton("??");
        CardSelect[52].setHorizontalAlignment(SwingConstants.CENTER);
        CardSelect[52].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    CardsForHand[selectedCard] = null;
                    for( JRadioButton x : CardSelect)
                    {
                        if(x.getActionCommand() != e.getActionCommand())
                        {
                            x.setSelected(false);
                        }
                        CardsText[selectedCard].setText(e.getActionCommand());
                    }
                }});// null Choice
        Combine.add(RadioButtons, BorderLayout.PAGE_START);
        Combine.add(CardSelect[52], BorderLayout.CENTER);
        Combine.add(Simulate,BorderLayout.PAGE_END);

        for( int i =0 ; i < 13; i++)
        {
            Cards[i] = new JButton(String.valueOf(i+1)); Cards[i].setSize(new Dimension(1, 5));// NOTE
            CardsForHand[i] = null;
            Cards[i].setHorizontalAlignment(SwingConstants.CENTER);
            Cards[i].addActionListener(this);
            CardsText[i] = new JTextField(5); 
            CardsText[i].setText("??");
            Groups[i] = new JPanel(new GridLayout(2,1));
            Groups[i].add(Cards[i]);
            Groups[i].add(CardsText[i]);
        }
        for( int i = 0; i <4; i++)
        {
            Players[i] = new JPanel(new GridLayout(2,2));
            PlayerLabel[i] = new JLabel("P" + (i+1));
            PlayerLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
            Chances[i] = new JTextField(5);
            Players[i].add(Groups[2*i]);
            Players[i].add(Groups[2*i + 1]);
            Players[i].add(PlayerLabel[i]);
            Players[i].add(Chances[i]);
        }
        Left.add(Players[0]);
        Top.add(Players[1]);
        Title.setFont(new Font("Serif", Font.BOLD, 30));
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        Top.add(Title);
        Top.add(Players[2]);
        Right.add(Players[3]);

        FlopCards.add(Groups[8]);
        FlopCards.add(Groups[9]);
        FlopCards.add(Groups[10]);

        FlopP.add(FlopCards, BorderLayout.PAGE_START);
        Flop.setHorizontalAlignment(SwingConstants.CENTER);
        Flop.setVerticalAlignment(SwingConstants.CENTER);
        FlopP.add(Flop, BorderLayout.PAGE_END);        
        
        RiverP.add(Groups[11], BorderLayout.PAGE_START);
        River.setHorizontalAlignment(SwingConstants.CENTER);
        River.setVerticalAlignment(SwingConstants.CENTER);
        RiverP.add(River, BorderLayout.PAGE_END);

        TurnP.add(Groups[12], BorderLayout.PAGE_START);
        Turn.setVerticalAlignment(SwingConstants.CENTER);
        Turn.setHorizontalAlignment(SwingConstants.CENTER);
        TurnP.add(Turn, BorderLayout.PAGE_END);
             
        JPanel RiverTurn = new JPanel(new GridLayout(1,2));
        RiverTurn.add(RiverP);
        RiverTurn.add(TurnP);

        Center.add(FlopP);
        Center.add(RiverTurn);
        MainCenter.add(Center, BorderLayout.CENTER);

        JLabel CommCards = new JLabel("COMMUNITY CARDS"); CommCards.setFont(new Font("Serif", Font.BOLD, 20));
        CommCards.setHorizontalAlignment(SwingConstants.CENTER);
        MainCenter.add(CommCards, BorderLayout.PAGE_START);

        Display.add(Left, BorderLayout.LINE_START);
        Display.add(Right, BorderLayout.LINE_END);
        Display.add(Top, BorderLayout.PAGE_START);
        Display.add(MainCenter, BorderLayout.CENTER);

        add(Display, BorderLayout.PAGE_START);
        add(Combine, BorderLayout.PAGE_END);
    }

    public void actionPerformed(ActionEvent e)
    {
        selectedCard = Integer.parseInt(e.getActionCommand()) - 1;
    }

    private static void createAndShowGUI() 
    {
        //Create and set up the window.
        JFrame frame = new JFrame("Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Main2();
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
