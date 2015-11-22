import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BlackJackAI
{
    public static void Dealer(JTextField ScoreField, JTextField CardsField, JTextField ResultField) // DEALER WORKING!!
    {
        int Score = 0;
        java.util.Timer timer = new java.util.Timer();
        Card[] Hand = {BlackJackMoves.RandomCard()};
        try {
            Thread.sleep(1000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Hand  = BlackJackMoves.Hit(Hand);
        DisplayMethods.ShowCard(CardsField, Hand);
        Score = BlackJackMoves.Score( Hand, Score );
        ScoreField.setText(String.valueOf(Score));
        String Result = "";
        while(Score < 15)
        {
            Hand = BlackJackMoves.Hit(Hand);
            DisplayMethods.ShowCard(CardsField, Hand);
            Score = BlackJackMoves.Score(Hand, Score);
            ScoreField.setText(String.valueOf(Score));
        }
        double chanceOfBet = (19-Score/6);

        while ( chanceOfBet > Math.random())
        {
            Hand = BlackJackMoves.Hit(Hand);
            DisplayMethods.ShowCard(CardsField, Hand);
            Score = BlackJackMoves.Score(Hand, Score);
            ScoreField.setText(String.valueOf(Score));
            chanceOfBet = (19-Score/6);
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

    static class RemindTask extends TimerTask {
        public void run() {

        }
    }
    public static void main (String args[])
    {

        Dimension d = new Dimension(5,1);
        JTextField ScoreF = new JTextField(); ScoreF.setSize(d);
        JTextField CardF = new JTextField(); CardF.setSize(d);
        JTextField ResultF = new JTextField(); ResultF.setSize(d);
        JTextField MoneyF = new JTextField(); ResultF.setSize(d);
        JPanel Panel = new JPanel();
        Panel.setLayout(new FlowLayout());
        Panel.add(ScoreF); 
        Panel.add(CardF);
        Panel.add(ResultF);
        JFrame MainFrame = new JFrame( "Test");

        Dealer(ScoreF, CardF, ResultF);
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
