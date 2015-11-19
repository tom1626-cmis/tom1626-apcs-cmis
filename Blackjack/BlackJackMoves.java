import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BlackJackMoves
{
    public static Card RandomCard()
    {
        String[] PossibleCards = { "A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
        String[] PossibleSuits = { "♠", "♥", "♦" ,"♣"};
        int RandomNumber = (int)(Math.random()*13);
        int RandomNumberS = (int)(Math.random()*4);
        int value = RandomNumber+1;
        if (RandomNumber > 9)
        {
            value = 10;
        }
        Card Card = new Card(PossibleCards[RandomNumber],PossibleSuits[RandomNumberS],value);
        return Card;
    }

    public static Card[] Hit(Card[] Hand)
    {
        Card[] Output = new Card[ Hand.length + 1 ];
        for(int i = 0; i < Hand.length; i++)
        {
            Output[i] = Hand[i];
        }
        Output[Hand.length] = RandomCard();
        return Output;
    }

    public static int Score( Card[] Hand, int Score)
    {
        Score = 0;
        for(int i = 0; i < Hand.length; i++)
        {

            Score+= Hand[i].value; 
            if (Hand[i].value == 1 && Score <= 11)
            {
                Score +=10;
            }  
        }
        return Score;
    }
    public static void main (String args[])
    {
        Card[] Card = {BlackJackMoves.RandomCard(),BlackJackMoves.RandomCard(),BlackJackMoves.RandomCard()};
        int Score = 0;
         Score = Score( Card,Score);
        for(int i = 0; i < Card.length; i++)
        {
            System.out.print(Card[i]);
        }
        System.out.println(Score);
    }
}
