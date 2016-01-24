public class Song
{
    private String name;
    private int length;
    private String Composer;
    public Song(String name, int length, String Composer)
    {
        this.name = name;
        this.length = length;
        this.Composer = Composer;
    }
    public String toString()
    {
        String output = "Name: " + name + "\n" +
        "Length: " + length/60 +":"+ length %60 + "\n" +
        "Composer: " + Composer + "\n";
        return output;
    }
}