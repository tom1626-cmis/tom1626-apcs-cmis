import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SongDriver
{
    public static void main (String args[])
    {
        Song[] Song = {new Song(),new Song("Lean On", "Major Lazer", "2015", 208)};

        JButton[] ChangeYear = new JButton[Song.length];
        JTextField[] SongText = new JTextField[Song.length];
        JTextField[] ComposerText = new JTextField[Song.length];
        JTextField[] YearText = new JTextField[Song.length];
        JTextField[] LengthText = new JTextField[Song.length];
        JLabel[] Labels = 
            {new JLabel("Song"), new JLabel("Composer"), new JLabel("Year"), 
                new JLabel("Length"), new JLabel("Modify")};

        JPanel SongP, ChangeYearP, ComposerP, YearP, LengthP;

        SongP = new JPanel(); SongP.setLayout(new GridLayout(Song.length +1,1)) ;
        SongP.add(Labels[0]);
        ComposerP = new JPanel(); ComposerP.setLayout(new GridLayout(Song.length +1,1));
        ComposerP.add(Labels[1]);
        ChangeYearP = new JPanel(); ChangeYearP.setLayout(new GridLayout(Song.length +1,1));
        ChangeYearP.add(Labels[4]);
        YearP = new JPanel();YearP.setLayout(new GridLayout(Song.length +1,1));
        YearP.add(Labels[2]);
        LengthP = new JPanel();LengthP.setLayout(new GridLayout(Song.length +1,1));
        LengthP.add(Labels[3]);

        for( int i = 0; i < Song.length;i++)
        {
            ChangeYear[i] = new JButton("Modify Year");

            SongText[i] = new JTextField(6); SongText[i].setText( Song[i].SongName);
            SongText[i].setEnabled(false); SongText[i].setDisabledTextColor(Color.BLACK);

            ComposerText[i] = new JTextField(6); ComposerText[i].setText( Song[i].Band);
            ComposerText[i].setEnabled(false); ComposerText[i].setDisabledTextColor(Color.BLACK);

            YearText[i] = new JTextField(6); YearText[i].setText( Song[i].getYearReleased());
            YearText[i].setEnabled(false); YearText[i].setDisabledTextColor(Color.BLACK);

            LengthText[i] = new JTextField(6); LengthText[i].setText( Song[i].minSec());
            LengthText[i].setEnabled(false);LengthText[i].setDisabledTextColor(Color.BLACK);

            ChangeYearP.add(ChangeYear[i]);
            SongP.add(SongText[i]);
            ComposerP.add(ComposerText[i]);
            YearP.add(YearText[i]);
            LengthP.add(LengthText[i]);

        }

        ChangeYear[0].addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent E)
                {

                    String UserName = "User";
                    int Password = 12345;
                    String UserInput= JOptionPane.showInputDialog("User Name:");
                    int PassInput = Integer.parseInt(JOptionPane.showInputDialog("Password:"));

                    if( UserName.equals(UserInput) && PassInput == Password) 
                    {
                        String Year= JOptionPane.showInputDialog("Change Year"); 
                        Song[0].setYearReleased(Year);
                        YearText[0].setText(Year);
                    }
                    else
                    {

                    }
                }
            });
        ChangeYear[1].addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent E)
                {

                    String UserName = "User";
                    int Password = 12345;
                    String UserInput= JOptionPane.showInputDialog("User Name:");
                    int PassInput = Integer.parseInt(JOptionPane.showInputDialog("Password:"));

                    if( UserName.equals(UserInput) && PassInput == Password) 
                    {
                        String Year= JOptionPane.showInputDialog("Change Year"); 
                        Song[1].setYearReleased(Year);
                        YearText[1].setText(Year);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Wrong Combination");
                    }
                }
            });
        JFrame MainFrame= new JFrame();

        MainFrame.setLayout(new FlowLayout());
        MainFrame.getContentPane().add(SongP);
        MainFrame.getContentPane().add(ComposerP);
        MainFrame.getContentPane().add(YearP);
        MainFrame.getContentPane().add(LengthP);
        MainFrame.getContentPane().add(ChangeYearP);

        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);
    }
}
