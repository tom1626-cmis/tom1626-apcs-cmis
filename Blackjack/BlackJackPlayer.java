import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackJackPlayer
{
    public boolean Play(JButton Hit, JButton Stand, JTextField ScoreField, JTextField ResultField, 
    JTextField CardsField, int Score, Card[] Cards)
    {
        Cards = {BlackJackMoves.RandomCard(), BlackJackMoves.RandomCard()};
        int Score = Score ( Cards, Score);
        DisplayMethods.ShowCard(CardsField, Cards);
        ScoreField.setText(String.valueOf(Score));
    }
    public static void main (String args[])
    {
    }
}
