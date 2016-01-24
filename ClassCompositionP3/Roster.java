
public class Roster
{
    Student[] students = new Student[3];
    Roster()
    {
        students[0] = new Student("Student", "One", (int)(Math.random()*5+13), RandomB(), Math.random()*4, Math.random()*4,Math.random()*4
        ,Math.random()*4,Math.random()*4);         
        students[1] = new Student("Student", "Two", (int)(Math.random()*5+13), RandomB(), Math.random()*4, Math.random()*4,Math.random()*4
        ,Math.random()*4,Math.random()*4);         
        students[2] = new Student("Student", "Three", (int)(Math.random()*5+13), RandomB(), Math.random()*4, Math.random()*4,Math.random()*4
        ,Math.random()*4,Math.random()*4); 
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

    public Student findMaxGPA()
    {
        double maxGPA = 0;
        Student StudentMax = null;
        for(Student e: students)
        { 
            if (e.calcGPA()>maxGPA)
            {
                maxGPA = e.calcGPA();
                StudentMax = e;
            }

        }
        return StudentMax;
    }
    
    public String toString()
    {
        String output = "Students: \n\n" + students[0] + "\n\n"+students[1] + "\n\n"+students[2] + "\n\n"+ 
        "Student w/ highest GPA" + "\n\n"
        + findMaxGPA();
        return output;
    }
}
