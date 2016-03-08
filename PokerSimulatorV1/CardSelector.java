
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CardSelector extends JPanel implements ActionListener
{
    //////////////////////////////////////////////////
    static JFrame MainFrame = new JFrame("Select A Card");
    public String test = "test";
    //////////////////////////////////////////////////
    JTextField CardText = new JTextField(4);
    JButton Confirm = new JButton("OK");
    JButton Cancel = new JButton("Reset");
    JRadioButton[] CardSelect = new JRadioButton[52];
    Card[] Cards = new Card[52];
    String[] Ranks = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
    String[] Suits = { "♠", "♥", "♦" ,"♣"};
    public Card SelectedCard = null;
    JPanel RadioButtons= new JPanel(new GridLayout(13,4));
    JPanel OkCancel = new JPanel(new GridLayout(1,2));
    public CardSelector()
    {
        super(new BorderLayout());
        for (int i = 0; i < 52; i++)
        {
            Cards[i] = new Card(Ranks[i/4],Suits[i%4]);
            CardSelect[i] = new JRadioButton(Cards[i].toString());
            RadioButtons.add(CardSelect[i]);
            CardSelect[i].addActionListener(this);
        }
        Confirm.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e)
                {        
                    MainFrame.setVisible(false);

                    SelectedCard = null;
                }
            });
        Cancel.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e)
                {        
                    MainFrame.setVisible(false);
                }
            });
        OkCancel.add(Confirm);
        OkCancel.add(Cancel);

        add(CardText,BorderLayout.PAGE_START);
        add(RadioButtons,BorderLayout.CENTER);
        add(OkCancel,BorderLayout.PAGE_END);
    }

    public void actionPerformed(ActionEvent e)
    {
        SelectedCard = Card.reverseToString(e.getActionCommand());
        for( JRadioButton x : CardSelect)
        {
            if(x.getActionCommand() != e.getActionCommand())
            {
                x.setSelected(false);
            }
            CardText.setText(SelectedCard.toString());
        }
    }

    public static void createAndShowGUI() 
    {
        MainFrame.add(new CardSelector(),BorderLayout.CENTER);
        MainFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        try
        {
            UIManager.setLookAndFeel(UIManager.
                getCrossPlatformLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
        }
        CardSelector app = new CardSelector();
    }

}
