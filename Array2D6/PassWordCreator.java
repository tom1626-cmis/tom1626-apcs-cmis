import javax.swing.*;
import java.lang.String;
public class PassWordCreator
{
    public static void main(String[] args)
    {
        String Lastname = JOptionPane.showInputDialog("Last name");
        String lastNameLowerCase = Lastname.toLowerCase();
        while(true)
        {
            String PassWord = JOptionPane.showInputDialog("Password");
            String PLowerCase = PassWord.toLowerCase();
            boolean valid = true;
            if(PLowerCase.equals(lastNameLowerCase))
            {
                JOptionPane.showMessageDialog(null, "Name not valid");
                valid = false;
            }
            for(int i = Lastname.length() ; i < PassWord.length()+1; i++)
            {
                if (PLowerCase.substring(i-Lastname.length(),i).equals(lastNameLowerCase))
                {
                    JOptionPane.showMessageDialog(null, "Name not valid");
                    valid = false;
                    break;
                }
            }
            if(valid == true)
            {
                System.out.print("Password successfully created.");
                break;
            }
        }
    }
}
