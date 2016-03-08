

public class MySong
{
    private String name;
    public int rating;
    MySong(String name, int rating)
    {
        this.name = name;
        this.rating = rating;
    }
    
    public String toString()
    {
        return "Name: " + name +"\nRating: " + rating + "\n\n";
    }
}
