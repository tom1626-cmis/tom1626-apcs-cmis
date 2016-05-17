import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CardSelector extends JPanel implements ActionListener
{
    //////////////////////////////////////////////////
    static JFrame MainFrame = new JFrame("Select A Card");
    public String name;
    JTextField nameT = new JTextField(4);
    //////////////////////////////////////////////////
    JTextField CardText = new JTextField(4);
    JPanel Text = new JPanel(new GridLayout(2,1));
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
        Text.add(nameT);
        Text.add(CardText);

        nameT.setText(name);
        nameT.setEnabled(false);
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
                    try{
                        SerializationUtil.serialize(SelectedCard, name + ".ser");
                    }
                    catch (IOException a) {
                        a.printStackTrace();
                        return;
                    }
                }});
        Cancel.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e)
                {        
                    MainFrame.setVisible(false);
                    CardText.setText("");
                    SelectedCard = null;
                    for( JRadioButton x : CardSelect)
                    {
                        x.setSelected(false);                        
                    }
                }
            });
        OkCancel.add(Confirm);
        OkCancel.add(Cancel);

        add(Text,BorderLayout.PAGE_START);
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
    public void setName(String nameT)
    {
        name = nameT;
    }
    public void createAndShowGUI(String e) 
    {
        MainFrame.add(new CardSelector(),BorderLayout.CENTER);
        MainFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);
        nameT.setText(e);
        name = nameT.getText();
    }

    public void setCard(Card place)
    {
        place = SelectedCard;
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
