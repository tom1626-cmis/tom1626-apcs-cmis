import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StatRecorder
{
    StatRecorder()
    {
        String[] Index = new String[100];
        int[] Occur = new int[100];
        JFrame MainFrame;
        JTextField[] NumberJ = new JTextField[100];
        JTextField[] OccurJ = new JTextField[100];
        JTextField Input;
        JPanel[] Panel = new JPanel[10];
        JPanel BottomInput, NumberAndOccurPanel;
        JLabel[] NumberL = new JLabel[10];
        JLabel[] OccurL = new JLabel[10];
        JButton Add, Clear, ClearAll, Lock;

        for(int i = 0; i <10; i++)
        {
            NumberL[i] = new JLabel("Number");
            OccurL[i] = new JLabel("Occur");
        }

        MainFrame = new JFrame("Number Plotting"); MainFrame.setSize(500,500);
        for ( int i = 0; i < 100; i++)
        {
            NumberJ[i] = new JTextField(5);
            OccurJ[i] = new JTextField(5);
            OccurJ[i].setEnabled(false);
            Index[i] = "";
            NumberJ[i].setText(Index[i]);
            Occur[i] = 0;
            OccurJ[i].setText(String.valueOf(Occur[i]));
        }
        for(int i = 0; i < 10 ; i++)
        {
            Panel[i] = new JPanel();
            Panel[i].setLayout(new GridLayout(11,2));
            Panel[i].add(NumberL[i]);Panel[i].add(OccurL[i]);
        }
        for ( int i = 0; i < 10; i++)
        {
            Panel[0].add(NumberJ[i]);    Panel[0].add(OccurJ[i]);
            Panel[1].add(NumberJ[i+10]); Panel[1].add(OccurJ[i+10]);
            Panel[2].add(NumberJ[i+20]); Panel[2].add(OccurJ[i+20]);
            Panel[3].add(NumberJ[i+30]); Panel[3].add(OccurJ[i+30]);
            Panel[4].add(NumberJ[i+40]); Panel[4].add(OccurJ[i+40]);
            Panel[5].add(NumberJ[i+50]); Panel[5].add(OccurJ[i+50]);
            Panel[6].add(NumberJ[i+60]); Panel[6].add(OccurJ[i+60]);
            Panel[7].add(NumberJ[i+70]); Panel[7].add(OccurJ[i+70]);
            Panel[8].add(NumberJ[i+80]); Panel[8].add(OccurJ[i+80]);
            Panel[9].add(NumberJ[i+90]); Panel[9].add(OccurJ[i+90]);
        }
        NumberAndOccurPanel = new JPanel();
        NumberAndOccurPanel.setLayout(new FlowLayout());
        for(int i = 0; i < 10 ; i++)
        {
            NumberAndOccurPanel.add(Panel[i]);
        }
        // Number + Occur Panel and Formatting
        Input = new JTextField(85);
        Input.setEnabled(false);
        Dimension d = new Dimension(5,1);
        Add = new JButton("Record"); Add.setSize(d);
        Clear = new JButton("Clear Input"); Clear.setSize(d);
        ClearAll = new JButton("Reset"); ClearAll.setSize(d);
        Lock = new JButton("Lock"); Lock.setSize(d);

        Add.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if( Input.getText().equals(""))
                    {
                    }
                    else
                    {
                        String inputS = Input.getText();
                        for( int i = 0 ; i <100 ; i++)
                        {
                            if ( Index[i].equals(inputS))
                            {
                                Occur[i] += 1;
                                OccurJ[i].setText(String.valueOf(Occur[i]));
                            }
                        }
                        Input.setText("");
                    }
                }
            });
        Clear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Input.setText("");
                }
            });
        ClearAll.addActionListener(new ActionListener()
            {   public void actionPerformed(ActionEvent e)
                {
                    for(int i = 0 ; i < 100 ; i++)
                    {
                        Index[i] = "";
                        Occur[i] = 0;
                        OccurJ[i].setText(String.valueOf(Occur[i]));
                        NumberJ[i].setText(Index[i]);
                        NumberJ[i].setEnabled(true);
                    }
                    Lock.setEnabled(true);
                }
            });     
        Lock.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Lock.setEnabled(false);
                    for(int i = 0 ; i < 100; i++)
                    {
                        NumberJ[i].setEnabled(false);
                        Index[i] = NumberJ[i].getText();
                    }
                    Clear.setEnabled(true);
                    Add.setEnabled(true);
                    Input.setEnabled(true);
                }
            });

        BottomInput = new JPanel();
        BottomInput.setLayout( new FlowLayout());
        BottomInput.add(Input);
        BottomInput.add(Add);
        BottomInput.add(Clear);
        BottomInput.add(ClearAll);
        BottomInput.add(Lock);

        MainFrame.getContentPane().add(NumberAndOccurPanel, BorderLayout.CENTER);
        MainFrame.getContentPane().add(BottomInput, BorderLayout.PAGE_END);

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
        StatRecorder app = new StatRecorder();
    }
}
/*how it works
 *    Number     Occurences | Number Occur | Number Occur
 *      1            []     |  11     []   |   91     []
 *      2            []     |  12     []   |   92     []
 *      10           []     |  20     []   |   100    []
 *              Type in an integer from 0-100 []
 *     ///////////////////////////
 *     for setting Jpanel:
 *     
 *     set grid layout for each column        }  BorderLayout Center for all of this
 *     flow layout to combine all the column  } 
 *     
 *     Borderlayout Page end for bottominput
 *     ///////////////////////////
 *     set readonly textfield name.setEditable(false);
 */