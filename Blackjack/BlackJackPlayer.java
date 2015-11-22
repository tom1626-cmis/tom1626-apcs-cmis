import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackJackPlayer
{
    public boolean Play(JButton Hit, JButton Stand, JTextField ScoreField, JTextField ResultField, 
    JTextField CardsField)
    {
        int Score = 0;
        Card[] Cards =  {BlackJackMoves.RandomCard(), BlackJackMoves.RandomCard()};
        Score = BlackJackMoves.Score ( Cards, Score);
        DisplayMethods.ShowCard(CardsField, Cards);
        ScoreField.setText(String.valueOf(Score));

        Hit = new JButton();
        class Hit implements ActionListener { 
            public void actionPerformed(ActionEvent e) 
            {
                New.getText(Card.ValueOf())
                Card[] New = new Card[Cards.length+1];
                New = BlackJackMoves.Hit(Cards);
            }
        }
        return true;
    }

  
}
