import java.util.ArrayList;
public class apCompScience
{
    public static void main(String[] args)
    {
        Roster2 apCompScience = new Roster2();
        System.out.println(apCompScience);
        Student New = new Student("Student", "To Be Removed", (int)(Math.random()*5+13), true, Math.random()*4, Math.random()*4,Math.random()*4
        ,Math.random()*4,Math.random()*4);
        apCompScience.addStudent(New);
        System.out.println(apCompScience);
        apCompScience.dropStudent("To Be Removed");
        System.out.println(apCompScience);
    }
}
