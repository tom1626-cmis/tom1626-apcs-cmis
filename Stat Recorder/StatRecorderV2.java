import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StatRecorderV2
{
    StatRecorderV2()
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
        JButton Add, Clear, ClearAll;

        for(int i = 0; i <10; i++)
        {
            NumberL[i] = new JLabel("Number");
            OccurL[i] = new JLabel("Occur");
        }

        MainFrame = new JFrame("Number Plotting"); MainFrame.setSize(500,500);
        for ( int i = 0; i < 100; i++)
        {
            NumberJ[i] = new JTextField(5);
            NumberJ[i].setEnabled(false);
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
        Dimension d = new Dimension(5,1);
        Add = new JButton("Record"); Add.setSize(d);
        Clear = new JButton("Clear Input"); Clear.setSize(d);
        ClearAll = new JButton("Reset"); ClearAll.setSize(d);
        
         Action AddingAction = new AbstractAction()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    int IndexRecorded = 0;
                    for( int i = 0 ; i < 100; i++)
                    {
                        if ( NumberJ[i].getText().equals(""))
                        {
                        }
                        else
                        {
                            IndexRecorded++;
                        }
                    }
                    if( Input.getText().equals(""))
                    {
                    }
                    else
                    {
                        String inputS = Input.getText();
                        boolean newIndex = true;
                        for( int i = 0 ; i <100 ; i++)
                        {
                            if ( Index[i].equals(inputS))
                            {
                                Occur[i] += 1;
                                OccurJ[i].setText(String.valueOf(Occur[i]));
                                newIndex = false;
                            }
                        }
                        if (newIndex == true && IndexRecorded < 100)
                        {
                            Index[IndexRecorded] = inputS;
                            NumberJ[IndexRecorded].setText(inputS);
                            Occur[IndexRecorded] ++;
                            OccurJ[IndexRecorded].setText(String.valueOf(Occur[IndexRecorded]));
                            IndexRecorded += 1;
                        }
                        else if ( newIndex == true)
                        {
                            JOptionPane.showMessageDialog(null, "There's no more space!!");
                        }
                    }
                    Input.setText("");
                }
            };

        
        Add.addActionListener(AddingAction);
        Clear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Input.setText("");
                }
            });

       
        ClearAll.addActionListener(new 
            ActionListener()
            {   public void actionPerformed(ActionEvent e)
                {
                    for(int i = 0 ; i < 100 ; i++)
                    {
                        Index[i] = "";
                        Occur[i] = 0;
                        OccurJ[i].setText(String.valueOf(Occur[i]));
                        NumberJ[i].setText(Index[i]);
                    }

                }
            });     
        Input.addActionListener(AddingAction);
            
        BottomInput = new JPanel();
        BottomInput.setLayout( new FlowLayout());
        BottomInput.add(Input);
        BottomInput.add(Add);
        BottomInput.add(Clear);
        BottomInput.add(ClearAll);

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
        StatRecorderV2 app = new StatRecorderV2();
    }
}