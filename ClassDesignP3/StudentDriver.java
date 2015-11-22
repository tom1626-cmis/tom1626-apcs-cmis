import java.util.Scanner;
import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main(String args[])
    {
        Student Senior = new Student("Joe", "Senior", 18, true, 4.0,4.0,3.5,4.0,4.0);
        System.out.println(Senior);
        
        Senior.setGPA("Science", 4.0);
        
        System.out.println(Senior);

    }
}
