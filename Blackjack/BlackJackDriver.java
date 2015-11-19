import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackJackDriver
{
    BlackJackDriver()
    {
        // Player Playing //
        JButton Hit, Stand, Bet;
        JTextField PlayerMoney, PlayerCards, PlayerResult, PlayerMoneyBet, PlayerScore;
        int ScoreP,  MoneyP, MoneyBetP;
        
        Hit = new JButton("Hit"); Hit.setEnabled(false);
        Stand = new JButton("Stand"); Hit.setEnabled(false);
        Bet = new JButton("Set Bet");
        
        Card[] Hand = {BlackJackMoves.RandomCard(), BlackJackMoves.RandomCard()};

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
 *  Dealer Text Field: Result, Cards Score
 *  AI + Player TextField: Money, Result, Bet, Cards, Score
 *  
 *  variables for all: array of cards, score, money
 *  
 *  Display method ( score - scoretext, result - resulttext, bet, bettext, cards, cardstext, money, moneytext, moneybet text)
 */