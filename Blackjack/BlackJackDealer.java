import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;

public class BlackJackDealer
{
    public static void Dealer( int Score,  JTextField ScoreField, JTextField CardsField, JTextField ResultField) // DEALER WORKING!!
    {
        Card[] Hand = {BlackJackMoves.RandomCard(), BlackJackMoves.RandomCard()};
        DisplayMethods.ShowCard(CardsField, Hand);
        Score = BlackJackMoves.Score( Hand, Score );
        ScoreField.setText(String.valueOf(Score));
        String Result = "";
        
        while ( Score < 17 )
        {
            Hand = BlackJackMoves.Hit(Hand);
            DisplayMethods.ShowCard(CardsField, Hand);
            Score = BlackJackMoves.Score(Hand, Score);
            ScoreField.setText(String.valueOf(Score));
        }
        if (Score == 21 && Hand.length == 2)
        {
            Result = "BlackJack!";
        }
        else if ( Score >21 )
        {
            Result = "Bust!";
        }
        ResultField.setText(Result);
    }
    public static void main (String args[])
    {
        int Score = 0;
        Dimension d = new Dimension(5,1);
        JTextField ScoreF = new JTextField(); ScoreF.setSize(d);
        JTextField CardF = new JTextField(); CardF.setSize(d);
        JTextField ResultF = new JTextField(); ResultF.setSize(d);
        JPanel Panel = new JPanel();
        Panel.setLayout(new FlowLayout());
        Panel.add(ScoreF); 
        Panel.add(CardF);
        Panel.add(ResultF);
        JFrame MainFrame = new JFrame( "Test");
        
        Dealer(Score, ScoreF, CardF, ResultF);
        MainFrame.getContentPane().add(Panel, BorderLayout.PAGE_END);

        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);
    
        try
        {
            UIManager.setLookAndFeel(UIManager.
                getCrossPlatformLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
        }
        BlackJackDealer app = new BlackJackDealer();
    
    }
}
