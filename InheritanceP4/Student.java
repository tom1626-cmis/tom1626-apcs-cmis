
public abstract class Student
{
    String FName;
    String Major;
    int units;
    abstract public int calculateTuition();

    public String toString()
    {
        return FName + "\t"+ getClass().getSimpleName()+ "\t" + Major + "\t" + calculateTuition(); 
    }
}
