import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SquareNumber
{
    SquareNumber()
    {
        JTextField Right, Wrong, Number, Answer;
        JPanel RightWrongPanel, MainPanel;
        JFrame MainFrame;
        JLabel RightL, WrongL, NumberL, AnswerL;
        JButton Write = new JButton("Start/Answer");

        RightL = new JLabel(" Correct ");
        WrongL = new JLabel(" Incorrect ");
        NumberL = new JLabel(" Number ");
        AnswerL = new JLabel(" Answer ");

        Right = new JTextField(5); Right.setEnabled(false); Right.setDisabledTextColor(Color.BLACK);
        Wrong = new JTextField(5); Wrong.setEnabled(false); Wrong.setDisabledTextColor(Color.BLACK);
        Number = new JTextField(10); Number.setEnabled(false); Number.setDisabledTextColor(Color.BLACK);
        Answer = new JTextField(10);

        RightWrongPanel = new JPanel();
        RightWrongPanel.setLayout(new GridLayout(2,2));
        RightWrongPanel.add(RightL);
        RightWrongPanel.add(WrongL);
        RightWrongPanel.add(Right);
        RightWrongPanel.add(Wrong);

        MainFrame = new JFrame("Square Number");
        MainFrame.setLayout(new GridLayout (6,1));
        MainFrame.getContentPane().add(RightWrongPanel);
        MainFrame.getContentPane().add(NumberL);
        MainFrame.getContentPane().add(Number);
        MainFrame.getContentPane().add(AnswerL);
        MainFrame.getContentPane().add(Answer);
        MainFrame.getContentPane().add(Write);

        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);

        Right.setText("0");
        Wrong.setText("0");
        Number.setText(String.valueOf((int)(Math.random()*899 + 100)));
        Answer.setText("0");

        Action WritingAction = new AbstractAction()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    int right =Integer.parseInt( Right.getText());
                    int wrong = Integer.parseInt( Wrong.getText());

                    int answer = Integer.parseInt(Number.getText())*Integer.parseInt(Number.getText());

                    if (Integer.parseInt(Answer.getText()) == answer)
                    {
                        right += 1;
                        Right.setText(String.valueOf(right));
                        Answer.setText("0");
                    }
                    else
                    {
                        wrong += 1;
                        Wrong.setText(String.valueOf(wrong));
                        Answer.setText("0");
                    }
                    int number = (int)(Math.random()*899 + 100);
                    Number.setText(String.valueOf(number));
                }
            };
        Write.addActionListener(WritingAction); 
        Answer.addActionListener(WritingAction);
        
        

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
        SquareNumber app = new SquareNumber();
    }

}

