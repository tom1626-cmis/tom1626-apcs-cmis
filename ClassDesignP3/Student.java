public class Student
{
    private String Fname;
    private String Lname;
    private int age;
    private boolean Boy;
    
    public Student()
    {
        Fname = "Pawat";
        Lname = "Rithipreedanant";
        age = 16;
        Boy = true;        
    }
    public Student(String Fname, String Lname, int age, boolean Boy)
    {
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.Boy = Boy;
    }
    public String toString()
    {
        String info = new String();
        info = "";
        if (Boy == true)
        {
            info = "Name :" + Fname + " " + Lname + "\n"
                + "Age :" + age + "\n"
                + "Gender: Male" + "\n"
                  ;
        }
        else
        {
            info = "Name :" + Fname + " " + Lname + "\n"
                + "Age :" + age + "\n"
                + "Gender: Female" ;
        }
        return info;
    }
}