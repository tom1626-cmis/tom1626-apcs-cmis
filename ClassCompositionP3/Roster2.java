import java.util.ArrayList;
public class Roster2
{
    ArrayList<Student>myStudents= new ArrayList<Student>();
    public Roster2()
    {
        addStudent(new Student("Student", String.valueOf(String.format("%.1f",(Math.random()*10))), (int)(Math.random()*5+13), RandomB(), Math.random()*4, Math.random()*4,Math.random()*4
            ,Math.random()*4,Math.random()*4));
        addStudent(new Student("Student", String.valueOf(String.format("%.1f",(Math.random()*10))), (int)(Math.random()*5+13), RandomB(), Math.random()*4, Math.random()*4,Math.random()*4
            ,Math.random()*4,Math.random()*4));
    }

    public void addStudent(Student New)
    {        
        myStudents.add(New);
    }

    private static boolean RandomB()
    {
        if (Math.random()>0.5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void dropStudent(String lastN)
    {
        for (int i = 0 ; i < myStudents.size() ; i++)
        {
            if (myStudents.get(i).Lname == lastN)
            {
                myStudents.remove(myStudents.get(i));
                break;
            }
        }
    }

    public String toString()
    {
        String output = new String();
        for(int i = 0 ; i < myStudents.size() ; i++)
        {
            output+= myStudents.get(i);
            output+= "\n -------------------\n";
        }
        output+= "\n -------------------\n";
        return output;

    }
}
