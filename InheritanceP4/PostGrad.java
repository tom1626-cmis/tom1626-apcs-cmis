public class PostGrad extends Student
{
    PostGrad(String name, String Major, int units)
    {
        this.FName = name;
        this.Major = Major;
        this.units = units;
    }
    
    public int calculateTuition()
    {
        return units*250;
    }
    
    public String toString()
    {
        return super.toString();
    }
}