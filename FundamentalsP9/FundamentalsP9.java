
import java.util.Scanner;
public class FundamentalsP9
{
    public static void main( String args[])
    {
        String username, userInput;
        int password, passInput;
        Scanner input = new Scanner (System.in);

        username = "U";
        password = 123456789;
        int i = 0;
        int x = 0;
        while(x == 0)
        {
            while(i == 0)
            {
                System.out.println("Input Username:");
                userInput = input.nextLine();
                if (userInput.equals(username))
                {
                    i++;
                } //end of breaking loop
                else
                {
                    System.out.println("Wrong Login Username.");
                } // continue loop
            } // end of username loop

            System.out.println("Input Password:");
            passInput = input.nextInt();
            if(  password == passInput)
            {
                System.out.print("Login Successful.");
                x++;
            } //end of password loop
            else
            {
                System.out.println("Login Unsuccessful, please try again.");
                i--;
            } // continue loop and resetting username loop
        } // end of whole loop

    } //end of method
}// end of class
