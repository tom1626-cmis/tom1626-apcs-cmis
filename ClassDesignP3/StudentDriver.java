import java.util.Scanner;
public class StudentDriver
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Student senior001 = new Student();
        System.out.println("First Name: ");
        String FN = input.nextLine();
        
        System.out.println("Last Name: ");
        String LN = input.nextLine();
        
        System.out.println("Age:");
        int age = input.nextInt();
        
        System.out.println("Boy?");
        boolean boy = input.nextBoolean();
        
        Student junior001 = new Student(FN,LN,age,boy);
        System.out.println("------------------");
        System.out.println(senior001);
        System.out.println(junior001);
    }
}
