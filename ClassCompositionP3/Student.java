public class Student
{
    private String Fname;
    public String Lname;
    private int age;
    private boolean Boy;
    private double[] grades = new double[5];

    public Student()
    {
        Fname = "Pawat";
        Lname = "Rithipreedanant";
        age = 16;
        Boy = true;
        for( double e: grades)
        {
            e = 0.0;
        }
    }

    public Student(String Fname, String Lname, int age, boolean Boy, double Eng, double Math, double Sci
    , double FineArts, double SocialSci)
    {
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.Boy = Boy;
        grades[0] = Eng;
        grades[1] = Math;
        grades[2] = Sci;
        grades[3] = FineArts;
        grades[4] = SocialSci;
    }
    public double calcGPA()
    {
        double sum = 0;
        for ( double e: grades)
        {
            sum += e;
        }
        return sum/grades.length;
    }
    public void setGPA(String subject, double Grades)
    {
        if (subject.equals("English"))
        {
            grades[0] = Grades;
        }
        else if (subject.equals("Math"))
        {
            grades[1] = Grades;
        }
        else if (subject.equals("Science"))
        {
            grades[2] = Grades;
        }
        else if (subject.equals("Fine Arts"))
        {
            grades[3] = Grades;
        }
        else if (subject.equals("Social Sciences"))
        {
            grades[4] = Grades;
        }
        
    }
    public String toString()
    {
        String Gender;
        if (Boy == true)
        {
            Gender = "Male";
        }
        else
        {
            Gender = "Female";
        }
        String output = 
        "Name: " + Lname + ", " +Fname + "\n" +
        "Age: " + age + "\n" +
        "Gender: " + Gender + "\n" +
        "GRADES\n"+
        "English: " + String.format("%.2f",grades[0]) + "\n" +
        "Math: " + String.format("%.2f",grades[1]) + "\n" +
        "Science: " + String.format("%.2f",grades[2]) + "\n" +
        "Fine Arts: "+ String.format("%.2f",grades[3]) + "\n" +
        "Social Sciences: "+ String.format("%.2f",grades[4]) + "\n" +
        "Avg GPA: " + String.format("%.2f",calcGPA());
        return output;
    }
}