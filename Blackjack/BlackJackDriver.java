import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class BlackJackDriver
{
    BlackJackDriver()
    {
        JFrame MainFrame = new JFrame("BlackJack");
        JPanel Buttons, TextP;
        JLabel CardLP, ScoreLP, ResultLP;
        JButton Hit, Stand, Play;
        JTextField ResultFieldP, ScoreFieldP, CardFieldP;        

        CardLP = new JLabel("Cards");
        ScoreLP = new JLabel("Score");
        ResultLP = new JLabel("Result");

        Hit = new JButton("Hit"); 
        Stand = new JButton("Stand");
        Play = new JButton("Play Again");

        ResultFieldP = new JTextField(8);
        ScoreFieldP = new JTextField(8);
        CardFieldP = new JTextField(8);

        Buttons = new JPanel();
        Buttons.setLayout(new FlowLayout());
        Buttons.add(Hit);
        Buttons.add(Stand);
        Buttons.add(Play);

        TextP = new JPanel();
        TextP.setLayout(new GridLayout(2,3));
        TextP.add(ScoreLP);
        TextP.add(CardLP);
        TextP.add(ResultLP);
        TextP.add(ScoreFieldP);
        TextP.add(CardFieldP);
        TextP.add(ResultFieldP);

        ArrayList<Card> Cards = new ArrayList<Card>();

        Play.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    BlackJackPlayer.Play(Hit, Stand, ScoreFieldP, ResultFieldP, CardFieldP, Play);
                }
            });
        MainFrame.getContentPane().add(TextP, BorderLayout.PAGE_START);
        MainFrame.getContentPane().add(Buttons, BorderLayout.CENTER);

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
        BlackJackDriver app = new BlackJackDriver();
    }

}
/*            Dealer
 * P1                       P2
 *             Player
 *           Hit Stand PlaceBet
 *           
 *  Dealer Text Field; Result, Cards Score
 *  AI + Player TextField; Money, Result, Bet, Cards, Score
 *  
 *  variables for all; array of cards, score, money
 *  
 *  Display method ( score - scoretext, result - resulttext, bet, bettext, cards, cardstext, money, moneytext, moneybet text)
 */