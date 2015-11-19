import java.awt.*;
import javax.swing.*;
public class DisplayMethods
{
    public static void ShowCard( JTextField Text, Card[] Hand ) // WORKING!!
    {
        String ResultText = "";
        for (int i = 0 ; i < Hand.length ; i++)
        {
            ResultText += Hand[i] + "    ";
        }
        Text.setText(ResultText);
    }

    public static void DisplayAll(JTextField ScoreField, int Score, JTextField CardsField, Card[] Cards, JTextField
    MoneyField, int Money, JTextField MoneyBetField, int MoneyBet, JTextField ResultField, String Result) // WORKING!!
    {
        ShowCard( CardsField, Cards);
        MoneyField.setText(String.valueOf(Money));
        MoneyBetField.setText(String.valueOf(MoneyBet));
        ResultField.setText(Result);
        ScoreField.setText(String.valueOf(Score));
    }

}
//////////////////////////// ALL WORKING !!!! /////////////////////////////////