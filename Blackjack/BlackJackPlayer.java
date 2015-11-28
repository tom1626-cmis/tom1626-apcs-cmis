import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BlackJackPlayer
{
    public static void Play(JButton Hit, JButton Stand, JTextField ScoreField, JTextField ResultField, 
    JTextField CardsField, JButton Play)
    {

        ArrayList<Card> Cards = new ArrayList<Card>(); 
        Cards.add(BlackJackMoves.RandomCard());
        Cards.add(BlackJackMoves.RandomCard());
        ResultField.setText("");
        Hit.setEnabled(true);
        Stand.setEnabled(true);

        Stand.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Hit.setEnabled(false);
                    Stand.setEnabled(false);
                    Play.setEnabled(true);
                    Cards.clear();
                    return;
                }
            });
        int Score = 0;

        DisplayMethods.ShowCardP(CardsField, Cards);
        for(int i = 0; i < Cards.size(); i++)
        {
            Score+= (Cards.get(i)).value; 
            if (Cards.get(i).value == 1 && Score <= 11)
            {
                Score +=10;
            }  
        }

        if (Score == 21)
        {
            ResultField.setText("BlackJack!");
            Hit.setEnabled(false);
            Stand.setEnabled(false);
            Play.setEnabled(true);
            Cards.clear();
            return;
        }

        ScoreField.setText(String.valueOf(Score));

        Hit.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    BlackJackMoves.HitP(Cards, CardsField);
                    int ScoreX = 0;
                    for(int i = 0; i < Cards.size(); i++)
                    {
                        ScoreX+= (Cards.get(i)).value; 
                        if (Cards.get(i).value == 1 && ScoreX <= 11)
                        {
                            ScoreX +=10;
                        }  
                    }
                    ScoreField.setText(String.valueOf(ScoreX));

                    if (ScoreX > 21)
                    {
                        ResultField.setText("Bust!");
                        Hit.setEnabled(false);
                        Stand.setEnabled(false);
                        Play.setEnabled(true);
                        Cards.clear();
                        return;
                    }
                }
            });
    }

    public static void main(String args[])
    {
        JButton Hit, Stand, Play;
        JTextField ScoreF, CardF, ResultF;
        JFrame MainFrame = new JFrame("Player Test"); MainFrame.setSize(500,500);
        Hit = new JButton("Hit"); Hit.setSize(new Dimension(5,5));
        Stand = new JButton("Stand"); Stand.setSize(new Dimension(5,5));
        Play = new JButton("Play"); Stand.setSize(new Dimension(5,5));
        ScoreF = new JTextField(15); 
        CardF = new JTextField(15); 
        ResultF = new JTextField(15);

        ArrayList<Card> Cards = new ArrayList<Card>();
        JPanel Field, Buttons;

        Field = new JPanel();
        Field.setLayout(new FlowLayout());
        Field.add(ScoreF);
        Field.add(CardF);
        Field.add(ResultF);

        Buttons = new JPanel();
        Buttons.setLayout(new FlowLayout());
        Buttons.add(Hit);
        Buttons.add(Stand);
        Buttons.add(Play);

        Play(Hit, Stand, ScoreF, ResultF, CardF,Play);
        MainFrame.getContentPane().add(Field, BorderLayout.PAGE_START);
        MainFrame.getContentPane().add(Buttons, BorderLayout.CENTER);

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
        BlackJackPlayer app = new BlackJackPlayer();
    }

}
