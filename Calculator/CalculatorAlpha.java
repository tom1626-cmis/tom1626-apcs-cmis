import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorAlpha
{
    JFrame MainFrame;
    JButton Add, Minus,Multi, Div, One, Two, Three, Four, Five, Six, Seven
    , Eight, Nine, Zero, Clear, ClearResult, Negative;
    JTextField Result, IndexText;
    JPanel Panel, Panel1, Panel2, Panel3;
    int number = 0;
    int indexNumber = 0;
    CalculatorAlpha()
    {        
        MainFrame = new JFrame("Calculator");
        MainFrame.setSize(100,100);
        Dimension d = new Dimension(10,10);
        
        Add = new JButton("+"); Add.setSize(d);
        Minus = new JButton("-"); Minus.setSize(d);
        Multi = new JButton("x"); Multi.setSize(d);
        Div = new JButton("/"); Div.setSize(d);
        One = new JButton("1"); One.setSize(d);
        Two = new JButton("2"); Two.setSize(d);
        Three = new JButton("3"); Three.setSize(d);
        Four = new JButton("4"); Four.setSize(d);
        Five = new JButton("5"); Five.setSize(d);
        Six = new JButton("6"); Six.setSize(d);
        Seven = new JButton("7"); Seven.setSize(d);
        Eight = new JButton("8");Eight.setSize(d);
        Nine = new JButton("9"); Nine.setSize(d);
        Zero = new JButton("0"); Zero.setSize(d);
        Negative = new JButton("-") ; Negative.setSize(d);
        
        Clear = new JButton("C"); Clear.setSize(d);
        ClearResult = new JButton("AC"); ClearResult.setSize(d);

        Panel = new JPanel();
        Panel1 = new JPanel();
        Panel2 = new JPanel();
        Panel3 = new JPanel();
        Result = new JTextField(20);        
        IndexText = new JTextField(20);
        Add.setMnemonic(KeyEvent.VK_I);
        Add.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                number += indexNumber;
                Result.setText(String.valueOf(number));
                indexNumber = 0;
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Minus.setMnemonic(KeyEvent.VK_I);
        Minus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                number -=indexNumber;
                Result.setText(String.valueOf(number));
                indexNumber = 0;
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Multi.setMnemonic(KeyEvent.VK_I);
        Multi.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                number *=indexNumber;
                Result.setText(String.valueOf(number));
                indexNumber = 0;
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Div.setMnemonic(KeyEvent.VK_I);
        Div.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                number /=indexNumber;
                Result.setText(String.valueOf(number));
                indexNumber = 0;
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        One.setMnemonic(KeyEvent.VK_I);
        One.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "1");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Two.setMnemonic(KeyEvent.VK_I);
        Two.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "2");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });        
        Three.setMnemonic(KeyEvent.VK_I);
        Three.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "3");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Four.setMnemonic(KeyEvent.VK_I);
        Four.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "4");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Five.setMnemonic(KeyEvent.VK_I);
        Five.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "5");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Six.setMnemonic(KeyEvent.VK_I);
        Six.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "6");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Seven.setMnemonic(KeyEvent.VK_I);
        Seven.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "7");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Eight.setMnemonic(KeyEvent.VK_I);
        Eight.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "8");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Nine.setMnemonic(KeyEvent.VK_I);
        Nine.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "9");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Zero.setMnemonic(KeyEvent.VK_I);
        Zero.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = Integer.parseInt( String.valueOf(indexNumber) + "0");
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Negative.setMnemonic(KeyEvent.VK_I);
        Negative.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber *= -1;
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        Clear.setMnemonic(KeyEvent.VK_I);
        Clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                indexNumber = 0;
                IndexText.setText(String.valueOf(indexNumber));
            }
        });
        ClearResult.setMnemonic(KeyEvent.VK_I);
        ClearResult.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                number = 0;
                Result.setText(String.valueOf(number));
            }
        });
        Panel.setLayout(new FlowLayout());
        Panel.add(Result);
        Panel.add(ClearResult);
       
        Panel1.setLayout(new GridLayout(4,1));
        Panel1.add(Add);
        Panel1.add(Minus);
        Panel1.add(Multi);
        Panel1.add(Div);
        
        Panel2.setLayout(new GridLayout(4,3));
        Panel2.add(One);
        Panel2.add(Two);
        Panel2.add(Three);
        Panel2.add(Four);
        Panel2.add(Five);
        Panel2.add(Six);
        Panel2.add(Seven);
        Panel2.add(Eight);
        Panel2.add(Nine);
        Panel2.add(Zero);
        Panel2.add(Negative);
        
        Panel3.setLayout(new FlowLayout());
        Panel3.add(IndexText);
        Panel3.add(Clear);
        MainFrame.getContentPane().add(Panel, BorderLayout.PAGE_START);
        MainFrame.getContentPane().add(Panel1, BorderLayout.LINE_END);
        MainFrame.getContentPane().add(Panel2, BorderLayout.CENTER);
        MainFrame.getContentPane().add(Panel3, BorderLayout.PAGE_END);
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
        CalculatorAlpha app = new CalculatorAlpha();
    }
}
/* print("Hello!") PYTHON
 * 
 * public class Hello()
 * {
 *     public static void main(String args[])
 *     {
 *         System.out.print("Hello");
 *     }
 * } JAVA
 * 
 */