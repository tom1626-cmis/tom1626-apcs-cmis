public class YourObject
{
    private String Name;
    private int GPM;
    private double Rating;
    
    public YourObject()
    {
        Name = "Puppey";
        GPM = 348;
        Rating = 98.9;
    }
    public YourObject(String Name, int GPM, double Rating)
    {
        this.Name = Name;
        this.GPM = GPM;
        this.Rating = Rating;
    }
    public String toString()
    {
        String output = "Name: " + Name + "\n"
        + "Average GPM: " + GPM + "\n"
        + "Overall Rating: " + Rating;
        return output;
    }
}
